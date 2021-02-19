import java.util.HashMap;
import java.util.Map;

public class singleLonelyNumber {

	// Approach 1 Time complexity-> O(n) Space complexity-> O(n)
	public static void findLonely(int[] arr)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			
		for(int i : arr )
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
		
		// to print key and value
//		for(Entry entry : map.entrySet())
//		{
//			System.out.println(entry.getKey() + " " + entry.getValue());
//		}
//			
		for(Map.Entry entry : map.entrySet())
		{
			if(entry.getValue().equals(1))
			{
				System.out.println(entry.getKey());
			}
		}
	}
		
	public static void main(String[] args) {
		
		int[] arr = {4, 4, 6, 1, 3, 1, 7,9,3}; //array declaration
		
		//static method used to call without creating object
		singleLonelyNumber.findLonely(arr);
	}

}
