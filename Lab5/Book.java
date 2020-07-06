
public class Book {
	private String author,title,refNumber;
	private int pages;
	public Book(String bookAuthor,String bookTitle,int bookPages)
	{
		author=bookAuthor;
		title=bookTitle;
		refNumber="";
	}
	public String getAuthor()
	{
		return author;
	}
	public String getTitle()
	{
		return title;
	}
	public int getpages()
	{
		return pages;
	}
	public void setRefNumber(String bookRefNumber)
	{
		if(bookRefNumber.length()>=3)
			refNumber=bookRefNumber;
		else
			System.out.println("Reference number must have atleast three characters");
	}
	public String getRefNumber()
	{
		return refNumber;
	}
	public void printAuthor()
	{
		System.out.println("The author of the book is " + author);
	}
	public void printTitle()
	{
		System.out.println("The title of the book is " + title);
	}
	public static void main(String[] args)

	{
		Book p=new Book("dennis","c-programming",250);
		p.setRefNumber("re");
	    p.printAuthor();
		p.printTitle();
	}
}
