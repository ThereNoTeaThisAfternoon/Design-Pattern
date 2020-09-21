package com.principle.ocp;

public class OpenClosePrinciple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GraphicEditor graphicEditor = new GraphicEditor();
		graphicEditor.drawShape(new Rectangle());
		graphicEditor.drawShape(new Circle());
		graphicEditor.drawShape(new Triangle());
		
	}

}
/**
 * 扩展开放【提供方】，修改关闭【使用方】
 * @author しゅうはく
 *
 */

//这是一个用于绘图的类【使用方】
class GraphicEditor {
	// 接收Shape对象，然后根据type，绘制不同的图形
	public void drawShape(Shape s) {
		if (s.m_type == 1)
			drawRectangle(s);
		else if (s.m_type == 2)
			drawCircle(s);
		else if(s.m_type == 3)
			drawTriangle(s);
	}
	
	private void drawRectangle(Shape s) {
		System.out.println("绘制矩形");
	}

	private void drawCircle(Shape s) {
		System.out.println("绘制圆形");
	}
	private void drawTriangle(Shape s) {
		System.out.println("绘制三角形");
	}
}

//Shape类，基类
class Shape {
	int m_type;
}
//子类1
class Rectangle extends Shape {
	public Rectangle() {
		// TODO Auto-generated constructor stub
		super.m_type = 1;
	}
}
//子类2
class Circle extends Shape {
	public Circle() {
		// TODO Auto-generated constructor stub
		super.m_type = 2;
	}
}
//新增画三角形
class Triangle extends Shape{
	public Triangle() {
		// TODO Auto-generated constructor stub
		super.m_type = 3;
	}
}










