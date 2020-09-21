package jkdSrc;

import java.util.Arrays;
import java.util.Comparator;

public class Strategy {
    public static void main(String[] args) {
        Integer[] data = {9, 1, 4, 5, 8, 3};
        //实现升序排序，返回-1放左边，返回1放右边。
        //实现Comparator接口（策略接口）
        //对象new Compa。。。 实现了 策略接口的对象
        //compare 指定具体的处理方式 behavior
        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2)
                    return -1;
                else
                    return 1;
            }
        };
        /*
        public static <T> void sort(T[] a, Comparator<? super T> c) {//通过不同形式使用策略对象
            if (c == null) {
                sort(a);//默认方式
            } else {
                if (LegacyMergeSort.userRequested)
                    legacyMergeSort(a, c);//使用策略对象c
                else
                    //使用策略对象c
                    TimSort.sort(a, 0, a.length, c, null, 0, 0);
            }
         }
         */
        //方式1
        Arrays.sort(data, comparator);
        System.out.println(Arrays.toString(data));//降序排列
        //方式2 通过 lambda表达式
        Integer[] data2 = {1, 44, 9, 1, 4, 5, 8, 3};
        Arrays.sort(data2, (a, b) -> {
            if (a.compareTo(b) > 0)
                return 1;
            else
                return -1;
        });
        Arrays.stream(data2).forEach(integer -> System.out.print(integer + " "));
    }
}
