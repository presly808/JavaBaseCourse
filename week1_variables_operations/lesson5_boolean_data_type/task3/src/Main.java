public class Main {
   public static void main(String[] args) {
      // GIVEN
      // User Input data
      int creditScore = 700;
      int monthIncome = 7000;
      boolean hasTaxReport = true;
      int yearIncome = monthIncome * 12;
      boolean hasElectronicSignature = true;
      boolean locatedInCity = false;
      boolean hasResidence = false;
      int yearRequiredInCountry = 3;
      // Company Input
      int yearsInCountry = 4;
      int creditScoreScale = 690;
      int neededMonthSalary = 8000;
      int neededYearIncome = 96000;

      // we break up big operations into small ones and then combine
      // it this way, we can print each value to the console in order to troubleshoot
      boolean creditScoreRes = creditScore > creditScoreScale;
      boolean incomeVerificationRes = monthIncome >= neededMonthSalary || (hasTaxReport && yearIncome >= neededYearIncome);
      boolean signatureRes = hasElectronicSignature || locatedInCity;
      boolean residenceRes = hasResidence || yearsInCountry >= yearRequiredInCountry;

      boolean all = creditScoreRes && incomeVerificationRes && signatureRes && residenceRes;
      System.out.printf("Have you met all conditions? %s", all);
   }
}