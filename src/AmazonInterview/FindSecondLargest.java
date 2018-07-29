package AmazonInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public int secondLargest(int input1, int input2[])
	{
		Set<Integer> numSet = new TreeSet<Integer>();
		List<Integer> numSetList = new ArrayList<Integer>();

		for(int a= 0;a<input1;a++)
		{
			numSet.add(input2[a]);
		}
		numSetList.addAll(numSet);
		if(numSetList.size() > 1){
			return numSetList.get(numSetList.size() - 2);
		}
		else{
			return -1;
		}
	}

	public static void main(String[] args) {
		int input1 = 3;
		int input2[]={2,1,2}; 
		FindSecondLargest fsl = new FindSecondLargest();
		int result = fsl.secondLargest(input1, input2);
		System.out.println(result);
	}

}
