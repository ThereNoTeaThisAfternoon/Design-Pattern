package 行为型模式.memento;

public class Originator {
    private String state;//状态信息

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //编写一个方法，可以保存一个状态对象 Memento
    //返回Memento
    public Memento saveStateMemento() {
        return new Memento(state);
    }

    //通过备忘录对象，恢复对象
    public void getStateFromMemento(Memento memento) {
        this.state = memento.getState();
    }

}
