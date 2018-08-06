package core_java;


public class Rever_String {

	public static void main(String[] args) {
		int i=356;
		String s=Integer.toString(i);
		StringBuffer sb= new StringBuffer(s);
		String s1=sb.reverse().toString();
		System.out.println(s1);
		int i1=Integer.parseInt(s1);
		System.out.println(i1);

	}

}
