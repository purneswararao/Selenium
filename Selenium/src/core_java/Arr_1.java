package core_java;

import java.util.Arrays;

public class Arr_1 {
	public static int getLarge(int total,int[] a) {
		Arrays.sort(a);
		//return a[total-1]; // largest number in the given array
	     //return a[total-3]; //3rd largest number in the given array
		//return a[total-2]; //2nd largest number in the given array
		return a[0];   //min or least value in the given array
	}
	public static void main(String[] args) {
		int[] a= {1,5,8,9,7,4};
		int[] b= {-5,8,7,3,4,6};
		System.out.println(Arr_1.getLarge(6, a));
		System.out.println(Arr_1.getLarge(6, b));

	}

}
