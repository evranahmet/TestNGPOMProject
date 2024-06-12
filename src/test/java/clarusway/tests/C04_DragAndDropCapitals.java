package clarusway.tests;

import clarusway.pages.DHTMLPage;
import clarusway.utilities.ConfigReader;
import clarusway.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class C04_DragAndDropCapitals {

    @Test
    void test1(){

        DHTMLPage dhtmlPage = new DHTMLPage();

        Driver.getDriver().get(ConfigReader.getProperty("dhtml_url"));

        Actions actions = new Actions(Driver.getDriver());

        actions
                .dragAndDrop(dhtmlPage.oslo, dhtmlPage.norway)
                .pause(500)
                .dragAndDrop(dhtmlPage.stockholm, dhtmlPage.sweden)
                .pause(500)
                .dragAndDrop(dhtmlPage.washington, dhtmlPage.usa)
                .pause(500)
                .dragAndDrop(dhtmlPage.seoul, dhtmlPage.korea)
                .pause(500)
                .dragAndDrop(dhtmlPage.madrid, dhtmlPage.spain)
                .pause(500)
                .dragAndDrop(dhtmlPage.copenhagen, dhtmlPage.denmark)
                .pause(500)
                .dragAndDrop(dhtmlPage.rome, dhtmlPage.italy)
                .perform();


        Driver.closeDriver();

    }

}
