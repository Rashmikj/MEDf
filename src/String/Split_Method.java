package String;

public class Split_Method {

	public static void main(String args[]){  
		String s1="java string split method by javatpoint";  
		String[] words=s1.split("");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		for(String w:words){  
		System.out.print(w);  
		}  
		
		for (String str :s1.split("string", 2)) {
			System.out.println(str);
		}
		
		}
}
