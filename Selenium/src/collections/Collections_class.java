package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_class {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(25);
		list.add(26);
		list.add(58);
		list.add(87);
		Collections.sort(list);
		System.out.println(list);
		Collections.max(list);
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
	}

}
