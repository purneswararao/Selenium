package core_java;

public class Fib_1 {

	public static void main(String[] args) {
		int k=0,a=1,b=1;
		while(k<60) {
		k=a+b;
		System.out.println(k);
			a=b;
			b=k;
			
		}
	}

}
