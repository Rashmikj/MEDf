package JAVA;

public class PassBref {
int a=20;
	static void add(PassBref a2) {
		System.out.println(a2.a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  PassBref a1=new PassBref();
  System.out.println(a1.a);
  add(a1);
	}

}
