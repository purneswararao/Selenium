package core_java;

public class Switch {
	public static int  a(int i) {
		switch(i) {
		case 1:System.out.println("10"); 	
		break;
		case 2:System.out.println("20"); 	
		break;
		case 3:System.out.println("invalid number"); 	
		break;
		default:System.out.println("not in 10,20");
		}
		return i;
	}

	public static void main(String[] args) {
		Switch.a(2);

	}

}
