import com.artcode.OutputRedirectionParentTest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Tests extends OutputRedirectionParentTest {

  @Parameterized.Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][] {
            {30, true, false, false, "Loan"},
            {35, false, false, true, "Loan"},
            {30, false, false, false, "No Loan"},
            {25, false, true, false, "No Loan"},
            {25, false, false, true, "Loan"},
            {-1, false, false, true, "Income can not be negative"},
    });
  }

  int yearIncome;
  boolean hasSuccessLoansHistoryInBank;
  boolean hasCriminalRecords;
  boolean hasRequiredDocuments;
  String expectedMessage;

  public Tests(int yearIncome, boolean hasSuccessLoansHistoryInBank, boolean hasCriminalRecords,
               boolean hasRequiredDocuments, String expectedMessage) {
    this.yearIncome = yearIncome;
    this.hasSuccessLoansHistoryInBank = hasSuccessLoansHistoryInBank;
    this.hasCriminalRecords = hasCriminalRecords;
    this.hasRequiredDocuments = hasRequiredDocuments;
    this.expectedMessage = expectedMessage;
  }

  @Test
  public void testAll() {

    System.setIn(new ByteArrayInputStream(
            String.format("%s %s %s %s",
                            yearIncome, hasSuccessLoansHistoryInBank, hasCriminalRecords, hasRequiredDocuments)
                    .getBytes()));

    Task.main(new String[0]);

    String actual = baos.toString();
    Assert.assertEquals(expectedMessage + "\n", actual);
  }

}
