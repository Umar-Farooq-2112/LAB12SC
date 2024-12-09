package Tasks;

public class SumOfDigits {
	public static int sumOfDigits(int num){
		
		if (num==0){
			return 0;
		}
		if (num<0) {
			num = num*(-1);
		}
		return (num%10) + sumOfDigits(num/10);
	}

	
}
