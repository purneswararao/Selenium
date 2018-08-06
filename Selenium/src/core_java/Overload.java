package core_java;

public class Overload {

	public static void main(String[] args) {
		Hai.add(1, 2, 3);
		Hai.add();
		Hai.add(10, 20);
		Hai.add(10, 10, "message");
	}

}
 class Hai{
	public static int add(int a,int b) {
		int c=a+b;
		System.out.println(c);
		return c;
	}
	public static int add(int a,int b,int c) {
		int d=a+b+c;
		System.out.println(d);
		return d;
	}
	public static int add(int a,int b,String message) {
		int d=a+b;
		System.out.println(d+message);
		return d;
	}
	public static void add() {
System.out.println("darling");
}
}