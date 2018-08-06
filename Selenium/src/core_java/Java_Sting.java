package core_java;

public class Java_Sting {
	public static void main(String[] args) {
		String s="purna";
		String s1="rao";
		String s2="Meghana";
		String s3="purna";
		System.out.println(s.equals(s3));
		System.out.println(s.length());
		System.out.println(s.endsWith("rao"));
		System.out.println(s.compareTo(s2));
		System.out.println(s.compareToIgnoreCase(s2));
		StringBuilder b=new StringBuilder("purna");
		b.reverse();
		System.out.println(b);
		b.reverse();
		System.out.println(b);
		b.append("rao");
		System.out.println(b);
		b.replace(1, 2, "P");
		System.out.println(b);
		System.out.println(s);
	System.out.println(s.replaceAll(s, s1));
	}

}
