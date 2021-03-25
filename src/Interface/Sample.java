package Interface;

public class Sample {

	public static void main(String[] args) {

 int []arr= {10,22,34,33,22,34,543,543};
 
 for (int i= 0; i < arr.length-1; i++) {
	for (int j =i+1; j <= arr.length-1; j++) {
		if (arr[i]==arr[j]) {
			System.out.println(arr[j]);
		}
	}
 }
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=0)
			{
				System.out.println(arr[i]);
			}
		}
		
	}
	}

	


