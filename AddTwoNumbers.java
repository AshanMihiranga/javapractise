import java.util.Scanner;
public class AddTwoNumbers {

    public static void main(String[] args) {
        
        int num1, num2, sum;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = x.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = x.nextInt();
        
        x.close();
        sum = num1 + num2;
        System.out.println("Sum of these numbers: "+sum);
    }
}