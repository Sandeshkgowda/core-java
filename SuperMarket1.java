class SuperMarket1{
 public static void getVegtables(String[] vegtables){
 System.out.println("inside getVegtables()");
 System.out.println("size of vegtables is " + vegtables.length);
  System.out.println("list of vegtables");
  for(int z=0; z<vegtables.length; z++){
  System.out.println(vegtables[z]);
  }
   System.out.println("end of getVegtables()");
 }
public static void getPerfumes(String[] perfumes){
 System.out.println("inside getPerfumes()");
  System.out.println("size of the perfumes is " + perfumes.length);
   System.out.println("list of perfumes");
   for(int a=0; a<perfumes.length; a++){
    System.out.println(perfumes[a]);
   }
    System.out.println("end of getperfumes()");
 }
public static void getBiscuits(String[] biscuits){
 System.out.println("inside getBiscuits()");
  System.out.println("size of the biscuits is " + biscuits.length);
   System.out.println("lits of biscuits");
   for(int s=0; s<biscuits.length; s++){
    System.out.println(biscuits[s]);
   }
  System.out.println("end of getBiscuits()");
 }
}