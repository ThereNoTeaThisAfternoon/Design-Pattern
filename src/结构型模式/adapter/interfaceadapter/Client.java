package 结构型模式.adapter.interfaceadapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbsAdapter absAdapter = new AbsAdapter() {
			// 只需要去覆盖我们 需要使用的接口方法
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				System.out.println("使用了 m1 的方法。。。");
			}
		};
		absAdapter.m1();
		
		new InterfaceA() {
			
			public void m4() {
				// TODO Auto-generated method stub
				
			}
			
			public void m3() {
				// TODO Auto-generated method stub
				
			}
			
			public void m2() {
				// TODO Auto-generated method stub
				
			}
			
			public void m1() {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
