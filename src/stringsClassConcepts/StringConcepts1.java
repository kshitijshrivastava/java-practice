package stringsClassConcepts;

public class StringConcepts1 {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "World";
		
		System.out.println(str1.toString());
		System.out.println(str2.toString());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		

	}

}
