package 行为型模式.memento.gameRole;

public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);
        System.out.println("和Boss大战前的状态为");
        gameRole.display();

        //保存当前状态，然后更新
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.createMemento());
        gameRole.setVit(50);
        gameRole.setDef(50);
        System.out.println("和Boss大战后的状态为");
        gameRole.display();

        //恢复状态
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        System.out.println("恢复后的状态为");
        gameRole.display();
    }
}
