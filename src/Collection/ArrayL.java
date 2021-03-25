package Collection;

import java.util.ArrayList;

public class ArrayL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a=new ArrayList();
a.add(10);//0
a.add(20);//1
a.add(30);//2
a.add(40);//3
a.add(50);//4
a.add(60);//5
a.add(70);//6
a.add(10);//7
ArrayList a1=new ArrayList();
a1.add(10);//0
a1.add('a');//1

/*a.addAll(a1);
System.out.println(a);*/


a1.retainAll(a);
System.out.println(a1);
System.out.println(a);
	}

}
