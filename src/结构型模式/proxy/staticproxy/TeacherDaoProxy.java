package 结构型模式.proxy.staticproxy;

//静态代理对象
public class TeacherDaoProxy implements ITeacherDao {

	private ITeacherDao target;// 目标对象通过接口来聚合
	// 构造器

	public TeacherDaoProxy(ITeacherDao target) {
		this.target = target;
	}

	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("开始代理，完成某些操作。。。");
		target.teach();
		System.out.println("提交。。。");
	}

}
