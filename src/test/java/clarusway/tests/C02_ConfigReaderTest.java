package clarusway.tests;

import clarusway.utilities.ConfigReader;
import clarusway.utilities.Driver;
import org.testng.annotations.Test;

public class C02_ConfigReaderTest {

    @Test
    void configReaderTest() {

        //Go to Clarusway
        String claruswayUrl= ConfigReader.getProperty("clarusway_url");
        Driver.getDriver().get(claruswayUrl);
        System.out.println(Driver.getDriver().getTitle());

        //Go to Google
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
        System.out.println(Driver.getDriver().getTitle());


        Driver.closeDriver();
    }

}
