import java.util.Scanner;
class Week {
    public static void main(String[] args) {
	Scanner x= new Scanner(System.in);
	System.out.println("Enter the week number 1-7");
	char selection = x .nextLine().charAt(0);
		if (selection == '1'){
		System.out.println("Monday");
		}
		else if (selection == '2'){
		System.out.println("Tuesday");
		}
		else if (selection == '3'){
		System.out.println("wednesday");
		}
		else if (selection == '4'){
		System.out.println("Thursday");
		}
		else if (selection == '5'){
		System.out.println("Friday");
		}
		else if (selection == '6'){
		System.out.println("Saterday");
		}
		else if (selection == '7'){
		System.out.println("Sunday");
		}
	}
	}
	