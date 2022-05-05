package Books;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ArrayListOfObjects {

	public static void main(String[] args) {
		
		//Declaring ArrayList
		List<Book> ListOfBooks = new ArrayList<>();
		
		Book javaInAction = new Book("Java in action", "mary public", "Everest publishers",new BigDecimal("600"));
		Book IntroductionToJava = new Book("Introduction to java", "mary public", "Heavy piblishing",new BigDecimal("300"));
		Book advancedDataBase = new Book("Advance database", "charles darwin", " Longhorn publishers",new BigDecimal("600"));
		
		     //Adding object to ArrayList
		
		ListOfBooks.add(javaInAction);
		ListOfBooks.add(IntroductionToJava);
		ListOfBooks.add(advancedDataBase);
		
		//Printing the ArrayList
		System.out.println(ListOfBooks);
	}
}
