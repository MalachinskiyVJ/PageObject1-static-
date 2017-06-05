import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public  static SelenideElement username = $("#username"),
    password = $("#password"),
    submitButton = $(By.xpath("//button[contains (@class, 'btn-link-sign')]"));

    public static void login(String name, String pwd){
        username.sendKeys(name);
        password.sendKeys(pwd);
        submitButton.click();


    }
}
