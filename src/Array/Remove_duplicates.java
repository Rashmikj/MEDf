package Array;

public class Remove_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {1,2,1,2,3,4};
		int arr = a.length;
		for (int i = 0; i <a.length-1; i++) {
			for (int j = i+1; j <a.length-1; j++) {
				if (a[i]==a[j]) {
				a[j]=0;	
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i]!=0) {
				System.out.println(a[i]);
			}
			
		}
	}

}
