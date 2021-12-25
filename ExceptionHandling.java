import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        
        try {
            System.out.println("Enter a Number: ");
            x = in.nextInt();
            System.out.println("Number: "+x);
        }catch(InputMismatchException ex){
            System.out.println("Invalid Input!");
        }
    }
}
