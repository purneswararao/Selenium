package core_java;

public class String_Char {

	public static void main(String[] args) {
		String s1="Darling";
		System.out.println(s1.charAt(3));
		System.out.println(s1.length());
		char[] ch1=s1.toCharArray();
		for(char c1:ch1) {
		System.out.println(c1);	
		}
		for(int k=7-1;k>=0;k--) {
			char rev1=s1.charAt(k);
			String rev2=String.valueOf(rev1);
			System.out.println(rev2);
		}
		
		String s="Hai";
		char[] ch=s.toCharArray();
		for(char c:ch) {
			System.out.println(c);
		}
       int i=s.length();
       System.out.println(i);
       for(int j=i-1;j>=0;j--) {
    	  char  rev =s.charAt(j);
    	  String rev4=Character.toString(rev);
    	  System.out.println(rev4);
       }
	}

}
