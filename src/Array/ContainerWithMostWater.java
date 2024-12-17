package Array;

public class ContainerWithMostWater 
{
	public int findContainer(int[] heightArray)
	{
		int leftIndex = 0;
		int rightIndex = heightArray.length-1;
		int maxArea = 0;
		
		if(heightArray == null || heightArray.length==0)
		{
			return 0;
		}
		
		while(leftIndex < rightIndex)
		{
			maxArea = Math.max( Math.min(heightArray[leftIndex],heightArray[rightIndex])*(rightIndex-leftIndex), maxArea);
			
			if(heightArray[leftIndex] < heightArray[rightIndex])
			{
				leftIndex++;
			}
			else
			{
				rightIndex--;
			}
		}
		return maxArea;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ContainerWithMostWater ref= new ContainerWithMostWater();
		int[] array = {1,8,6,2,5,4,8,3,7};
		System.out.print(ref.findContainer(array));
	}

}
