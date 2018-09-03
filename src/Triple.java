
public class Triple {

	public static void main(String[] args) {
		int counter =tripleCounter("zzssddssss");
		System.out.println(counter);

	}
	
	public static int tripleCounter(String str) {
		  int length = str.length();
		  int counter = 0;
		  
		  for (int i = 0; i < length-2; i++){
		    char tmp = str.charAt(i);
		    if (tmp == str.charAt(i+1) && tmp == str.charAt(i+2))
		      counter++;
		  }
		  return counter;
		}

}
