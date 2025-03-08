import java.util.Scanner;
class largestnumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("enter a :");
		double a = input.nextDouble();
		System.out.println("enter b :");
		double b = input.nextDouble();
		System.out.println("enter c :");
		double c = input.nextDouble();
		double largest = (a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("largest is " +largest);
	}
}