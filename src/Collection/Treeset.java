package Collection;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(5);
		t.add(2);
		t.add(3);
		t.add(345);
		t.add(5);
		System.out.println(t);
		TreeSet<Integer> t1=new TreeSet<Integer>();
		t1.add(886);
		t1.add(2);
		t1.add(3);
		t1.add(44);
		t1.removeAll(t);
		System.out.println(t1);
		
		
		
	
		
	}

}
