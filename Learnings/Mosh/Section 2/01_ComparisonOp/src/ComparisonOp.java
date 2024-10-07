public class ComparisonOp {
    public static void main(String[] args) throws Exception {
        int x = 1;
        int y = 1;
        System.out.println(x == y);

        System.out.println(x != y);

        System.out.println(x > y);

        System.out.println( x <= y);

        System.out.println( "-----" );
        int temp = 20;
        Boolean isWarm = temp > 20 && temp < 30;

        System.out.println(isWarm);

        System.out.println( "-----" );
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isElligibleForLoan = ( hasGoodCredit || hasHighIncome ) && !(hasCriminalRecord);

        System.out.println(isElligibleForLoan);

        System.out.println( "---IF STATEMENTS---" );
        int temperature = 22;
        if ( temperature > 30) {
            System.out.println("It's hot today");
            System.out.println("Drink water!!");
        } else if (temperature > 20) {
            System.out.println("Beautiful Day");
        } else {
            System.out.println("It's a cold day");
        }

        System.out.println( "---IF STATEMENTS---" );
        int income = 120_000;
        boolean hasHighInc = income > 100_000;
       
        System.out.println(hasHighInc);

        System.out.println( "---IF STATEMENTS-TERNARY OP---" );
    }
}
