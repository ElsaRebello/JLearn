import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) throws Exception {

        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        //String output;

        if (number % 5 == 0 && number % 3 == 0) {
            System.out.println("FizzBuzz");
        }
        else if (number % 5 == 0) {
            System.out.println("Fizz");
        }
        else if(number % 3 == 0) {
            System.out.println("Buzz");
        } 
        else {
            System.out.println(number);
        }

        sc.close();
    }
}
