import java.util.Scanner;
class Dosage{
public static void main(String[] Args){
Scanner x=new Scanner(System.in);
System.out.println("Are you a kid Teenager or abult?");
String user_input=x.nextLine();
switch(user_input){
case "kid":
System.out.println("Take 1 tablet at night");
break;
case "Teenager":
System.out.println("Take 1 tablet at morning");
break;
case "abult":
System.out.println("Take 1 tablet at evening");
break;
default:
System.out.println("invalid input");
}
}
}