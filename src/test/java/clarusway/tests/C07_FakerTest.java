package clarusway.tests;

import clarusway.pages.CLHomePage;
import clarusway.utilities.ConfigReader;
import clarusway.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class C07_FakerTest {

    @Test
    void fakerTest() throws InterruptedException {

        CLHomePage clHomePage = new CLHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("contactlist_url"));

        clHomePage.email.sendKeys(Faker.instance().internet().emailAddress());

        clHomePage.password.sendKeys(Faker.instance().internet().password() + Keys.ENTER);

        Thread.sleep(200);

        String error = clHomePage.error.getText();

        assertEquals(error,"Incorrect username or password");

        Driver.closeDriver();

    }
}
