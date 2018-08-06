package core_java;

public class Prime_Number {

	public static void main(String[] args) {
		//prime is a number i.e number is greaterthan 1 and divided itself 
		//n%i==0 is prime number otherwise not prime number
		int n=100;
		boolean isPrime=true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
		 isPrime=false;
		 break;
		}}
		if(isPrime) {
			System.out.println("Given number is prime");
		}else {
			System.out.println("Given number is not prime");
		}

	}

}
