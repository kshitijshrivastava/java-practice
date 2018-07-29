package famousInterviewQuestions;

//we can remove unwanted characters using regular expressions
//[^a-zA-Z0-9]    ---> this removed everything other than a-z , A-Z and 0-9

public class RemoveUnwantedCharacters {

	public static void main(String[] args) {
		String s = "!@#$Hello &*(Wordld %^&99";
		System.out.println("Entered string is -----> "+s);
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("String after removing unwanted characters is -----> "+s);
	}

}
