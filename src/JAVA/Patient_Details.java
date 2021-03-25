package JAVA;

public class Patient_Details{

	 int id;  
	    String name;
	    
	    //creating a parameterized constructor  
	    Patient_Details(int id,String name){  
	   this.id = id;  
	    this.name=name;  
	    }  
	    
	    //method to display the values  
	    void display()
	    {
	    	System.out.println(id+" "+name);
	    	}  
	   
	    public static void main(String args[]){  
	    //creating objects and passing values  
	    	Patient_Details s1 = new Patient_Details(111,"Karan");  
	    	Patient_Details s2 = new Patient_Details(222,"Aryan");  
	    	
	    	System.out.println(s1.id);
	    	System.out.println(s2.name);
	    	
	    //calling method to display the values of object  
	   s1.display();  
	    s2.display();  
	   }  
	    
}
