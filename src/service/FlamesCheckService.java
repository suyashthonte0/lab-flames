package service;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

public class FlamesCheckService{
	public char findFlames(String name1, String name2)
	{
		int count = 0;
		char[] name1Array = name1.toCharArray();
		char[] name2Array = name2.toCharArray();
		for(int i = 0 ; i < name1Array.length ; i++)
		{
			for(int j = 0 ; j < name2Array.length ; j++)
			{
				if(name1Array[i] == name2Array[j])
				{
					name1Array[i] = name2Array[j] = '1';
				}
			}
		}
		for(int i = 0 ; i < name1Array.length ; i++)
		{
			if(name1Array[i] != '1')
			{
				count++;
			}
		}
		for(int j = 0 ; j < name2Array.length ; j++)
		{
			if(name2Array[j] != '1')
			{
				count++;
			}
		}
		char[] Flames = {'f','l','a','m','e','s'};
		int k = count % 6;
		return Flames[k-1];
	}
}
