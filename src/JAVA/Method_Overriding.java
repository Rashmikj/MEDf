package JAVA;

class Method
{
	static void add() {
		System.out.println("super class");
	}}
class Method_1 extends Method
{
	
	static void sub() {
		System.out.println("sub class");
	}
	
	static void add() {
		System.out.println("overrriden super class method");
	}}
public class Method_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Method m=new Method_1();

 
 m.add();
 m.add();
	 
	}

}
