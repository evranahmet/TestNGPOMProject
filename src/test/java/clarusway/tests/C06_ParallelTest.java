package clarusway.tests;

import clarusway.utilities.ConfigReader;
import clarusway.utilities.DriverThreadLocal;
import org.testng.annotations.Test;

public class C06_ParallelTest {

    @Test
    void test1(){

        DriverThreadLocal.setDriver();

        DriverThreadLocal.getDriver().get(ConfigReader.getProperty("google_url"));

        System.out.println(DriverThreadLocal.getDriver().getTitle());

        DriverThreadLocal.closeBrowser();

    }


    @Test
    void test2(){

        DriverThreadLocal.setDriver();

        DriverThreadLocal.getDriver().get(ConfigReader.getProperty("clarusway_url"));

        System.out.println(DriverThreadLocal.getDriver().getTitle());

        DriverThreadLocal.closeBrowser();


    }


    @Test
    void test3(){

        DriverThreadLocal.setDriver();

        DriverThreadLocal.getDriver().get(ConfigReader.getProperty("contactlist_url"));

        System.out.println(DriverThreadLocal.getDriver().getTitle());

        DriverThreadLocal.closeBrowser();


    }


}
