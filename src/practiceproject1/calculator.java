package practiceproject1;
import java.util.*;
public class calculator {
    public static void main(String[] args) {
    	double a;
    	double b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        a = scanner.nextDouble();
        System.out.print("Enter second number:");
        b = scanner.nextDouble();
        System.out.print("Enter operation (+,-,*,/): ");
        char operator = scanner.next().charAt(0);
        scanner.close();
        double output;
        switch(operator)
        {
            case'+':
            	output=a+b;
                break;
            case'-':
            	output=a-b;
                break;
            case'*':
            	output=a*b;
                break;
            case'/':
            	output=a/b;
                break;
            default:
                System.out.printf("Enter correct operator");
                return;
        }
        System.out.println(a+" "+operator+" "+b+" = "+output);
    }
}