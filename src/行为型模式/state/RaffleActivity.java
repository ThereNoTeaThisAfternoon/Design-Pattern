package 行为型模式.state;

public class RaffleActivity {
    //state 表示活动的当前状态，是变化的
    State state = null;
    //表示奖品数量，可初始化
    int count;
    //四个属性表示四种状态
    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseState = new DispenseState(this);
    State dispenseOutState = new DispenseOutState(this);

    //构造器，初始化奖品数量，和当前状态为 noRaffleState不能抽奖状态
    public RaffleActivity(int count) {
        this.count = count;
        this.state = getNoRaffleState();
    }

    //扣分，调用当前状态的 deductMoney
    public void deductMoney() {
        state.deductMoney();
    }

    //抽奖
    public void raffle() {
        //倮当前状态抽奖成功，我们就去领取奖品
        if (state.raffle())
            //领奖
            state.dispensePrize();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count--;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }

}
