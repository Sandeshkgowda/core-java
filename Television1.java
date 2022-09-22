class Television1{
    
	static String brandName;
	static String screenSize;
	static double price;
	static  boolean isConnected;
	static int minVolume;
	static int maxVolume = 6;
	static int currentVolume;
	
	public static boolean onOrOff(){
	System.out.println("inside onOrOff");
	 if(isConnected == false){
	    isConnected = true;
		System.out.println("television is turned on");
	 }
	 
	 else if(isConnected == true){
		 isConnected = false;
		 System.out.println("television is turned off");
	 }
	
	System.out.println("end onOrOff");
	 return isConnected;
		}
		
	public static void increaseVolume(){
	System.out.println("inside increaseVolume()");
	if(isConnected == true){
	if(currentVolume < maxVolume){
		currentVolume = currentVolume + 1;
		System.out.println("The currentVolume is :" + currentVolume);
	}	
	else{
		System.out.println("maxVolume reached");
	}
	}
else{
    System.out.println("television is off");
}
    System.out.println("end of increaseVolume()");	
	}
public static void decreaseVolume(){
	System.out.println("inside decreaseVolume");
	if(isConnected == true){
	if(currentVolume >  minVolume){
		currentVolume =  currentVolume - 1;
	System.out.println("currentVolume is :" + currentVolume);
	}	
	else{
		System.out.println("minVolume reached");
	}
	}
	else{
		System.out.println("television is off");
	}
	System.out.println("end of decreaseVolume()");
}	
}
