package 行为型模式.chainOfResponsibility;

public class Client {
    public static void main(String[] args) {
        //创建一个请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1, 12000);
        //创建相关审批人
        DepartmentApprove departmentApprove = new DepartmentApprove("狗主任");
        CollegeApprove collegeApprove = new CollegeApprove("狗院长");
        VIceSchoolMasterApprove vIceSchoolMasterApprove = new VIceSchoolMasterApprove("狗副校长");
        SchoolMasterApprove schoolMasterApprove = new SchoolMasterApprove("狗校长");
        //将各个审批级别的下一个设置好，让处理人构成一个环形
        departmentApprove.setApprove(collegeApprove);
        collegeApprove.setApprove(vIceSchoolMasterApprove);
        vIceSchoolMasterApprove.setApprove(schoolMasterApprove);
        schoolMasterApprove.setApprove(departmentApprove);

        schoolMasterApprove.processRequest(purchaseRequest);
    }
}
