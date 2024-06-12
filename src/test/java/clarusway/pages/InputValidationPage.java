package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class InputValidationPage {

    public InputValidationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "firstname")
    public WebElement firstname;

    @FindBys({//And operator gibi 2 locator'ın da doğru olmasını ister
            @FindBy(id = "surname"),
            @FindBy(xpath = "//input[@name='surname']")
    })
    public WebElement lastname;

    @FindAll({//Or operator gibi çoklu locator'dan biri doğru olmasını yeterlidir
            @FindBy(id = "notes"),
            @FindBy(name = "notes"),
            @FindBy(xpath = "//textarea[@maxlength='2000']")
    })
    public WebElement notes;

}
