class EmpireVeg{
public static void main(String san[]){
String name = "WELCOME TO EMPIRE VEG";
String address = "Bangalore";
String type = "5 star";
int manager = 6;
String managersNames[] = {"divya","kiran","shivakumar","deepu","naveen","preetham"};
String foodMenu[] = {"butter naan","romali roti","tandoori roti","kulcha","lemon rice","plain rice","veg biryani","noddles","fried rice","paneer tikka","mushroom kabab","babycorn munchuri","sweet corn","ice cream"};
System.out.println(name);
System.out.println(" ");
System.out.println("address " + address);
System.out.println(" ");
System.out.println("hotel type " + type);
System.out.println(" ");
System.out.println("no of managers " + manager);
System.out.println(" ");
System.out.println("Managers names ");
for(int a=0; a<managersNames.length;a++){
    System.out.println(managersNames[a] + " ");
}
System.out.println(" ");
System.out.println("list of food menu ");
for(int d=0; d<foodMenu.length;d++){
    System.out.println(foodMenu[d] + " ");
}
}
} 
