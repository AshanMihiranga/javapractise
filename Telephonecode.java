import java.util.Scanner;
class Telephonecode {
    public static void main(String[] args) {
	Scanner x= new Scanner(System.in);
	System.out.println("Enter the telephone code");
	int Selection = x .nextInt();
		if (Selection ==11){
		System.out.println("Anuradhapura");
		}
		else if (Selection ==22){
		System.out.println("Polonnaruwa");
		}
		else if (Selection ==33){
		System.out.println("Sigiriya");
		}
		else if (Selection ==40){
		System.out.println("Colombo");
		}
		else if (Selection ==55){
		System.out.println("Kelaniya");
		}
		else if (Selection ==66){
		System.out.println("Kandy");
		}
		else if (Selection ==77){
		System.out.println("Galle");
		}
		else {
		System.out.println("Area Not Recognized");
		}
	}
	}
	