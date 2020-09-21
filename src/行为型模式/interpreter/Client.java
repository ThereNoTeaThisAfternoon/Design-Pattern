package 行为型模式.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Client {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        String expStr = getExpStr();
        HashMap<String, Integer> var = getValue(expStr);// var {a=10,b=20}
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果：" + expStr + " = " + calculator.run(var));
    }

    //获得表达式
    public static String getExpStr() throws IOException {
        System.out.println("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    //获得映射值
    public static HashMap<String, Integer> getValue(String expStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        for (char ch : expStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                if (!map.containsKey(String.valueOf(ch))) {
                    System.out.println("请输入" + ch + "的值");
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch), Integer.parseInt(String.valueOf(in)));
                }
            }
        }
        return map;
    }
}
