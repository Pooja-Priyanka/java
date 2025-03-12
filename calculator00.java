import java.util.Scanner;

class calculator00 {

    void add(int a, int b){
        System.out.println("the addition of a+b :"+(a+b));
    }
    void subtraction(int a, int b){
        System.out.println("the subtraction of a-b :"+(a-b));
    }
    public calculator1 extends calculator00 {
        public void multiplication(int a, int b){
            System.out.println("the multiplication of a*b :"+(a*b));
        }
    }
    public calculator2 extends calculator1 {
        public void division(int a, int b){
            if(b==0)
                System.out.println("denominator should not be equal to zero");
            else
                System.out.println("the division of a/b :"+(a/b));
        }
    }
}
        public static void main(String[] args) {
            System.out.println("");
            Scanner input = new Scanner(System.in);
            System.out.println("enter the first number:");
            int a = input.nextInt();
            System.out.println("enter the second number:");
            int b = input.nextInt();
            calculator2 c = new calculator2();
            c.add(a,b);
            c.subtraction(a,b);
            c.multiplication(a,b);
            c.division(a,b);
    }

