import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" number of laps ");
		Scanner scanner = new Scanner(System.in);
		int laps = scanner.nextInt();
		int x;
		double p = 0;
		for(x=1; x <= laps; x= x+1){
			System.out.println("How long did you take to run lap " + x);
			double time = scanner.nextDouble();
			
			p = p + time;
			
		}
		System.out.print("The time it took for you to run " + laps);
		System.out.print(" laps took you " + p) ;
		System.out.println(" minutes");
		}
	

	}


