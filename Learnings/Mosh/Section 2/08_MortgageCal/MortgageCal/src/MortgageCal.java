import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MortgageCal {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        final byte MONTHS = 12;
        final byte PERCENT = 100;
        int principal = 0;
        float annualRateInterest;
        float monthlyInterest;
        int year;
        int numberOfPayments;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Principal is: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1000000) {
                break;
            }
            else {
                System.out.println("Enter a value between 1000 and 1000000");
            }
        }
        
        while (true) {
            System.out.println("Annual Rate of Interest is: ");
            annualRateInterest = scanner.nextFloat();
            if (annualRateInterest >= 1 && annualRateInterest <= 30) {
                monthlyInterest = annualRateInterest / PERCENT / MONTHS;
                break;
            }
            else{
                System.out.println("Enter a value between 1 and 30");
            }
        }

        while (true) {
            System.out.println("Periods in Year: ");
            year = scanner.nextInt();
            if (year >=1 && year <= 30) {
                numberOfPayments = year * MONTHS; 
                break;
            }
            else{
                System.out.println("Enter a value between 1 and 30");
            }
        }
        
        double morgage = principal * monthlyInterest * (Math.pow(1 + monthlyInterest, numberOfPayments))/ Math.pow(1 + monthlyInterest, numberOfPayments) - 1;
        
        String morgageFormatted = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(morgage);
        System.out.println(morgageFormatted);
    }
}
