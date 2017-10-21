
public class Car {
	String name;
	int year;
boolean IsStarted = false;
public void Start(){
	if(IsStarted == false){
	 System.out.println("Starting The Car");
	 IsStarted = true;
	}else{
		System.out.println("Stop the car");
	}
	}
		 
	 

public void Stop(){
	if(IsStarted == true)
	System.out.println("Stopping the Car");
	IsStarted = false;
}
}

