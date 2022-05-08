/* print the sum (addition), multiply, subtract, divide and remainder of two numbers */
import java.util.Scanner ;
public class Operations {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in) ;

       System.out.println("Enter a number : ");
       int number1 = in.nextInt() ;

       System.out.println("Enter another number : ");
       int number2 = in.nextInt() ;

        System.out.println(number1 + " + " + number2 + " = " + (number1+number2) );
        System.out.println(number1 + " - " + number2 + " = " + (number1-number2) );
        System.out.println(number1 + " * " + number2 + " = " + number1*number2);
        System.out.println(number1 + " / " + number2 + " = " + number1/number2);





    }
}
