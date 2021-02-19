
public class powerOfThree {

	//Approach 1 using core programming logic
	public static boolean checkNumber(int num)
	{
		int rem=0;	
		
		while(rem == 0 &&  num > 1 )
		{
			rem = num % 3;
			System.out.println(rem);
			num = num / 3;
			System.out.println(num);
			
			System.out.println();
		}
		
		if(rem != 0)
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
	
//	//Approch 2 using mathematical concept
//	public static boolean checkNumber(int num)
//	{
//		if((Math.log10(num)/Math.log10(3) % 1) == 0)
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
//	}
	
	public static void main(String[] args) {

		int n = 270;
		//powerOfThree.checkNumber(n);
		System.out.print(powerOfThree.checkNumber(n));
	}

}
