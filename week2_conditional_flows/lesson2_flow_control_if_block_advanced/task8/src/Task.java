import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int yearIncome = sc.nextInt();
        boolean hasSuccessLoansHistoryInBank = sc.nextBoolean();
        boolean hasCriminalRecords = sc.nextBoolean();
        boolean hasRequiredDocuments = sc.nextBoolean();

        if (yearIncome < 0) {
            System.out.println("Income can not be negative");
            return;
        }

        if (yearIncome >= 30) {
            if (hasSuccessLoansHistoryInBank) {
                System.out.println("Loan");
            } else  {
                if (hasRequiredDocuments) {
                    System.out.println("Loan");
                } else {
                    System.out.println("No Loan");
                }
            }
        } else {
            if (!hasCriminalRecords) {
                if (hasRequiredDocuments) {
                    System.out.println("Loan");
                } else {
                    System.out.println("No Loan");
                }
            } else {
                System.out.println("No Loan");
            }
        }
    }
}