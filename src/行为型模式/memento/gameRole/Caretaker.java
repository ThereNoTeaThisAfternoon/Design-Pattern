package 行为型模式.memento.gameRole;

import java.util.ArrayList;
import java.util.HashMap;

//守护者对象，保存这个游戏角色的状态
public class Caretaker {
    //如果只保存一次状态
    private Memento memento;
    //对 GameRole 保存多次对象
    private ArrayList<Memento> mementos;
    //对多个游戏角色保存多个状态
    private HashMap<String, ArrayList<Memento>> rolesMementos;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
