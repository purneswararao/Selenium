package core_java;

public class Palindrome {

	public static void main(String[] args) {
		int n=121,r,sum=0;
		int t=n;
		while(n>0) {
		r=n%10;
		n=n/10;
		sum=sum*10+r;
		}
		if(t==sum) {
			System.out.println("Given number is palindrome");
		}else {
			System.out.println("Given number is not palindrome ");
		}

	}

}
