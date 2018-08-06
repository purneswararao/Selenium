package core_java;

public class Fibonacci {

	public static void main(String[] args) {
		int k,a,b ;
		//by default k=0,a=1,b=1;
		k=0;a=1;b=1;
		//it will continue the loop until k value equal to 50
		//1,1,.....50
		while(k<=50) {
			k=a+b;
		System.out.println(k);
		a=b;
		b=k;
		}
		

	}

}
