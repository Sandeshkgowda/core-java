class Reverse{
public static void main(String san[]){
int n=64527, r=0;
while(n!=0){
int remainder = n%10;
r=r*10+remainder;
n=n/10;
}
System.out.println(r);
}
}