package JAVA;

public class Paliandrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=156;
		int copy=n;
		int sum=0;
		
		
			while (n!=0) {
				int rem=n%10;
				sum=sum*10+rem;
				n=n/10;
			}
			System.out.println(sum);
		
		if (copy==sum) {
			System.out.println("paliandrome no");
		} else {
			System.out.println("not a paliandrome no");
		}
	}

}
