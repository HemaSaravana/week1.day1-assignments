package assignments;

public class ArmStrongNumber {
	public static void main(String[] args) {
		int a=407 ,b ,remainder,t=0;
		b=a;
		while(b!=0) {
			remainder=b%10;
			t+=(remainder*remainder*remainder);
			
			b=b/10;
		}
		if(t==a) {
		System.out.println("Amstrong number");
		}
		else
			System.out.println(" Not an Amstrong number");
		
		
	}

	}


