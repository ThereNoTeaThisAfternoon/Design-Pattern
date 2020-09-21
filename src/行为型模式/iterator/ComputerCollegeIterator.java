package 行为型模式.iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {
    //这里我们需要知道Department是以怎样的方式存放
    Department[] departments;
    int position = 0;//遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        //position未越界且数组中该位置有值
        return position < departments.length && departments[position] != null;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        ++position;
        return department;
    }

    //删除方法默认空实现
    @Override
    public void remove() {

    }
}
