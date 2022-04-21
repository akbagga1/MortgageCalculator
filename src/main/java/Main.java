import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final byte Percent = 100;
        final byte MonthsInAYear = 12;

        Scanner scanner = new Scanner(System.in);
        //
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Period (Years): ");
        byte periodYears = scanner.nextByte();
        float numberOfMonthlyPayments = periodYears * MonthsInAYear;

        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterestRate = annualInterestRate / Percent / MonthsInAYear;

        double mortgage = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonthlyPayments)) / (Math.pow(1 + monthlyInterestRate, numberOfMonthlyPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " + mortgageFormatted);



    }
}
