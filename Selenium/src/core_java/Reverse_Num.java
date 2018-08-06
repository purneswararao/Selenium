package core_java;

public class Reverse_Num {

	public static void main(String[] args) {
		int i=153;
		int r,sum=0;
		int t=i;
		while(i>0) {
			r=i%10;
			i=i/10;
			//sum=sum*10+r;
			sum=sum+r*r*r;
		}
		System.out.println(sum);	
		if(t==sum) {
			System.out.println("given number is palindrome");
		}else{
			System.out.println("given number is not palindrome");
		}
	}

}
