package core_java;

public class Reverse_1 {

	public static void main(String[] args) {
		int n=123456,r,sum=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum*10+r;
		}
		System.out.println(sum);
	}

}
