package famousInterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateElementsInArray {

	public static void main(String[] args) {

		String nameArray[] = {"Java","C#","Ruby","Python","Java","C++","C#","AngularJS","Java"};

		//Using two for loops . Not the best way
		
		/*Scanner sc = new Scanner(System.in);
		char ch =sc.next().charAt(0);*/

		System.out.println("********Using two for loops *********");
		for(int i=0;i<nameArray.length;i++)
		{
			for(int j=i+1;j<nameArray.length;j++)
			{
				if(nameArray[i].equals(nameArray[j]))
				{
					System.out.println("The duplicate element is: "+nameArray[i]);
				}
			}
		}

		//Using one loop


		System.out.println("********Using one for loops *********");
		Arrays.sort(nameArray);
		int occurence =0;
		for(int i=0;i<nameArray.length-1;i++)
		{
			if(nameArray[i].equals(nameArray[i+1]))
			{
				System.out.println("The duplicate element is: "+nameArray[i]);
				occurence++;
			}
		}






		//Using Hash Set

		System.out.println("********Using Hash Set concept*********");

		Set<String> set = new HashSet<String>();
		for(String name : nameArray)
		{
			if(set.add(name)==false)
			{
				System.out.println("The duplicate element is: "+name);
			}
		}
		System.out.println(set);

		//Using Hash Map

		System.out.println("********Using Hash MAP concept*********");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String name: nameArray)
		{
			Integer count = map.get(name); // it will return null as no values are present for the key
			//System.out.println(count);
			if(count==null)
			{
				map.put(name, 1); //when its null add the value
			}
			else
			{
				map.put(name, ++count); // when it finds second occurrence of Java (i.e count =1 )we increase the count
			}
		}
		System.out.println(map);
		/*Set<Entry<String, Integer>> entrySet =map.entrySet();

		for(Map.Entry<String, Integer> entry:entrySet)*/

		for(Map.Entry<String, Integer> entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{

				System.out.println("The duplicate element is: "+entry.getKey());
				System.out.println("The occurence of element "+entry.getKey()+" is "+ entry.getValue());
			}




		}

	}
}
