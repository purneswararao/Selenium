package core_java;

public class Conditional {
	public static void main(String[] args) {
for(int i=0;i<=5;i++) {
	if(i==3) {
		break;
	}
	for(int j=0;j<=3;j++) {
		if(j==2) {
			break;
		}
		System.out.println(i+""+j);
	}
	
}
int i = 0;
while(i<5) {
	System.out.println(i);
	if(i==3) {
		break;
	}
	i++;
}
int i1=1;
do {
	System.out.println(i1);
	i1++;
}while(i1<4);
int i11=1;
if(i11<5) {
	i11++;
	System.out.println(i11);
	
}
	}

}
