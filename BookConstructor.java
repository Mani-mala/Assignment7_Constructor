package assignment7;
import java.util.ArrayList;
import java.util.List;
public class BookConstructor {
	public static void main(String[] args) {
		List<Book> books=new ArrayList<>();
		books.add(new Book("Machine learning","Andrew Ng","321-6549870321",839.90,"01-12-2022","AI press",550));
		books.add(new Book("Spider-Man: Blue", "Jeph Loeb", "978-0785110716", 699.50, "01-07-2002", "Marvel Comics", 144));
		books.add(new Book("Harry Potter and the Sorcerer’s Stone", "J.K. Rowling", "978-0439708180", 799.99, "26-06-1997", "Bloomsbury", 309));
		books.add(new Book("Deep Learning with Python", "François Chollet", "987-1234567890", 899.99, "15-05-2021", "Manning Publications", 450));
		int i=1;
		for(Book book : books)
		{
			System.out.println("BOOK : "+i++);
			book.display();
		}
	}
}

class Book
{
	private String title;
    private String author;
    private String isbn;
    private double price;
    private String publicationYear;
    private String publisher;
    private int pages;
    
    public Book(String title,String author,String isbn,double price,String publicationYear,String publisher,int pages)
    {
    	this.title=title;
    	this.author=author;
    	this.isbn=isbn;
    	this.price=price;
    	this.publicationYear=publicationYear;
    	this.publisher=publisher;
    	this.pages=pages;
    }
    public void display()
    {
    	System.out.println("Title : "+title);
    	System.out.println("Author : "+author);
    	System.out.println("ISBN : "+isbn);
    	System.out.println("Price : "+price);
    	System.out.println("PublicationYear : "+publicationYear);
    	System.out.println("Publisher : "+publisher);
    	System.out.println("Pages : "+pages);
    	System.out.println();
    }
}
