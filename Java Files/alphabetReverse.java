
public class alphabetReverse {
	
	public static String reverse(String str)
	{
		//Local Variables
		StringBuffer sb = new StringBuffer(str);
		int len = str.length();		//length of string str
		int start = 0;		//starting index
		int end = len-1;	//index from end
		
		if(str.equals(null) || str.length() == 0)			//condition to check if String is Null
		{
			return "String can't be empty";					//return String
		}
		
		//Condition
		while(start < end)
		{
			//check if both ends have alphabets only
			if(Character.isAlphabetic(str.charAt(start)) && Character.isAlphabetic(str.charAt(end)))
			{
				//swap the alphabets
				char temp = str.charAt(start);
				sb.setCharAt(start, sb.charAt(end));
				sb.setCharAt(end, temp);
				
				start++;	//increment start index
				end--;		//decrement end index
			}
			//increment if there is extra symbol other then alphabet
			else if(!Character.isAlphabetic(sb.charAt(start)))
			{
				start++;
			}
			//decrement if there is extra symbol other then alphabet
			else if(!Character.isAlphabetic(sb.charAt(end)))
			{
				end--;
			}
		}
		
		return sb.toString();	//return String format
	}
	public static void main(String[] args) {

		//Member Variables
		//String str = "sea!$hells3";
		String str = "B!FDCEA2";
		
		//Creating object with new Keyword
		alphabetReverse abrev = new alphabetReverse();
		System.out.println(abrev.reverse(str));
		
		//Direct by clas name
		//System.out.println(alphabetReverse.reverse(str));	//static method accesed by class name not by Object
	}

}
