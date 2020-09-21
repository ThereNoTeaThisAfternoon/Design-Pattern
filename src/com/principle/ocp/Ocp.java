package com.principle.ocp;

public class Ocp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphicEditor2 graphicEditor = new GraphicEditor2();
		graphicEditor.drawShape(new Rectangle2());
		graphicEditor.drawShape(new Circle2());
		graphicEditor.drawShape(new Triangle2());
		graphicEditor.drawShape(new OtherGraphic());
	}

}
/**
 * 扩展开放【提供方】，修改关闭【使用方】
 * @author しゅうはく
 *
 */

//这是一个用于绘图的类【使用方】
class GraphicEditor2 {
	// 接收Shape对象，调用drap方法即可
	public void drawShape(Shape2 s) {
		s.draw();
	}
}

//Shape类，基类
abstract class Shape2 {
	int m_type;

	public abstract void draw();// 抽象方法
}

//子类1
class Rectangle2 extends Shape2 {
	public Rectangle2() {
		// TODO Auto-generated constructor stub
		super.m_type = 1;
	}

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("绘制矩形");
	}
}

//子类2
class Circle2 extends Shape2 {
	public Circle2() {
		// TODO Auto-generated constructor stub
		super.m_type = 2;
	}

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("绘制圆形");
	}
}

//新增画三角形
class Triangle2 extends Shape2 {
	public Triangle2() {
		// TODO Auto-generated constructor stub
		super.m_type = 3;
	}

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("绘制三角形");
	}
}

//新增一个图形
class OtherGraphic extends Shape2 {
	public OtherGraphic() {
		// TODO Auto-generated constructor stub
		super.m_type = 4;
	}

	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("绘制其他图形");
	}

}
