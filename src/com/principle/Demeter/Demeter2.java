package com.principle.Demeter;

import java.util.ArrayList;
import java.util.List;

public class Demeter2 {

	public static void main(String[] args) {
		//使用迪米特法则
		// TODO Auto-generated method stub
		SchoolManager2 schoolManager2 = new SchoolManager2();
		schoolManager2.printAllEmployee(new CollegeManager2());
	}

}

//学校总部雇员类
class Employee2 {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}

//学院雇员类
class CollegeEmployee2 {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}

//管理学院员工的管理类
class CollegeManager2 {
	// 返回学院的所有员工
	private List<CollegeEmployee2> getAllEmployee() {
		List<CollegeEmployee2> list = new ArrayList();
		for (int i = 0; i < 10; i++) {// 增加了10个员工
			CollegeEmployee2 emp = new CollegeEmployee2();
			emp.setId("学院雇员id=" + i);
			list.add(emp);
		}
		return list;
	}
	//输出学院员工的信息
	public void printEmployee() {
		List<CollegeEmployee2> list1 = getAllEmployee();
		System.out.println("--------------学院员工-----------");
		for (CollegeEmployee2 e : list1)
			System.out.println(e.getId());
	}
}

//学校总部的管理类

/*
* 直接朋友：Employee、CollegeManager
* 
*不是直接朋友：CollegeEmployee，是一个陌生类，违背迪米特法则
* */


class SchoolManager2 {
	// 总部员工
	public List<Employee2> getAllEmployee() {
		List<Employee2> list = new ArrayList();
		for (int i = 0; i < 5; i++) {// 增加5个员工
			Employee2 emp = new Employee2();
			emp.setId("学院雇员id=" + i);
			list.add(emp);
		}
		return list;
	}

	// 该方法完成输出学校总部和学院员工信息（id）
	void printAllEmployee(CollegeManager2 sub) {
		
		//分析问题
		//1、将输出学院员工的方法，封装到CollegeManager
		sub.printEmployee();

		//获取学校总部员工
		List<Employee2> list2 = this.getAllEmployee();
		System.out.println("-------------学校总部员工------------");
		for (Employee2 e : list2)
			System.out.println(e.getId());
	}
}
