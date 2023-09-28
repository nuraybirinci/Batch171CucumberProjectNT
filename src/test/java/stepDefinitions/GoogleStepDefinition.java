package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class GoogleStepDefinition {
    GooglePage googlePage = new GooglePage();

    @Then("arama kutusunda {string} aratir")
    public void aramaKutusundaAratir(String arac) {
        googlePage.aramaKutusu.sendKeys(arac, Keys.ENTER);
    }

    @And("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String arac) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(arac));
    }

    @But("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);
    }

    @Then("arama kutusunda scenarioOutline ile {string} aratir")
    public void aramaKutusundaScenarioOutlineIleAratir(String arac) {
        googlePage.aramaKutusu.sendKeys(arac,Keys.ENTER);
    }

    @And("sayfa basliginin scenarioOutline ile {string} icerdigini test eder")
    public void sayfaBasligininScenarioOutlineIleIcerdiginiTestEder(String arac) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(arac));
    }
}
