import java.util.Scanner;
class MyFavourite{
public static void main(String[] Args){
Scanner x=new Scanner(System.in);
System.out.println("Wich Number do you like out of 20,30,60 numbers?");
int user_input=x.nextInt();
switch(user_input){
case 20:
System.out.println("I Like Chocolate");
break;
case 30:
System.out.println("I Like apple");
break;
case 60:
System.out.println("I Like ice cream");
break;
default:
System.out.println("Things I like are not here");
}
}
}
