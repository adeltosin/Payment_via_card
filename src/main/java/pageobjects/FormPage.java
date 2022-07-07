package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FormPage {
    
    public FormPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    @FindBy(how = How.CSS, using ="#nf-field-135")
    private WebElement singlelinetext;

    public void EnterSingleLineText()
    {
        singlelinetext.sendKeys("Test");
    }
}
