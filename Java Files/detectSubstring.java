
public class detectSubstring {

	public static String detect(String str, String substr)
	{
		if(str.contains(substr))
		{
			return (" " + str.indexOf(substr.charAt(0)) + str.indexOf(substr.charAt(substr.length()-1)));
		}
		else
		{
			return "-1";
		}
	}
	public static void main(String[] args) {

		String str = "AMan is a good boy ";
		String substr = "good";
		
		System.out.println(detectSubstring.detect(str, substr));
	}

}
