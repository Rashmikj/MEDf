package JAVA;

public class PassByReference {

	int a=10;
	static void add( PassByReference a2) {
	System.out.println(a2.a);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 PassByReference a1=new  PassByReference();
		 System.out.println(a1.a);
		 add(a1);
	}

}
