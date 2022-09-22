class WashingMachine{
 static String brand;
 static String colour;
 static double price;
 static boolean connectivity;
 static int maxSpeed=7;
 static int minSpeed;
 static int currentSpeed;
 public static boolean onOrOff(){
 System.out.println("inside onOrOff()");
 if (connectivity == false){
      connectivity = true;
	System.out.println("washing Machine is on");  
 }
 else if (connectivity == true){
      connectivity = false;
	System.out.println("washing Machine is off");
 }
	System.out.println("end of onOrOff()");
     return connectivity;
}
public static void increaseSpeed(){
 System.out.println("inside the increaseSpeed()");
 if(connectivity == true){
 if(currentSpeed < maxSpeed){
	 currentSpeed = currentSpeed + 1;
	 System.out.println("currentSpeed is : "+ currentSpeed);
 }
 else{
	 System.out.println("maxSpeed is reached");
 }
 }
 else{
	 System.out.println("swtich of the speed");
 }
  System.out.println("end of increaseSpeed");
}
public static void decreaseSpeed(){
 System.out.println("inside the decreaseSpeed()");
 if(connectivity == true){
 if(currentSpeed > minSpeed){
	 currentSpeed = currentSpeed - 1;
	 System.out.println("currentSpeed is : "+ currentSpeed);
 }
 else{
	 System.out.println("minSpeed is reached");
 }
 }
 else{
	 System.out.println("swtich of the speed");
 }
  System.out.println("end of decreaseSpeed()");
}
}