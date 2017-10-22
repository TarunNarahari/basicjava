
public class Student {
String name;
Student(String Input){
	name = Input;
}
	void readBook(String bookName){
		System.out.println("I am reading the book" + bookName);
	}
	void readBook(String bookName, int timeRead){
		System.out.println("I am reading" + " " + bookName + " for " + timeRead + " minutes");
	}
	void readBook(String bookName, int timeRead, int pagesRead){
		System.out.println("I am reading" + " " + bookName + " for " + timeRead + " minutes" + "and also reading it for " + pagesRead + " pages" );
}
}
