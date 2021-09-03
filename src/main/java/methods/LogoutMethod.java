package methods;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import selectors.LoginSelector;
import selectors.LogoutSelector;
import utils.Log;

import static com.codeborne.selenide.Selenide.$;

public class LogoutMethod extends LogoutSelector {
    public void loginOut() {
        Log.info("Выходим на начальную страницу");
        welcomeLogout.click();
        logoutClick.click();
        out.shouldBe(Condition.visible);
    }
}
