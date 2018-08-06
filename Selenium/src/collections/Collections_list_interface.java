package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Collections_list_interface {

	public static void main(String[] args) {
		LinkedList<String> list1=new LinkedList<String>();
	     list1.add("ramu");
	     list1.add("raghu");
	     list1.add("mysore");
	     list1.add("Amma");
			Collections.sort(list1);
			ListIterator<String> itr=list1.listIterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			while(itr.hasPrevious()) {
				System.out.println(itr.previous());
			}
		}
	}


