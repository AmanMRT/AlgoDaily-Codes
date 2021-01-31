
public class stringReverse {

	//Approach 1 using StringBuffer
//	public static String reverse(String str)
//	{
//		if(str.equals(null) || str.length() == 0)			//condition to check if String is Null
//		{
//			return "String can't be empty";					//return String Note
//		}
	
//		StringBuffer sb = new StringBuffer(str);			//object creation of type StringBuffer
//		sb.reverse();										//inbuilt method to reverse a String
//		
//		return sb.toString();								//return String
//	}
	
//	//Approach 2 using Core Java Concept's(Brute Force Solution)
//	public String reverse(String str)
//	{
//		if(str.equals(null) || str.length() == 0)			//condition to check if String is Null
//		{
//			return "String can't be empty";					//return String Note
//		}
//		
//		String str1= "";									//reference variable initialized
//		int len = str.length();								//length of a String
//		
//		for(int i=0; i<len; i++)
//		{
//			str1 = str1 + str.charAt(len-i-1);
//		}
//		
//		return str1;										//return String
//	}
	
	//Approach 3 using Pointer's or Recursive law
	public String reverse(String str)
	{
		if(str.equals(null) || str.length() == 0)			//condition to check if String is Null
		{
			return "";					//return String
		}
		
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
	}
	
	//Driver Program
	public static void main(String[] args)
	{
		String str = "JACK";								//reference variable initialized
		
		//str = stringReverse.reverse(str).toString();		//static method accesed by class name not by Object
		stringReverse string = new stringReverse();			//object creation of Class stringReverse as reference.
		
		//str = string.reverse(str);						//User defined method called here
		
		System.out.println(string.reverse(str));			//Output
	}
}
