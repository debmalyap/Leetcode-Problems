package String;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatation 
{

	 public int lengthOfLongestSubstring(String string) 
	 {
		 int i=0,j=0,maxLength = Integer.MIN_VALUE;
		 Map<Character,Integer> stringMap = new HashMap<>();
		 
		 if(string.length() == 0 || string == null || string == "")
	     {
	            return 0;
	     }

		 
		 while(j<string.length())
		 {
			 char charData = string.charAt(j);
			 stringMap.put(charData, stringMap.getOrDefault(charData, 0)+1);
			 
			 if(stringMap.size() == j-i+1)
			 {
				 maxLength = Math.max(maxLength, j-i+1);
				 //j++;
			 }
			 else
			 {
				 while(stringMap.size() < j-i+1)
				 {
					 char firstCharacter = string.charAt(i);
					 stringMap.put(firstCharacter, stringMap.get(firstCharacter)-1);
					 
					 if(stringMap.get(firstCharacter) == 0)
					 {
						 stringMap.remove(firstCharacter);
					 }
					 i++;
				 }
				 }
			 j++;
		 }
		 return maxLength;
	 }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		LongestSubstringWithoutRepeatation ref = new LongestSubstringWithoutRepeatation();
		String inputString = "pwwkew";
		System.out.print(ref.lengthOfLongestSubstring(inputString));
	}

}
