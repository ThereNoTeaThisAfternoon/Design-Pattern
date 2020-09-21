package 行为型模式.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    //在这个List中，集合中有很多备忘录对象
    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento memento) {
        mementos.add(memento);
    }

    //获取到第index个 Originator 的备忘录对象，即原来保存的状态
    public Memento get(int index) {
        return mementos.get(index);
    }

}
