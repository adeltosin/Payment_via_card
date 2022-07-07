package stepdefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.FormPage;

public class FormStepdefs {
    public FormPage formPage;
    public static WebDriver driver = null;

    public FormStepdefs()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Josephina\\IdeaProjects\\blueskycitadeltraining\\src\\test\\resources\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        formPage = new FormPage(driver);
    }

    @Given("^I navigate to the website$")
    public void iNavigateToTheWebsite() {

   // I am navigating to the website
   driver.get("http://blueskycitadel.com/automation-testing-form/");
   driver.manage().window().maximize();
    }

    @And("^I fill all the registration form$")
    public void iFillAllTheRegistrationForm() {
        formPage.EnterSingleLineText();
        //driver.findElement(By.cssSelector("#nf-field-135")).sendKeys("Test");
        //new Select(driver.findElement(By.cssSelector("#nf-field-136"))).selectByValue("three");
        //driver.findElement(By.xpath("//*[@id=\"nf-field-136\"]/option[2]")).click();
        //driver.findElement(By.cssSelector("#nf-field-124")).sendKeys("test@testing.com");
        //driver.findElement(By.cssSelector("#nf-field-144")).sendKeys("Password");
        //driver.findElement(By.xpath("//*[@id=\"nf-field-137\"]/option[1]")).click();
        //driver.findElement(By.xpath("//*[@id=\"nf-field-137\"]/option[2]")).click();
        //driver.findElement(By.xpath("//*[@id=\"nf-field-137\"]/option[3]")).click();

    }

    @When("^I click on the submit button$")
    public void iClickOnTheSubmitButton() {
    }

    @Then("^the form completed successfully$")
    public void theFormCompletedSuccessfully() {
    }
}
