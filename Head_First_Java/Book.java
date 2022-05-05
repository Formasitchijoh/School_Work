package Books;
import java.math.BigDecimal;

public class Book {

	private String title;
	private String author;
	private String publisher;
	private BigDecimal bookPrice;
	
	public Book(String title, String author, String publisher, BigDecimal bookprice){
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.bookPrice= bookprice;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public Long getBookPrice() {
		return Long.valueOf(String.valueOf(bookPrice));
	}
	
	@Override
	public String toString() {
		return "Book{" +
				 "title= " + title + '\''+
				 ", author='" + author + '\'' +
				 ",publisher='" + publisher + '\'' +
				 ", bookPrice=" + bookPrice +
				 '}';
	}
}
 