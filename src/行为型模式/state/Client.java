package 行为型模式.state;

public class Client {
    public static void main(String[] args) {
        //创建一个活动对象，奖品有一个
        RaffleActivity raffleActivity = new RaffleActivity(1);
        //连续抽奖300次
        for (int i = 0; i < 300; i++) {
            System.out.println("---------第 " + (i + 1) + " 次抽奖---------");
            //参加抽奖，第一步点击扣分
            raffleActivity.deductMoney();
            //第二步抽奖
            raffleActivity.raffle();
        }
    }
}
