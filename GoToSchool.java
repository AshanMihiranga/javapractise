import java.util.Scanner;
class GoToSchool {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Today whether is RAINNY type \"R\"");
	System.out.println("Today whether is SUNNY type \"S\"");
	char selection= input.nextLine().charAt(0);
	if (selection == 'S'){
		System.out.println("Today i go to school");
	}
	else if (selection == 'R' ) {
		System.out.println("Today I do not go to school");
	}
}
}