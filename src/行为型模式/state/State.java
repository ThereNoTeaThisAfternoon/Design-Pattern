package 行为型模式.state;

/**
 * 状态接口
 */
public interface State {
    //扣除积分 -50
    void deductMoney();

    //是否抽中奖品
    boolean raffle();

    //发放奖品
    void dispensePrize();
}
