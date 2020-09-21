package 行为型模式.chainOfResponsibility;

public class SchoolMasterApprove extends Approve {

    public SchoolMasterApprove(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (30000 < request.getPrice())
            System.out.println("请求编号id：" + request.getId() + " 被 " + this.name + " 处理");
        else
            approve.processRequest(request);
    }
}
