import java.util.Scanner;

class TemperatureConversion {
   	 public static void main(String[] args) {
        	Scanner input = new Scanner(System.in);
        	System.out.print("Enter temperature in Celsius: ");
        	float ctemp = input.nextFloat();
        	float ftemp = (ctemp * 9 / 5) + 32;
        	System.out.println("Temperature in Fahrenheit: " + ftemp);
   	}
}
