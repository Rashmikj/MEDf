package JAVA;

public class AmstrongNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=15;
		int copy=n;
		int sum=0;
		
		
			while (n!=0) {
				int rem=n%10;
				sum=sum+(rem*rem*rem);
				n=n/10;
			}
			System.out.println(sum);
		
		if (copy==sum) {
			System.out.println("amstrong no");
		} else {
			System.out.println("not a amstrong no");
		}
	}
	}



