import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" grade");
		Scanner scanner = new Scanner(System.in);
		int firstNumber = scanner.nextInt();
if(firstNumber < 5){ 
	System.out.println("Elementary School");
}
else if (firstNumber >=6 && firstNumber <=8){
	System.out.println("Middle School");
	

}

if(firstNumber >=9 && firstNumber <=12 ){
	System.out.println("High School");
}
else if (firstNumber > 12 ) {
	System.out.println("college");
}
	

	
}
	

}
