package core_java;

public class Override {
	

	public static void main(String[] args) {
        Inner i1 =new Inner();
        i1.sub(2, 3);
        i1.add(5, 3);
        //i1.add(1, 2, 3);
		Ride r=new Ride();
		r.add(2, 3);
		//r.sub(2,3); it's not possible
	}
}
class Ride{
public  int add(int a ,int b) {
	int c=a+b;
	System.out.println(c);
	return c;

}
}

class Inner extends Ride{
//public int add(int a,int b ,int c) 
public  int sub(int a ,int b){
	int c=a-b;
	//int d=a+b+c;
	System.out.println(c);
	return c;
	
}
}