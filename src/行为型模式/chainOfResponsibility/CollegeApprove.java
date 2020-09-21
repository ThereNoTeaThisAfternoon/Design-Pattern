package 行为型模式.chainOfResponsibility;

public class CollegeApprove extends Approve {

    public CollegeApprove(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (5000 < request.getPrice() && request.getPrice() <= 10000)
            System.out.println("请求编号id：" + request.getId() + " 被 " + this.name + " 处理");
        else
            approve.processRequest(request);
    }
}
