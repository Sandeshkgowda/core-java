class Imperial{
public static void main(String san[]){
String name = "WELCOME TO IMPERIAL HOSTEL";
String address = "jayanagara";
String type = "4 star";
int noOfManagers = 4;
String managersNames[] = {"john","lucky","harry","manish"};
String vegFoodMenu[] = {"fried rice","gobi munchri","mushroom kabab","panner tikka","rumal roti","kulcha","butter naan","dhal","jeera rice","panner masala"};
String nonVegFoodMenu[] = {"chicken kabab","chicken lilpop","mutton kurma","boti masla","mutton fry","chicken 65","chicken pepper dry","chicken munchuri","egg masla","omlet"};
String juice[] = {"orange","pinapple","mojites","lemon soda","watermelon","grapes"};
String iceCreams[] = {"butterscotck","pista","chocolate","black current","gud bud"};
System.out.println(name);
System.out.println(" ");
System.out.println("Address: " + address);
System.out.println(" ");
System.out.println("type of hotel: " + type);
System.out.println(" ");
System.out.println("No of Managers: " + noOfManagers);
System.out.println(" ");
System.out.println("Managers names ");
for(int s=0; s<managersNames.length;s++){
System.out.println(managersNames[s] + " ");
}
System.out.println(" ");
System.out.println("Lists of VegFood ");
for(int d=0; d<vegFoodMenu.length;d++){
System.out.println(vegFoodMenu[d] + " ");
}
System.out.println(" ");
System.out.println("Lists of NonVegFood ");
for(int f=0; f<nonVegFoodMenu.length;f++){
System.out.println(nonVegFoodMenu[f] + " ");
}
System.out.println(" ");
System.out.println("Lists of Juice ");
for(int g=0; g<juice.length;g++){
System.out.println(juice[g] + " ");
}
System.out.println(" ");
System.out.println("Lists of Icecreams ");
for(int h=0; h<iceCreams.length;h++){
System.out.println(iceCreams[h] + " ");
}
}
}

