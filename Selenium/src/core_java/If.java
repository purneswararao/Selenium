package core_java;

public class If {
	public static int  a(int i) {
		if(i%2==0) {
			System.out.println("even number"); 	
			}else {
				System.out.println("odd number");
			}
		return i;
	}

	public static void main(String[] args) {
		
		If.a(15);
	}

}
