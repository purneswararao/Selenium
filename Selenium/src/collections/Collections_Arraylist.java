package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//import java.util.List;

public class Collections_Arraylist {
	public int id;
	public String name;
	public int age;
	public String email;
	Collections_Arraylist(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	Collections_Arraylist(String email) throws CloneNotSupportedException{
		super.clone();
		this.email=email;
	}
	public static void main(String[] args) throws CloneNotSupportedException {
    ArrayList<String> list1=new ArrayList<String>();
     list1.add("ramu");
     list1.add("raghu");
     list1.add("mysore");
     list1.add("Amma");
     list1.removeAll(list1);
		ArrayList<String> list =new ArrayList<String>();
		list.add("ravi");
		list.add("bhagi");
		list.add("sita");
		list.add("singh");
		list.addAll(list1);
		Collections.sort(list);
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
