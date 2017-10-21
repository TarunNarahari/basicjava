
public class Student {

	
	int grade;
	String name;
	Student(String Input){
		name = Input;
	}
	void dohw(){
		System.out.println(name + " Do Homework");
		
	}
	int ReadBook(String Bookname){
		System.out.println("Reading" + Bookname);
		return 45;
	}
}
