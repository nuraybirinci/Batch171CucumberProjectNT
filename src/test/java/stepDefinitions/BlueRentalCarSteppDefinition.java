package stepDefinitions;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.BlueRentalPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class BlueRentalCarSteppDefinition {
    BlueRentalPage rentalPage = new BlueRentalPage();
    @Given("kullanici blueRentalCar sayfasina gider")
    public void kullaniciBlueRentalCarSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));
    }

    @But("login butonuna tiklar")
    public void loginButonunaTiklar() {
        rentalPage.loginButonu.click();
        ReusableMethods.bekle(2);
    }

    @Then("email ve password bilgileri ile login olur")
    public void emailVePasswordBilgileriIleLoginOlur() {
        rentalPage.email.sendKeys(ConfigReader.getProperty("email1"), Keys.TAB,
                ConfigReader.getProperty("password1"),Keys.ENTER);
        ReusableMethods.bekle(3);
    }

    @Then("email ve password bilgilerini girer")
    public void emailVePasswordBilgileriniGirer() {
        rentalPage.email.sendKeys(ConfigReader.getProperty("email2"), Keys.TAB,
                ConfigReader.getProperty("password2"),Keys.ENTER);
        ReusableMethods.bekle(3);
    }
}
