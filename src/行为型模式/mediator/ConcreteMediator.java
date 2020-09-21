package 行为型模式.mediator;

import java.util.HashMap;

//具体的中介者类
public class ConcreteMediator extends Mediator {
    //放入所有的同事对象
    private HashMap<String, Colleague> colleagueMap;
    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        this.colleagueMap = new HashMap<>();
        this.interMap = new HashMap<>();
    }

    @Override
    public void Register(String colleagueName, Colleague colleague) {
        colleagueMap.put(colleagueName, colleague);
        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            interMap.put("TV", colleagueName);
        } else if (colleague instanceof Curtains) {
            interMap.put("Curtains", colleagueName);
        }
    }

    //具体的中介者的核心方法，
    //根据得到的消息完成对应的任务
    //中介者在这个方法中，协调各个具体的同事对象，完成具体的任务
    @Override
    public void getMessage(int stateChange, String colleagueName) {
        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine) (colleagueMap.get(interMap.get("CoffeeMachine")))).startCoffee();
                ((TV) (colleagueMap.get(interMap.get("TV")))).startTV();
            } else if (stateChange == 1)
                ((TV) (colleagueMap.get(interMap.get("TV")))).stopTV();
        } else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            ((Curtains) (colleagueMap.get(interMap.get("Curtains")))).upCurtains();
        } else if (colleagueMap.get(colleagueName) instanceof TV) {
            //如果TV发起消息
        } else if (colleagueMap.get(colleagueName) instanceof Curtains) {
            //如果是以窗帘发起消息
        }
    }

    @Override
    public void sendMessage() {

    }
}
