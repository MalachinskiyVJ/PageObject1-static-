import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class DashboardPage {
    public static SelenideElement diagram = $(".rz-sellerorder-diagram-block");
    public static ElementsCollection viewall = $$(".novisited").filterBy(text("Посмотреть все"));

    public static void viewallClick(){
        viewall.get(0).click();
    }
}
