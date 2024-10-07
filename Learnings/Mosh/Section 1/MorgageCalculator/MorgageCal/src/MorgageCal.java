import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class MorgageCal {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        final byte MONTHS = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal is: ");
        int principal = scanner.nextInt();

        System.out.println("Annual Rate of Interest is: ");
        float annualRateInterest = scanner.nextFloat();

        float monthlyInterest = annualRateInterest / PERCENT / MONTHS;

        System.out.println("Periods in Year: ");
        int year = scanner.nextInt();

        int numberOfPayments = year * MONTHS;
        
        double morgage = principal * monthlyInterest * (Math.pow(1 + monthlyInterest, numberOfPayments))/ Math.pow(1 + monthlyInterest, numberOfPayments) - 1;
        
        String morgageFormatted = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(morgage);
        System.out.println(morgageFormatted);
    }
}
