package Array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum 
{
	public int[] findTwoSum(int []inputArray, int target)
	{
		int complement = 0;
		if(inputArray == null  || inputArray.length == 0)
		{
			return null;
		}
		Map<Integer, Integer> resultMap = new HashMap<>();
		
		for(int i=0;i<inputArray.length;i++)
		{
			complement = target - inputArray[i];
			
			if(resultMap.containsKey(complement))
			{
				return new int[] {resultMap.get(complement),i};
			}
			resultMap.put(inputArray[i], i);
			}
		throw new IllegalArgumentException("Two sum doesn't exist");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TwoSum ref = new TwoSum();
		int[] array = {1,4,45,6,10,-8};
		int target = 16;
		int[] result = ref.findTwoSum(array, target);
		System.out.print("["+result[0]+","+result[1]+"]");
	}

}
