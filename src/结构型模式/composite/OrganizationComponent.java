package 结构型模式.composite;

//可以是接口、抽象类
public abstract class OrganizationComponent {
	private String name;// 名字
	private String description;// 描述

	protected void add(OrganizationComponent oComponent) {
		// 默认实现
		throw new UnsupportedOperationException();
	}

	protected void remove(OrganizationComponent oComponent) {
		// 默认实现
		throw new UnsupportedOperationException();
	}

	// 构造器
	public OrganizationComponent(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// 方法print，做成抽象方法，子类都需要实现
	protected abstract void print();

}
