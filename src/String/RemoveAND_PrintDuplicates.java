package String;

public class RemoveAND_PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="rashmiri";
		int count;
		char[] str = s.toCharArray();
		for (int i = 0; i < str.length; i++) {
			count=1;
			for (int j = i+1; j < str.length; j++) {
				if (str[i]==str[j] && str[j]!=' ') {
					count++;
					str[j]='0';
				}
			}
			if (count>1 &&str[i]!='0') {
				System.out.println(str[i]);
			}
			
		}
	}

}
