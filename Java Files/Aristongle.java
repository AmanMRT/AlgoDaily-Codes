import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Aristongle {

//	public static String isOblong(int n)
//	{
//		String str="";
//		for(int i=0;i<n;i++)
//		{
//			if(i*(i+1) == n)
//			{
//				str= "oblong";
//				break;
//			}
//		}
//		return str;
//	}
//	
//	public static String isEnthralling(int n)
//	{
//		String str1 ="";
//		int a = 2*n;
//		int b = 3*n;
//		String c = n+a+b+"";
//
//		char[] arr = c.toCharArray();
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//		
//		for(int i : arr )
//		{
//			if(map.containsKey(i))
//			{
//				map.put(i-48, map.get(i)+1);
//			}
//			else
//			{
//				map.put(i-48, 1);
//			}
//		}
//		
//		for(Entry<Integer, Integer> entry : map.entrySet())
//		{
//			System.out.println(entry.getKey() + " " +entry.getValue());
//		}
//		
//		int max = map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : 0).get().getValue();
//		//System.out.println(max);
//		if(max == 1)
//		{
//			str1 = "Enthralling"; 
//		}
//		return str1;
//	}
//	
//	public static String isDelight(int n)
//	{
//		String str2 = "";
//		String s = Integer.toString(n);
//		int count = 0;
//		
//		for(int i=0; i<s.length();i++)
//		{
//			System.out.println(s.charAt(i));
//			if(s.charAt(i) == '0')
//			{
//				count++;
//			}
//		}
//		//System.out.println(count);
//		if(count > 2)
//		{
//			str2 = "Delight";
//		}
//		return str2;
//	}
	
	public static void checkNumber(int[] arr)
	{
		int ocount=0, ecount =0, dcount =0;
		
		for(int n : arr)
		{
			//oblong
			for(int i=0;i<n;i++)
			{
				if(i*(i+1) == n)
				{
					ocount++;
					break;
				}
			}
			
			//Enthralling
			int a = 2*n;
			int b = 3*n;
			String c = ""+n+a+b;

			char[] arrc = c.toCharArray();
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			
			for(int i : arrc )
			{
				if(map.containsKey(i))
				{
					map.put(i, map.get(i)+1);
				}
				else
				{
					map.put(i, 1);
				}
			}
			
			int max = map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getValue();
		
			if(max == 1)
			{
				ecount++;
			}
			
			//delight
			String s = Integer.toString(n);
			int count = 0;
			
			for(int i=0; i<s.length();i++)
			{
				//System.out.println(s.charAt(i));
				if(s.charAt(i) == '0')
				{
					count++;
				}
			}
			//System.out.println(count);
			if(count > 2)
			{
				dcount++;
			}
		}
		System.out.println("Oblong: "+ocount +" Enthra: "+ecount+" Delight: "+dcount);
		
	}
	public static void main(String[] args) 
	{
		int[] arr = {192, 342,12000};
		
		Aristongle.checkNumber(arr);
		
	}
}
