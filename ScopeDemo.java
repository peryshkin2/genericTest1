package test1;
public class ScopeDemo {
	private int no = 10;
	private static String name ="Ram";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(no);
		new ScopeDemo().showName();
	}

	public void showName() {
		System.out.println(name);
	}
}
