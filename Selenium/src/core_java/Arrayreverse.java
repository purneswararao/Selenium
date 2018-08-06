package core_java;

public class Arrayreverse {

	public static void main(String[] args) {
		int[] a= {2,3,4,5,6,7,8}; 
		int isize=a.length;
		System.out.println(isize);
		for(int i=isize-1;i>=0;i--) {
			System.out.println(a[i]);
		}

	}

}
