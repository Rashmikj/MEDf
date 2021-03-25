package JAVA;

public class SwapVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=20;
		int b=22;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
   System.out.println(b);
   
   int c=34;
   int d=67;
   
   int r=c;
   c=d;
   d=r;
   System.out.println(c);
   System.out.println(d);
	}

}
