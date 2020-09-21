package 结构型模式.composite;

public class Department extends OrganizationComponent {

	// 没有集合

	public Department(String name, String description) {
		super(name, description);
		// TODO Auto-generated constructor stub
	}
	// add , remove 就不需要，因为他是叶子节点。

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return super.getDescription();
	}

	@Override
	protected void print() {
		// TODO Auto-generated method stub
		System.out.println(getName());// 所在系名称
	}

}
