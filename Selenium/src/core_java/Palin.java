package core_java;

public class Palin {

	public static void main(String[] args) {
		int r,n=153,sum=0;
		int t=n;
		while(n>0) {
			r=n%10;
			n=n/10;
			//sum=sum*10+r;
			sum=sum+r*r*r;
		}
		if(t==sum) {
			//System.out.println("palindrome");
			System.out.println("arm strong");
		}else {
			//System.out.println("not palindrome");
			System.out.println("not armstrong ");
		}

	}

}
