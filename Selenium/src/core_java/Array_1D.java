package core_java;

import java.util.Arrays;

public class Array_1D {
	
	public static void main(String[] args) {
		 int[] a= {2,4,6,8,10};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);	
		}
		System.out.println(a[3]);
		Arrays.sort(a);
	}
	

}
