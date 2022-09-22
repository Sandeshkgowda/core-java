class Television{
 static String brand;
 static String colour;
 static double price;
 static boolean conntivity;
 static int minVolume;
 static int maxVolume = 10;
 static int currentVolume;
 public static boolean onOrOff(){
 System.out.println("inside onOrOff()");
 if(conntivity == false){
    conntivity = true;
 System.out.println("television is onn");
 }
 else if (conntivity == true){
  conntivity = false;
 System.out.println("television is off");
 }
 System.out.println("end of onOrOff()");
 return conntivity;
 }
 public static void increaseVolume(){
	 System.out.println("start of increase volume");
	 if(conntivity = true){
	 if(currentVolume < maxVolume){
		 currentVolume = currentVolume + 1;
		 System.out.println("the currentVolume is : " + currentVolume);
	 }
    else{
		System.out.println("maxVolume is reached");
	} 
	 }
	else{
		System.out.println("switch of the tv");
	}
	System.out.println("end of increase volume");
 }
  public static void decreaseVolume(){
	 System.out.println("start of decrease volume");
	 if(conntivity = true){
	 if(currentVolume > minVolume){
		 currentVolume = currentVolume - 1;
		 System.out.println("the currentVolume is : " + currentVolume);
	 }
    else{
		System.out.println("minVolume is reached");
	} 
	 }
	else{
		System.out.println("switch of the tv");
	}
	System.out.println("end of decrease volume");
}
}