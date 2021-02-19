import java.util.Arrays;
import java.util.HashSet;

public class unionArrays {

	public static void union(int[] arr, int[] brr)
	{
		HashSet<Integer> set = new HashSet<>();
		
		for(int i:arr)
		{
			set.add(i);
		}
		
		for(int i:brr)
		{
			set.add(i);
		}
		
		System.out.println(set);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5};
		int[] brr = {2,3,7,5,8,1};
		
		unionArrays.union(arr, brr);
		

	}

}
