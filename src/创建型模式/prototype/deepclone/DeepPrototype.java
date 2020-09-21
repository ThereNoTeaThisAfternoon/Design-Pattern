package 创建型模式.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepPrototype implements Serializable, Cloneable {
	public String name;// String 属性
	public DeepCloneableTarget deepC;// 引用类型

	public DeepPrototype() {
		super();
	}

	// 深拷贝 - 方式一 重写clone()
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Object deep = null;
		// 完成对基本数据类型（属性）和String的克隆
		deep = super.clone();
		// 对引用类型的属性进行单独处理
		DeepPrototype deepPrototype = (DeepPrototype) deep;

		deepPrototype.deepC = (DeepCloneableTarget) deepC.clone();

		return deepPrototype;
	}

	// 深拷贝 - 方式二 通过对象的序列化实现（推荐）
	public Object deepClone() {
		// 创建流对象
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bais = null;
		ObjectInputStream ois = null;
		try {
			// 序列化
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);// 当前对象以对象流方式输出

			// 反序列化
			bais = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bais);
			DeepPrototype copyObj = (DeepPrototype) ois.readObject();
			return copyObj;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		} finally {
			// 关闭流
			try {
				bos.close();
				oos.close();
				bais.close();
				ois.close();
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.getMessage());
			}
		}
	}

}
