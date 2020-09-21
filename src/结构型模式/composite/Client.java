package 结构型模式.composite;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 从大到小创建对象，学校
		OrganizationComponent university = new University("大大大大学", "中国大大大学");
		// 学院
		OrganizationComponent computerCollege = new College("计算机学院", "计算机学院");
		OrganizationComponent infoEngineerCollege = new College("信息工程学院", "信息工程学院");
		// 创建各个学院下面的系（专业）
		computerCollege.add(new Department("软件工程", "软件工程可以"));
		computerCollege.add(new Department("网络工程", "网络工程可以"));
		computerCollege.add(new Department("计算机科学与技术", "计算机科学与技术"));
		infoEngineerCollege.add(new Department("通信工程", "通信工程可以"));
		infoEngineerCollege.add(new Department("信息工程", "信息工程可以"));

		// 将两个学院加入到学校中
		university.add(computerCollege);
		university.add(infoEngineerCollege);

		// 输出整个学校
		// university.print();
		// computerCollege.print();
		infoEngineerCollege.print();
	}

}
