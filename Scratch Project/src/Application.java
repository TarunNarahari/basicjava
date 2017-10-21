
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=  new Student("Tarun"); 
		Student s2 = new Student("Siddhu");		
			s1.dohw();
			s2.dohw();
			int minutesRead = s1.ReadBook(" They Poured Fire on us From the Sky");
			int minutestoRead = s2.ReadBook(" Harry Potter");
			System.out.print(minutesRead + " minutes");
		}
	}


