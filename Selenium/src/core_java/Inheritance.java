package core_java;

public class Inheritance {

	public static void main(String[] args) {
		Programmer p=new Programmer();
		p.add(2.5, 5.2);
		p.add1(1, 3);

	}

}
class Employee{
	 static float salary;
	public void add(double d,double e) {
		double c=d+e;
		System.out.println(c);
	}
}
class Programmer extends Employee{
public void add1(float bonus,float salary) {
	float b=salary+bonus;
	super.add(salary, bonus);
	System.out.println(b);
}	
		}
		