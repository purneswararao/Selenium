package core_java;

public class Conver_String {

	public static void main(String[] args) {
		String s="100";
		int i=Integer.parseInt(s);
		System.out.println(i);
		int i1=34;
		String s1=String.valueOf(i1);
		System.out.println(s1);
		String s2="200";
		Integer i2=Integer.valueOf(s2);
		System.out.println(i2);
		String s3=Integer.toString(i2);
		System.out.println(s3);
		String s4=String.valueOf(s3);
	}

}
