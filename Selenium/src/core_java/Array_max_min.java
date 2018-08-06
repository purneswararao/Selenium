package core_java;

public class Array_max_min {
	public static void min(int a[]){  
		 int min=a[0];
		 for(int i=0;i<a.length;i++) {
		    	 if(min>a[i]) {
		    		 min=a[i];
		    		 System.out.println(min);
		    	 }
		    	 }
	}
    public static void max(int a[]){  
			 int max=a[0];
			 for(int i=0;i<a.length;i++) {
			    	 if(max<a[i]) {
			    		 max=a[i];
			    		 System.out.println(max);
			    	 }
			    	 }
	}

	public static void main(String[] args) {
		
		int a[]= {8,3,5,7,6,9};
   min(a);
   max(a);
	}

}
