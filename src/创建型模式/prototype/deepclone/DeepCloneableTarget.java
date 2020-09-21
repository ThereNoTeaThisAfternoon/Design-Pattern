package 创建型模式.prototype.deepclone;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable, Cloneable {
	private static final long serialVersionUID = 1L;

	private String cloneName;
	private String cloneClass;

	// 构造器
	public DeepCloneableTarget(String cloneName, String cloneClass) {
		this.cloneName = cloneName;
		this.cloneClass = cloneClass;
	}

	// 该类的属性都是String，这里使用默认的clone方法完成即可
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Object deep = null;
		deep = super.clone();
		DeepCloneableTarget dTarget = (DeepCloneableTarget) deep;

		return dTarget;
	}

}
