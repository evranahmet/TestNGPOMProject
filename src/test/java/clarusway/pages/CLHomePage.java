package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CLHomePage {

    public CLHomePage(){//Bu classtan obje oluştururken PageFactory ile web elementler aktif hale getirilir. Aksi halde null kalırlar.
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submit")
    public WebElement submit;

    @FindBy(id = "signup")
    public WebElement signup;

    @FindBy(id = "error")
    public WebElement error;

}
