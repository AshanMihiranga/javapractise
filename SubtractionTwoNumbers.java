import java.util.Scanner;
public class SubtractionTwoNumbers {

    public static void main(String[] args) {
        
        int num1, num2, sub;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = x.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = x.nextInt();
        
        x.close();
        sub = num1-num2;
        System.out.println("Subtraction of these numbers: "+sub);
    }
}