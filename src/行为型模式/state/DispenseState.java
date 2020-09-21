package 行为型模式.state;

/**
 * 发放奖品的状态
 */
public class DispenseState implements State {
    RaffleActivity raffleActivity;

    public DispenseState(RaffleActivity raffleActivity) {
        this.raffleActivity = raffleActivity;
    }

    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    //发放奖品
    @Override
    public void dispensePrize() {
        if (raffleActivity.getCount() > 0) {
            System.out.println("恭喜中奖了");
            //改变状态为不能抽奖
            raffleActivity.setState(raffleActivity.getNoRaffleState());
        } else {
            System.out.println("很遗憾，奖品发送完毕");
            //改变状态为奖品发放完毕，后面我们不可以再抽奖
            raffleActivity.setState(raffleActivity.getDispenseOutState());
        }
    }
}
