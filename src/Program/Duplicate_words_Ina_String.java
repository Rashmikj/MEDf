package Program;

public class Duplicate_words_Ina_String {
public static void main(String[] args) {
		String s1="the java is is a java program my";
		int count;
		String[] s = s1.split(" ");
		for (int i = 0; i < s.length; i++) {
			count=1;
			for (int j = i+1; j < s.length; j++) {
				if (s[i].equals(s[j])) {
					count++;
					s[j]="0";
				}}
			if (count>1 && s[i]!="0") {
			System.out.println(s[i]+" ");}
		}}}
/*String string = "Big black bug bit a big black dog on his big black nose";    
int count;    
         string = string.toLowerCase();    //Converts the string into lowercase    
      String words[] = string.split(" ");    //Split the string into words using built-in function  
     System.out.println("Duplicate words in a given string : ");     
for(int i = 0; i < words.length; i++) {    
    count = 1;    
    for(int j = i+1; j < words.length; j++) {    
        if(words[i].equals(words[j])) {    
            count++;    
            //Set words[j] to 0 to avoid printing visited word    
            words[j] = "0";    
        }    
    }    
        
    //Displays the duplicate word if count is greater than 1    
    if(count > 1 && words[i] != "0")    
        System.out.println(words[i]);    
}    
}

}*/
	

