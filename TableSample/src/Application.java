import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("first number:");
		Scanner scanner = new Scanner(System.in);
		int firstNumber = scanner.nextInt();
		
		for( int x = 1; x<11 ; x = x+1) {
			System.out.println(firstNumber * x);
		}
		
		
		
		
	}

}
