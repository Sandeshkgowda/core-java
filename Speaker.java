class Speaker{
	
	
	static boolean isConnected;
	static int minVolume;
	static int maxVolume=8;
	static int currentVolume = 3;
	public static boolean onOrOff(){
	System.out.println("inside onOrOff()");
    if(isConnected == false){
		isConnected = true;
	System.out.println("speaker is on");	
	}	
	else if(isConnected == true){
		isConnected = false;
		System.out.println("speaker is off");	
	}
    System.out.println("end onOrOff()");
     return isConnected;	
	}
   public static void decreaseVolume(){
	 System.out.println("inside decreaseVolume()");
    if(isConnected == true){
	if (currentVolume > minVolume){
		currentVolume =  currentVolume - 1;
		System.out.println("the current volume is : " + currentVolume);
	}
   else {
	  System.out.println("min volume is reached"); 
   }
	}
   else{
	   System.out.println("swtich off the speaker");
   }
   System.out.println("end of decreaseVolume()");
	   
   }
   
   
}
	
	
