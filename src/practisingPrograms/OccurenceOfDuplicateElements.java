package practisingPrograms;

public class OccurenceOfDuplicateElements {

	public static void main(String[] args) {
		/*String[] data = {"Java","C#","Ruby","Python","Java","C++","C#","AngularJS","Java"};
		int length = data.length;
		int occurence = 0;
		//using two loops
		for(int i=0;i<length-1;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(data[i].equals(data[j]))
				{
					//System.out.println(data[j]+" is duplicate element");
					occurence++;
				}
			}
		}
		System.out.println(occurence);

	}*/
		//int[] arr = { 1, 2, 3, 4, 5, 1, 2, 8 };
		String[] data = {"Java","C#","Ruby","Python","Java","C++","C#","AngularJS","Java"};
        String[] result = new String[9];
        int counter = 0, count = 0;
        for (int i = 0; i < data.length; i++) {
            boolean isDistinct = false;
            for (int j = 0; j < i; j++) {
                if (data[i] == data[j]) {
                    isDistinct = true;
                    break;
                }
            }
            if (!isDistinct) {
                result[counter++] = data[i];
            }
        }
        for (int i = 0; i < counter; i++) {
            count = 0;
            for (int j = 0; j < data.length; j++) {
                if (result[i] == data[j]) {
                    count++;
                }

            }
            System.out.println(result[i] + " = " + count);

        }
    }
}


