import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class commanInArray {

	//Approach 1 (Brute Force Method)
	public static Set<Integer> intersection(int[] arr1, int[] arr2)
	{		
		HashSet<Integer> set1 = new HashSet<Integer>();		//Store Array1 as arr1
		HashSet<Integer> set2 = new HashSet<Integer>();		//Store Array2 as arr2
		Set<Integer> resultSet = new HashSet<Integer>();	//Store the result
		
		//for loop
		for(int i : arr1)
		{
			set1.add(arr1[i]);
		}
	
		//for loop
		for(int i=0;i<arr2.length;i++)
		{
			set2.add(arr2[i]);
		}
		
		resultSet = set2.stream()	//Initial
						.filter(x-> set1.contains(x))	//Intermediate 
						.collect(Collectors.toSet());	//Termination 
		
		return resultSet;	
	}
	
		//Approach 2 using SetTheory(HashSet)
	//	public static HashSet<Integer> intersection(int[] arr1, int[] arr2)
	//	{
	//		HashSet<Integer> set = new HashSet<Integer>();				//Store Array1 as arr1
	//		HashSet<Integer> resultSet = new HashSet<Integer>();		//Store Array1 as arr1
	//		
	//		int len1 = arr1.length;		//Calculate length of arr1
	//		int len2 = arr2.length;		//Calculate length of arr2
	//		
	//		//for loop
	//		for(int i : arr1)
	//		{
	//			set1.add(arr1[i]);
	//		}	
	//		
	//		for(int j=0;j<len2;j++)
	//		{
	//			//condition if set contains elements from arr2
	//			if(set.contains(arr2[j]))
	//			{
	//				resultSet.add(arr2[j]);		//add comman number's
	//			}
	//		}
	//		return resultSet;
	//	}
	
	public static void main(String[] args) {
		
		//Initialize array
		int[] arr1 = {4,5,7,8,9,4,7,4,2,3};
		int[] arr2 = {9,4,2,1,0};
		
		//commanInArray.intersection(arr1, arr2);
		System.out.println(commanInArray.intersection(arr1, arr2));
	}
}
