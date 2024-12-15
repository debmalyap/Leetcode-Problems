package Array;

import java.util.Arrays;

public class TwoSumSorting 
{
	public int[] findTwoSumSorting(int []inputArray, int target)
	{
		Arrays.sort(inputArray);
		int leftIndex = 0, rightIndex = inputArray.length-1;
		
		while(leftIndex<rightIndex)
		{
			int complement = inputArray[rightIndex]+inputArray[leftIndex];
			if(complement < target)
			{
				leftIndex++;
			}
			else if(complement > target)
			{
				rightIndex--;
			}
			else
			{
				return new int[] {leftIndex,rightIndex};
				
			}
			
		}
		throw new IllegalArgumentException("Two sum doesn't exist");
	}
	
	public static void main(String[] args) {
		TwoSumSorting ref = new TwoSumSorting();
		int[] array = {1,4,45,6,10,-8};
		int target = 16;
		int[] result = ref.findTwoSumSorting(array, target);
		System.out.print("["+result[0]+","+result[1]+"]");

	}

}
