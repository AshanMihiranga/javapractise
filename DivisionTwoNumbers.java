import java.util.Scanner;
class DivisionTwoNumbers {
    public static void main(String[] args) {        
        int num1, num2, division;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = x.nextInt();        
        System.out.println("Enter Second Number: ");
        num2 = x.nextInt();        
        x.close();
        division=num1/num2;
        System.out.println("Division of these numbers= "+division);
    }
}