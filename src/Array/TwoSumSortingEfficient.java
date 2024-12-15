package Array;

import java.util.Arrays;

public class TwoSumSortingEfficient 
{
	public int[] findTwoSumPair(int[] inputArray, int target)
	{
		Arrays.sort(inputArray);
		
		if(inputArray==null || inputArray.length==0)
		{
			return new int[] {};
		}
		int leftIndex = 0,rightIndex=inputArray.length-1;
		while(leftIndex < rightIndex)
		{
			int sum = inputArray[leftIndex] + inputArray[rightIndex];
			if(sum == target)
			{
				return new int[] {leftIndex,rightIndex};
			}
			else if(sum > target)
			{
				rightIndex--;
			}
			else
			{
				leftIndex++;
			}
		}
		throw new IllegalArgumentException("No Two Sum Found");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TwoSumSortingEfficient ref = new TwoSumSortingEfficient();
		int[] array = {16,4,23,8,15,42,1,2};
		int target = 19;
		int[] result = ref.findTwoSumPair(array, target);
		System.out.print("["+result[0]+","+result[1]+"]");
	}

}
