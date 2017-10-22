import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int usernumber;
		int n;
		int sum = 1;
		System.out.println("Enter number here");
		Scanner scanner = new Scanner(System.in);
		usernumber = scanner.nextInt();
		if(usernumber == (int)usernumber){
			for(n = 1 ; n <= usernumber; n=n+1  ){
				sum = n * sum;
				
		}
			System.out.println(sum);
			}else{
			System.out.println("Sowwwyyyyy youwe nuwmber isn't an integer");
		}
		}
		
		/*if(usernumber <= 0){
			System.out.println("Sorry I can't use this number");
		}else{
			for(n = 1 ; n <= usernumber; n=n+1  ){
				sum = n * sum;
			}
			System.out.println(sum);*/
		
		}		
	

	
