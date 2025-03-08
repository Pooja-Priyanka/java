import java.util.Scanner;
class score {
	public static void main(String[] args){

		int score;
		Scanner input = new Scanner(System.in);
		System.out.print("enter score");
		score = input.nextInt();

    		if (score > 90 && score<=100) {
      			System.out.println("O");
    		}		
    		else if (score > 80 && score<=90) {
      			System.out.println("A+");
    		}

    		else if (score >70 && score<=80) {
     			 System.out.println("A");
   		}
		else {
			System.out.println("good");
		}
  	}
}