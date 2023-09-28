package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//Cucumber ile junit'in entegre olmasını sağlayan scenario çalıştırıcı notasyonu
@CucumberOptions(features = "src/test/resources/features",//features package'ının yolu (content root)
        glue = "stepDefinitions",//stepDefinitions package ismi
        tags = "@iphone and @amazon"//Hangi scenarioları bu tag'ı belirtirsek o scenariolar çalışır
)



public class Runner {
    /*
        @CucumberOptions() bu notasyon sayesinde hangi scenariolari çalıştıracağımızı ve hangi raporları
    alacağımızı belirtiriz
     */
}