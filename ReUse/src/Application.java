import java.time.YearMonth;
import java.util.Date;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Teacher t = new Teacher();
		int result = t.getAttendence();
		System.out.println("The teachers attendence is" + result);
		Student s = new Student();
		int result1 = s.getAttendence();
		System.out.println("The students attendence is" + result);
		Staff s1 = new Staff();
		int result2 = s1.getAttendence();
		System.out.println("The attendence for the staff is " + result);
		
		
		System.out.println( Math.acos(0.5));
		
		Date now = new Date();
		System.out.println(now);
		

		YearMonth y = YearMonth.of(1000, 2);
		System.out.println(y.lengthOfMonth());
	}

}
