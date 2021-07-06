import java.util.Scanner;
class CalculateArea{
public static void main(String[] Args){
Scanner x=new Scanner(System.in);
System.out.println("What do you want calculate area of the circle,rectangle or triangle");
String user_input=x.nextLine();
switch(user_input){
case "circle":
System.out.println("Enter the radius of circle");
int r=x.nextInt();
float CircleArea=(22/7)*(r*r);
System.out.println("Area of the circle="+CircleArea);
break;
case "rectangle":
System.out.println("Enter the width of rectangle");
int W=x.nextInt();
System.out.println("Enter the Lenth of rectangle");
int L=x.nextInt();
float rectangleArea=W*L;
System.out.println("Area of the rectangle="+rectangleArea);
break;
case "triangle":
System.out.println("Enter the Height of triangle");
int H=x.nextInt();
System.out.println("Enter the Lenth of triangle");
int Le=x.nextInt();
float triangleArea=(H*Le)/2;
System.out.println("Area of the rectangle="+triangleArea);
break;
default:
System.out.println("invalid input");
}
}
}