package 行为型模式.state;

/**
 * 奖品发放完毕
 * 当我们的 raffleActivity 变成了 DispenseOutState，抽奖活动结束
 */
public class DispenseOutState implements State {
    RaffleActivity raffleActivity;

    public DispenseOutState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品发放完毕，请下次参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发放完毕，请下次参加");
        System.exit(0);
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发放完毕，请下次参加");
    }
}
