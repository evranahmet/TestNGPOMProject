package clarusway.tests;

import clarusway.pages.InputValidationPage;
import clarusway.utilities.ConfigReader;
import clarusway.utilities.Driver;
import org.testng.annotations.Test;

public class C05_FindBysFindAll {
/*
    @FindBy, @FindBys ve @FindAll, Java programlama dili ve Selenium test otomasyon aracıyla web sayfalarındaki elemanları bulmak için kullanılan annotasyonlardır.

    @FindBy tek bir locator ile,

    @FindBys birden çok kriteri birleştiren elemanları(AND)

    @FindAll birden çok kriter arasında herhangi birini karşılayan elemanları bulmak için kullanılır.(OR)

    Bu annotasyonlar, Selenium test senaryolarını daha esnek ve okunabilir hale getirmek için kullanılır.
*/

    @Test
    void findBysFindAllTest() throws InterruptedException {

        InputValidationPage inputValidationPage = new InputValidationPage();

        Driver.getDriver().get(ConfigReader.getProperty("inputvalidation_url"));

        inputValidationPage.firstname.sendKeys("John");
        Thread.sleep(2000);
        inputValidationPage.lastname.sendKeys("Doe");
        Thread.sleep(2000);
        inputValidationPage.notes.sendKeys("Hello World");


        Driver.closeDriver();
    }



}
