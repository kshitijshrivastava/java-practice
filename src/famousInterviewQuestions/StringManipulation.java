package famousInterviewQuestions;

public class StringManipulation {

	public static void main(String[] args) {
		String str = "Hello my name is Kshitij";
		String str1 = "Hello my name is kshitij";
		
		System.out.println(str.charAt(4));
		System.out.println(str.contains("Kshitij"));
		System.out.println(str.indexOf('K'));
		System.out.println(str.indexOf("name"));
		//System.out.println(str.indexOf('i', 13));
		//System.out.println(str.indexOf("is", 9));
		System.out.println(str.indexOf("Varun")); //-1
		
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		
		System.out.println(str.substring(4));
		System.out.println(str.substring(4, 10));
		System.out.println(str.subSequence(4, 10));
		
		String s  = "    Hello World    ";
		System.out.println(s.trim());
		System.out.println(s.replace(" ", ""));
		System.out.println(s.replace("Hello", "Bye"));
		
		String s2 = "Hello_I_Am_Going_Now";
		String array[] = s2.split("_");
		for(String a:array)
		{
			System.out.println(a);
		}
		
		String s3 = "How are ";
		String s4 = "You?";
		System.out.println(s3.concat(s4));
		int a = 100;
		int b = 200;
		
		System.out.println(a+b+s3+s4); //300How are You?
		System.out.println(s3+s4+a+b); // How are You?100200
		System.out.println(a+s3+b+s4); //100How are x200You?
		

	}

}
