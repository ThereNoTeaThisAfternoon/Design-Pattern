package 行为型模式.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator {
    //信息工程学院是以List方式存放系
    List<Department> departments;
    int index = -1;//索引

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    //判断列表中还有没有下一个元素
    @Override
    public boolean hasNext() {
        if (index >= departments.size() - 1)
            return false;
        else {
            ++index;
            return true;
        }
    }

    @Override
    public Object next() {
        return departments.get(index);
    }

    //删除方法默认空实现
    @Override
    public void remove() {

    }
}
