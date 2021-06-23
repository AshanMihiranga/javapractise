import java.util.Scanner;
class MultiplicationTwoNumbers {
    public static void main(String[] args) {        
        int num1, num2, Multi;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = x.nextInt();        
        System.out.println("Enter Second Number: ");
        num2 = x.nextInt();        
        x.close();
        Multi=num1*num2;
        System.out.println("Multiplication of these numbers= "+Multi);
    }
}