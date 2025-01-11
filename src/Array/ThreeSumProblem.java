package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumProblem 
{

	public static List<List<Integer>> findThreeSum(int[] array, int target)
	{
		List<List<Integer>> resultSet = new ArrayList<List<Integer>>();
		if(array.length == 0 || array == null)
		{
			return new ArrayList<List<Integer>>();
		}
		Arrays.sort(array);
		for(int i=0;i<array.length-2;i++)
		{
			int leftIndex = i+1;
			int rightIndex = array.length-1;
			while(leftIndex < rightIndex)
			{
				int totalSum = array[i] + array[leftIndex] + array[rightIndex];
				if(totalSum == target)
				{
					resultSet.add(Arrays.asList(array[i],array[leftIndex],array[rightIndex]));
					leftIndex++;
					rightIndex--;
				}
				else if(totalSum < target)
				{
					leftIndex ++;
				}
				else
				{
					rightIndex --;
				}
			}
		}
		return new ArrayList(resultSet);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int array[] = {1,4,45,6,10,8};
		ThreeSumProblem ref = new ThreeSumProblem();
		System.out.print(ref.findThreeSum(array, 13));
	}

}
