package 行为型模式.chainOfResponsibility;

public class DepartmentApprove extends Approve {

    public DepartmentApprove(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getPrice()<=5000)
            System.out.println("请求编号id："+request.getId()+" 被 "+this.name+" 处理");
        else
            approve.processRequest(request);
    }
}
