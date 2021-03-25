package Constructorcalling;

class A{
	void add(){
		int a=20;
		System.out.println("a class method");
	}
}
class B extends A{
	void add(){
		super.add();
		System.out.println("a class overriden method");
	}
	void sub(){
	
		System.out.println("b class method");
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 B b=new B();
 b.add();
 b.sub();
	}

}
