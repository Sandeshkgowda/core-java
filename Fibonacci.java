class Fibonacci{
public static void main(String san[]){
int a =0;
int b =1;
for(int e=1;e<=10;e++){
int c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}