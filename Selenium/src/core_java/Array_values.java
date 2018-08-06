package core_java;

import java.util.Arrays;

public class Array_values {
	public  static int array(int[] a,int total) {
		Arrays.sort(a);
		return a[total-3];
	}

	public static void main(String[] args) {
	 int[] a= {12,15,-15,25,45};
	System.out.println( Array_values.array(a, 5));

	}

}
