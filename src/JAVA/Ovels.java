package JAVA;

public class Ovels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="rashmicharan";
		int vcount =0;
		int ccount=0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			//char ch = s1.charAt(i);
			if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
			{
				vcount++;
			}
			else if(ch[i]>='a' && ch[i]<='z') 
			{
				ccount++;
			}
			
		}
		System.out.println(vcount);
		System.out.println(ccount);
		
	}

}
