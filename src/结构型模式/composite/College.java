package 结构型模式.composite;

import java.util.ArrayList;

public class College extends OrganizationComponent {
	// List中存放的是Department
	ArrayList<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

	// 构造器
	public College(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}

	// 重写 add
	@Override
	protected void add(OrganizationComponent oComponent) {
		// TODO Auto-generated method stub
		// 将来实际业务中，College的add方法 和 University的add 不一定完全相同。
		organizationComponents.add(oComponent);
	}

	// 重写 remove
	@Override
	protected void remove(OrganizationComponent oComponent) {
		// TODO Auto-generated method stub
		organizationComponents.remove(oComponent);
	}

	// 重写 getName
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	// 重写 getDescription
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription();
	}

	// 输出 University 包含的学院
	@Override
	protected void print() {
		// TODO Auto-generated method stub
		System.out.println("------------" + getName() + "-------------");
		// 遍历organizationComponents
		for (OrganizationComponent oComponent : organizationComponents)
			oComponent.print();
	}

}
