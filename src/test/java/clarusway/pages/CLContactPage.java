package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CLContactPage {

    public CLContactPage(){//Bu classtan obje oluştururken PageFactory ile web elementler aktif hale getirilir. Aksi halde null kalırlar.
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "logout")
    public WebElement logout;




}
