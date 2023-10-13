import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EmiTestRunner extends Setup {
    @BeforeTest
    public void startEmiCalc() {
        EmiScreen emiScreen = new EmiScreen(driver);
        emiScreen.btnStart.click();
    }

    @Test(priority = 1, description = "Calculate Emi", dataProviderClass = Dataset.class, dataProvider = "data-provider")
    public void calculateEmi(int amount, double interest, int year, double processingFee, int mEMI, int tInterest, int pFee, int tPayment) {
        EmiScreen emiScreen = new EmiScreen(driver);
        emiScreen.calculateEmi(amount, interest, year, processingFee);


        int actual_mEMI = (int) Math.round(Double.parseDouble(emiScreen.lblMonthlyEmi.getText().replace(",", "")));
        int actual_tInterest = (int) Math.round(Double.parseDouble(emiScreen.lblTotalInterest.getText().replace(",", "")));
        int actual_pFee = (int)Math.round(Double.parseDouble(emiScreen.lblProcessingFee.getText().replace(",", "")));
        int actual_tPayment = (int) Math.round(Double.parseDouble(emiScreen.lblTotalPayment.getText().replace(",", "")));

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actual_mEMI,mEMI);
        softAssert.assertEquals(actual_tInterest,tInterest);
        softAssert.assertEquals(actual_pFee,pFee);
        softAssert.assertEquals(actual_tPayment,tPayment);
        softAssert.assertAll();

        emiScreen.btnReset.click();
    }

}
