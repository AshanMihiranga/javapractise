import java.util.Scanner;
class PassOrFail{
	public static void main (String[] args){
		int sciencemark;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter the science mark");
		sciencemark=x.nextInt();
		x.close();
		if (sciencemark >100){
			System.out.println("Invallied Mark");
		}else {
			if (sciencemark <0) {
				System.out.println("Invallied Mark");
			} else {
				if (sciencemark >40){
				System.out.println("PASS");
				System.out.println("Give The Gift");
				} else {
					System.out.println("Fail");
				}
			}
		}
	}
}