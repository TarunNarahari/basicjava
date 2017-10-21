
public class Person {
	int age;
	String name;
	Person(String name, int age){
		this.name= name;
		this.age = age;
		
	}
	boolean canDrive(){
		if(age>=15){ 
		return true;
		}else{
			return false;
		}
			
		
	}
}
