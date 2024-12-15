package String;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters 
{
	public Set<Character> findUniqueCharacters(String inputString)
	{
		Set<Character> resultSet = new HashSet<>();
		
		for(char ch:inputString.toCharArray())
		{
			resultSet.add(ch);
		}
		return resultSet;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String inputString = "IlovemyIndia";
		UniqueCharacters ref = new UniqueCharacters();
		Set<Character> uniqueChar = ref.findUniqueCharacters(inputString);
		System.out.print(uniqueChar);
	}

}
