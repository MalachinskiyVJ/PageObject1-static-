import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class TestMarket {
    @BeforeTest
    public void set() {
        Configuration.browser = "chrome";
        Configuration.timeout = 5000;
        open("http://market.test2.local");
    }

    @Test
    public void test() {
        LoginPage.username.shouldBe(visible);
        LoginPage.password.shouldNot(disappear);
        LoginPage.login("Notus", "123qweqwe");

        DashboardPage.diagram.shouldBe(hidden);
        DashboardPage.viewallClick();

        OrdersPage.h2.shouldBe(visible);
    }
}
