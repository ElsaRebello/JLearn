import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        int i = 10;
        while (i > 0) {
            System.out.println("*" +i);
            i--;
        }
        
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.println("Input:");
            input = sc.nextLine().toLowerCase();
        }
    }
}
