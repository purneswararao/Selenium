package core_java;

public class ArmStrong {

	public static void main(String[] args) {
		int n=123,r,sum=0;
		int t=n;
		while(n>0) {
		r=n%10;
		n=n/10;
		sum=sum+r*r*r;
		}
		if(t==sum) {
			System.out.println("Given number is Armstrong");
		}else {
			System.out.println("Given number is not Armstrong ");
		}
	}

}
