class Moblie{
 static String brand;
 static String colour;
 static boolean connectivity;
 static int minVolume;
 static int maxVolume= 7;
 static int currentVolume;
 public static boolean onOrOff(){
 System.out.println("inside onOrOff");
 if(connectivity == false){
   connectivity = true;
   System.out.println("the moblie is on");
 }
 else if(connectivity == true){
   connectivity = false;
   System.out.println("the moblie is off");
 }
 System.out.println("end of onOrOff");
  return connectivity;
 }
 public static void increaseVolume(){
 System.out.println("inside increaseVolume()");
 if(connectivity == true){
 if(currentVolume < maxVolume){
	currentVolume = currentVolume + 1;
 System.out.println("currentVolume is : " + currentVolume);	
 }
 else{
	 System.out.println("maxVolume reached");
 }
 }
 else{
	 System.out.println("Moblie is switch off");
 }
 System.out.println("end of increaseVolume()");
 }
 public static void decreaseVolume(){
 System.out.println("inside decreaseVolume()");
 if(connectivity == true){
 if(currentVolume > minVolume){
	currentVolume = currentVolume - 1;
 System.out.println("currentVolume is : " + currentVolume);	
 }
 else{
	 System.out.println("minVolume reached");
 }
 }
 else{
	 System.out.println("Moblie is switch off");
 }
 System.out.println("end of decreaseVolume()");
 }
}