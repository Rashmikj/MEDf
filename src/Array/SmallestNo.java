package Array;

public class SmallestNo {

	public static int get(int[]a,int total) {
		
		for (int i = 0; i <total; i++) {
			for (int j = i+1; j <total; j++) {
				if (a[i]>a[j]) {
				int	temp=a[i];
				a[i] = a[j];
				a[j] =temp;
				}
			}
		}
		return a[0];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int []a= {2,34,1,45,33,89,5};
 System.out.print(get(a, 7));

	}

}
