package core_java;

public class Prime_1 {

	public static void main(String[] args) {
		int n=29;
		boolean isPrime=true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				isPrime =false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("given number is prime number");
		}else {
			System.out.println("given number is not a prime number");
		}

	}

}
