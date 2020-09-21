package 行为型模式.memento;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("状态1：攻击力 100");
        //保存了当前状态
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态2：攻击力 80");
        caretaker.add(originator.saveStateMemento());
        originator.setState("状态3：攻击力 50");
        caretaker.add(originator.saveStateMemento());

        System.out.println("当前状态是" + originator.getState());
        //得到状态1，将originator 恢复到状态1
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("恢复状态，当前状态是" + originator.getState());

    }
}
