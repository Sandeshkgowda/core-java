class VivantaTajHotel{
public static void main(String san[]){
String type = "3 star";
String address = "M.G Road";
String mangerNames[] = {"shashi","sandesh","anusha","prashantha"};
int noOfMangers = 5;
String foodMenu[] = {"chicken lolipop","chicken kabab","mutton biriyani","chicken biriyani","chicken 65","chicken peper dry","mutton kurma","mutton fry","botti masala","egg masala","omlet","fish kababa","fish thava fry","chicken munchurina","fried chicken"};
System.out.println("welcome to VivantaTajHotel");
System.out.println(" ");
System.out.println("VivantaTajHotel is " + type);
System.out.println(" ");
System.out.println("VivantaTajHotel address is " + address);
System.out.println(" ");
for(int s=0;s<mangerNames.length;s++){
System.out.println(mangerNames[s] + " ");
}
System.out.println(" ");
System.out.println("Number of Mangers " + noOfMangers );
System.out.println(" ");
System.out.print("lists of menu");
System.out.println(" ");
for(int a=0;a<foodMenu.length;a++){
System.out.println(foodMenu[a] + " ");
}
}
} 