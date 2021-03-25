package JAVA;

public class Student_ThisKeyword {
	 int id;  
	    String name;
	    
	    //creating a parameterized constructor  
	    Student_ThisKeyword(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    
	    //method to display the values  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    //creating objects and passing values  
	    	Student_ThisKeyword s1 = new Student_ThisKeyword(111,"Karan");  
	    	Student_ThisKeyword s2 = new Student_ThisKeyword(222,"Aryan");  
	    //calling method to display the values of object  
	   s1.display();  
	    s2.display();  
	   }  

}
