package Array;

import java.util.Arrays;

public class ThreeSumClosest {

	public int findThreeSumClosest(int[] array, int target)
	{
		//Sort the given array as ASC order and decalared a variable for comparison//
		Arrays.sort(array);
		int resultSum = array[0]+array[1]+array[2];
		int minDifference = Integer.MAX_VALUE;
		
		//Find out the 3 sum using 2 ptr approach//
		for(int i=0;i<array.length-2;i++)
		{
			int leftIndex = i+1;
			int rightIndex = array.length-1;
			
			while(leftIndex < rightIndex)
			{
				int totalSum = array[0]+array[leftIndex]+array[rightIndex];
				if(totalSum == target)
				{
					return totalSum;
				}
				else if(totalSum < target)
				{
					leftIndex++;
				}
				else
				{
					rightIndex--;
				}
				int diffToTarget = Math.abs(totalSum - target);
				if(diffToTarget < minDifference)
				{
					resultSum = totalSum;
					minDifference = diffToTarget;
				}
			}
			
			
		}
		return resultSum;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int array[] = {-1,2,2,4};
		ThreeSumClosest ref = new ThreeSumClosest();
		System.out.print(ref.findThreeSumClosest(array, 4));
		
	}

}
