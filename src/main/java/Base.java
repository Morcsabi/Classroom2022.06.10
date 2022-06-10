import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Base {

    WebDriver driver;

    public Base(WebDriver driver){
        this.driver = driver;
            }

    public final String url = "https://automationpractice.com/index.php";

    public final By signInButton = By.xpath("//*[class=\"login\"]");

    public CreateAccountPage clickOnSignIn(){
        driver.findElement(signInButton).click();
        return new CreateAccountPage();
    }

}
