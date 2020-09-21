package 行为型模式.memento.gameRole;

public class GameRole {
    private int vit;
    private int def;

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    //创建一个 Memento，根据当前的状态得到Memento
    public Memento createMemento() {
        return new Memento(vit, def);
    }

    //从备忘录对象，恢复GameRole的状态
    public void recoverGameRoleFromMemento(Memento memento) {
        this.vit = memento.getVio();
        this.def = memento.getDef();
    }

    //显示当前游戏角色的状态
    public void display() {
        System.out.printf("游戏角色当前的攻击力为%d\t防御力为%d\n", vit, def);
    }


}
