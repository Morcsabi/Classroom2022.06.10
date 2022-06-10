import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage{

    WebDriver driver;

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public final By emailBox = By.xpath("//*[@id=\"email_create\"]");

    public final By createButton = By.xpath("//*[@id=\"SubmitCreate\"]");

    public RegisterPage sendEmailAddress(String emailAddress) {


    }
}
