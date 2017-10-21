
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Person p1 = new Person("Tarun", 14);
			Person p2 = new Person("Siddhu" , 3);
			boolean canDrive= p1.canDrive();
			if(canDrive==true) {
				System.out.println("Tarun can drive");
			}else{
				System.out.println("Tarun can't drive");
			}
	}
	
}
