
public class sumUntilOneDigit {

	public static void signleDigitSum(int num)
	{
		int sum = 0;
		int rem ;
		while (num > 9)
		{
			sum = 0;
			while(num > 0)
			{
				rem = num % 10;
				sum = sum + rem;
				num = num / 10;
			}
			
			num = sum;
		}
		
		System.out.println(sum);
	}
	public static void main(String[] args) {

		sumUntilOneDigit.signleDigitSum(49);
	}
}
