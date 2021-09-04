package methods;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import selectors.LogoutSelector;
import utils.Log;

public class LogoutMethod extends LogoutSelector {
    @Step("Выходим на начальную страницу ")
    public void loginOut() {
        Log.info("Выходим на начальную страницу");
        welcomeLogout.click();
        logoutClick.click();
        out.shouldBe(Condition.visible);
    }
}
