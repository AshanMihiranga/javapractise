import java.util.Scanner;
class ConvertRupee {
    public static void main(String[] args) {        
        int dollar,rupee;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter First dollar value: ");
        dollar = x.nextInt();          
        x.close();
        rupee=dollar*200;
        System.out.println("Your dollar value=RS. "+rupee);
    }
}