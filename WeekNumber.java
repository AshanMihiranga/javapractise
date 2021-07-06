import java.util.Scanner;
class WeekNumber{
public static void main(String[] Args){
Scanner x=new Scanner(System.in);
System.out.println("Ener the Week Number (1=7)");
int user_input=x.nextInt();
switch(user_input){
case 1:
System.out.println("MONDAY");
break;
case 2:
System.out.println("TUESDAY");
break;
case 3:
System.out.println("WEDNESDAY");
break;
case  4:
System.out.println("THURSDAY");
break;
case 5:
System.out.println("FRIDAY");
break;
case 6:
System.out.println("SATARDAY");
break;
case 7:
System.out.println("SUNDAY");
break;
default:
System.out.println("invalid input");
}
}
}