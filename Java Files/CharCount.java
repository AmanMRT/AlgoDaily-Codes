import java.util.Arrays;

public class CharCount {

	
	public static void count(String[] arr)
	{
		String str = Arrays.toString(arr);
		System.out.println(str);
		
		int ucount=0, lcount =0, scount =0, dcount=0;
		
		for (int i=0;i<str.length();i++)
		{
			if(Character.isUpperCase(str.charAt(i)))
			{
				ucount++;
			}
			if(Character.isLowerCase(str.charAt(i)))
			{
				lcount++;
			}
			if(Character.isDigit(str.charAt(i)))
			{
				dcount++;
			}
			if(Character.isWhitespace(str.charAt(i)))
			{
				scount++;
			}
		}
		
		System.out.println("Upper: "+ ucount +" Lower: "+lcount + " Digit: "+dcount +" Spaces: "+scount);
	}
	public static void main(String[] args) {
		
		String[] arr = {"123Manoj","KumAr"};
		CharCount.count(arr);
		

	}

}
