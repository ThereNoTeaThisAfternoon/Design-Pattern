package 行为型模式.visitor;

public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给该歌手的评价是失败。。。");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给该歌手的评价是失败。。。");
    }
}
