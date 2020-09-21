package 行为型模式.memento.gameRole;

public class Memento {
    //攻击力
    private int vio;
    //防御力
    private int def;

    public Memento(int vio, int def) {
        this.vio = vio;
        this.def = def;
    }

    public int getVio() {
        return vio;
    }

    public void setVio(int vio) {
        this.vio = vio;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
