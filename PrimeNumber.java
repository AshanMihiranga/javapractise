import java.util.Scanner;
class PrimeNumber {
public static void main (String[] args){
Scanner x=new Scanner(System.in);
System.out.println("Enter the Number");
int n=x.nextInt();
int number =1 ;
for (int i=2;i<=n;i++){
if (n%i ==0){
number=0;
break;
}
}
if(number==1){
System.out.println(n + " Prime number");
}
else {
System.out.println(n + " Not a prime number");
}
}
}