package Collection;

import java.util.PriorityQueue;

public class Priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue p=new PriorityQueue();
		p.add(12);
		p.add(12);
		p.add(7);
		p.add(21);
		p.add(12);
		System.out.println(p);
		System.out.println(p.peek());
		//System.out.println(p);
		
		//System.out.println(p);

		PriorityQueue p1=new PriorityQueue();
		p1.add(2);
		p1.add(22);
		p1.add(67);
		p1.add(21);
		p1.add(12);
		
		
		System.out.println(p1.poll());
		System.out.println(p1);
		
		
		
		
		
	}

}


