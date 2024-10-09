import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) throws Exception {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        String input = "";
        do {
            System.out.println("Input:");
            input = sc.nextLine().toLowerCase();

        } while (!input.equals("quit"));
    }
}
