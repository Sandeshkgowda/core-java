class Trouch{
 static String brand;
 static String colour;
 static boolean connectivity;
 public static boolean onOrOff(){
 System.out.println("inside onOrOff");
 if(connectivity == false){
    connectivity = true;
 System.out.println("yhe trouch is on");	
 }
 else if(connectivity == true){
    connectivity = false;
 System.out.println("the trouch is off");	
 }
 System.out.println("end of onOrOff");
  return connectivity;
 
 }



}