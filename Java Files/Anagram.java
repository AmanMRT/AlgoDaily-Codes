import java.util.Arrays;

public class Anagram {

	public static String isAnagram(String str1, String str2)
	{
		
		String s1 = str1.replaceAll("//s", "");		//Copy of str1 with no whitespaces
		String s2 = str2.replaceAll("//s", "");		//Copy of str2 with no whitespaces
		
		boolean result = true;		//boolean Variable
		
		//Base condition 
		if(s1.length() != s2.length())
		{
			result = false;
		}
		else
		{
			char[] arr1 = s1.toLowerCase().toCharArray();	//convert 
			char[] arr2 = s2.toLowerCase().toCharArray();
			
			Arrays.sort(arr1);		//array sorting
			Arrays.sort(arr2);
			
			result = Arrays.equals(arr1, arr2);		//comparing content of 2 arrays
		}
		
		//true case
		if(result)
		{
			return "Anagrams";
		}
		//false case
		else
		{
			return "Not Anagrams";
		}	
	}
	//Driver Method
	public static void main(String[] args) {
		
		//memeber variables
		String str1 = "AmanGUPTA";
		String str2 = "AMGUPTAAN";
		
		//Only class needed to call method
		System.out.println(Anagram.isAnagram(str1, str2));
	}
}
