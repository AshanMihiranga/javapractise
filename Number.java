import java.util.Scanner;
class Number {
public static void main (String[] args){
Scanner x=new Scanner(System.in);
System.out.println("Enter the Number");
int num=x.nextInt();
if(num == 0){
System.out.println("Zero");
}
else if(num<0){
System.out.println(num +" Negative Number");
}
else if(num>0){
System.out.println(num +" Positive Number");
}
}
}