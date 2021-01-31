
public class fizzBuzz {

	public static String fizzbuzz(int n)
	{
		StringBuffer sb = new StringBuffer();
		
		//Simple for loop for iteration till number n
		//Brute Force Method
		for(int i=1 ; i<=n; i++)
		{
			//condition
			while(i <= n)
			{
				//multiple of 3 and 5 
				if(i%3==0 && i%5==0)
				{
					sb.append("FizzBuzz");
				}
				//multiple of 3
				else if(i%3==0)
				{
					sb.append("Fizz");
				}
				//multiple of 5
				else if(i%5==0)
				{
					sb.append("Buzz");
				}
				//if not any multiple then return num as it is
				else
				{
					sb.append(i);
				}
				
				i++;	//increment after each while loop
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args)
	{
		//memeber variable
		int num = 15;
		
		//static method called by class name
		System.out.println(fizzBuzz.fizzbuzz(num));
	}
}
