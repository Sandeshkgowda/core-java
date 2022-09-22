class Ac{
 static String brand;
 static String colour;
 static double price;
 static boolean connectivity;
 static int maxVolume= 6;
 static int minVolume;
 static int currentVolume;
 public static boolean onOrOff(){
 System.out.println("inside onOrOff");
 if(connectivity == false){
    connectivity = true;
 System.out.println("ac is on");	
 }
 else if(connectivity == true){
    connectivity = false;
 System.out.println("ac is off");	
 }
 System.out.println("end of onOrOff");
 return connectivity; 
 }
public static void increaseVolume(){
	System.out.println("inside the increaseVolume()");
	if(connectivity == true){
    if(currentVolume < maxVolume){
		currentVolume = currentVolume + 1;
	System.out.println("currentVolume is : " + currentVolume);
	}
	else{
		System.out.println("maxVolume is reached");
	}
	}
	else{
		System.out.println("swtich off the volume");
	}
	System.out.println("end of increaseVolume()");
}
public static void decreaseVolume(){
	System.out.println("inside the decreaseVolume()");
	if(connectivity == true){
    if(currentVolume > minVolume){
		currentVolume = currentVolume - 1;
	System.out.println("currentVolume is : " + currentVolume);
	}
	else{
		System.out.println("minVolume is reached");
	}
	}
	else{
		System.out.println("swtich off the volume");
	}
	System.out.println("end of decreaseVolume()");
}
}