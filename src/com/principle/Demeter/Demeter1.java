package com.principle.Demeter;

import java.util.*;

//客户端
public class Demeter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个SchoolManager 对象
		SchoolManager schoolManager = new SchoolManager();
		//输出学院员工id 和 学校总部员工信息
		schoolManager.printAllEmployee(new CollegeManager());
	}

}

//学校总部雇员类
class Employee {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}

//学院雇员类
class CollegeEmployee {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}

//管理学院员工的管理类
class CollegeManager {
	// 返回学院的所有员工
	public List<CollegeEmployee> getAllEmployee() {
		List<CollegeEmployee> list = new ArrayList();
		for (int i = 0; i < 10; i++) {// 增加了10个员工
			CollegeEmployee emp = new CollegeEmployee();
			emp.setId("学院雇员id=" + i);
			list.add(emp);
		}
		return list;
	}
}

//学校总部的管理类

/*
 * 直接朋友：Employee、CollegeManager
 * 
 *不是直接朋友：CollegeEmployee，是一个陌生类，违背迪米特法则
 * */


class SchoolManager {
	// 总部员工
	public List<Employee> getAllEmployee() {
		List<Employee> list = new ArrayList();
		for (int i = 0; i < 5; i++) {// 增加5个员工
			Employee emp = new Employee();
			emp.setId("学院雇员id=" + i);
			list.add(emp);
		}
		return list;
	}

	// 该方法完成输出学校总部和学院员工信息（id）
	void printAllEmployee(CollegeManager sub) {
		
		//问题
		//1、这里的CollegeEmployee 不是 SchoolManager的直接朋友
		//2、CollegeEmployee 是以局部变量的方式出现
		//3、违反了迪米特法则
		
		
		List<CollegeEmployee> list1 = sub.getAllEmployee();
		System.out.println("--------------学院员工-----------");
		for (CollegeEmployee e : list1)
			System.out.println(e.getId());
		List<Employee> list2 = this.getAllEmployee();
		System.out.println("-------------学校总部员工------------");
		for (Employee e : list2)
			System.out.println(e.getId());
	}
}
