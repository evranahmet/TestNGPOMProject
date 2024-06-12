package clarusway.tests;

import clarusway.pages.CLContactPage;
import clarusway.pages.CLHomePage;
import clarusway.utilities.ConfigReader;
import clarusway.utilities.Driver;
import org.testng.annotations.Test;

public class C03_PageFactoryTest {

    @Test
    void pageFactoryTest() {

        Driver.getDriver().get(ConfigReader.getProperty("contactlist_url"));

        CLHomePage contactListHomePage = new CLHomePage();

        contactListHomePage.email.sendKeys("clarusway@hotmail.com");

        contactListHomePage.password.sendKeys("Clarusway.123");

        contactListHomePage.submit.click();

        CLContactPage contactListContactPage = new CLContactPage();

        assert contactListContactPage.logout.isDisplayed();

        Driver.closeDriver();
    }

}
