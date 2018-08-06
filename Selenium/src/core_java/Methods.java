package core_java;

public class Methods {

	public static void main(String[] args) {
		One.table(1);
		One.do_While(5);
		One.if_else(1);
        
	}
}
class One{
public static int table(int n ) {
	for(int i=1;i<=10;i++) {
		int p=n*i;
		System.out.println(p);
	}
	return n;
}
public static  int do_While(int i) {
	do {
		System.out.println(i);
		i++;
	}while(i<=10);
	return i;
	}
public static int if_else(int i) {
	if(i<10) {
		System.out.println(i);
		i++;
		return i;
	}else {
		System.out.println("enter valid i value");
	}
	return i;
}

}
