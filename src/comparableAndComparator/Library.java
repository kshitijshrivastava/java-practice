package comparableAndComparator ;

public class Library implements Comparable<Library>{
	
	private String bookName;
	private String bookAuthor;
	private int bookId;
	
	public Library(String bookName, String bookAuthor, int bookId) {
		
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	
	//method to sort by bookId

	@Override
	public int compareTo(Library lib) {
		
		return this.bookId>lib.bookId ? 1 : this.bookId<lib.bookId ? -1: 0;
		
		//return this.bookName.compareTo(lib.bookName);
	}

	/*@Override
	public String toString() {
		return "Library [bookName=" + bookName + ", bookAuthor=" + bookAuthor
				+ ", bookId=" + bookId + "]";
	}*/
	
	
	
	

}
