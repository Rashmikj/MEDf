package String;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="rashmir";
		char[] arr = s.toCharArray();
		//int []arr= {2,1,34,45,2,1,3,4};
				
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j <arr.length; j++) {
				if (arr[i]==arr[j]) {
					arr[j]=0;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=0) {
				System.out.println(arr[i]);
			}
		}
	}

}
