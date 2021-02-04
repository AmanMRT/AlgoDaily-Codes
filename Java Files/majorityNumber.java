import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class majorityNumber {

	// Approach 1 Time complexity-> O(n) Space complexity-> O(n)
//	public static int findMajority(int[] arr)
//	{
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//			
//		for(int i : arr )
//		{
//			if(map.containsKey(i))
//			{
//				map.put(i, map.get(i)+1);
//			}
//			else
//			{
//				map.put(i, 1);
//			}
//		}
//		
//		int a = map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
//
//		return a;
//	}
	
	//Approach 2
	public static int findMajority(int[] arr)
	{
		int[] sorted = arr.clone();
	    Arrays.sort(sorted);
	    
	    return sorted[arr.length / 2];
	}	
	public static void main(String[] args) 
	{
		int[] arr = {4,2,4};
		
		System.out.println(findMajority(arr));
	}
}
