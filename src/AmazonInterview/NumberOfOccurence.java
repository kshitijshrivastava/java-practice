package AmazonInterview;

import java.util.HashMap;
import java.util.Map;

public class NumberOfOccurence {

	public static void main(String[] args) {
		int[] array = {1,2,3,5,3,1,2,3,7,8};
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		/*for(Integer num: array)
		{
			map.put(num, 1);
			System.out.println(map.get(num));
		}
		System.out.println(map);*/
		
		for(Integer num: array)
		{
			Integer count = map.get(num);
			if (count==null)
			{
				map.put(num, 1);
			}
			else
			{
				map.put(num, ++count);
			}
		}
		System.out.println(map);
		
		for(Map.Entry<Integer, Integer> entry: map.entrySet())
		{
			
				System.out.println(entry.getKey()+" is present "+entry.getValue()+" times ");
			
			
		}

	}

}
