package methods;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.gen5.api.Assertions;
import selectors.UserSelector;
import utils.Log;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;


public class UserMethod extends UserSelector {
    String disabled = "Disabled";
    String admin = "Admin";
    Properties props = new Properties();

    public void switchingToUser() {
        Log.info("Переходим в разел админ");
        clickAdmin.click();
        Log.info("Переходим в разел добавления User");
        clickAdd.click();
    }

    public void formFilling() throws IOException {
        Log.info("Выбираем какая будет Use Role");
        useRole.selectOptionContainingText(admin);
        props.load(new FileInputStream("src/main/resources/user.properties"));
        Log.info("Ввели значения employeeName");
        employeeName.sendKeys(props.getProperty("user.Employee"));
        Log.info("Ввели значения userName");
        username1.sendKeys(props.getProperty("user.Username"));
        Log.info("Выбираем какой будет status User");
        statusUser.selectOptionContainingText(disabled);
        Log.info("Ввели значения password user");
        password1.sendKeys(props.getProperty("user.Password"));
        Log.info("Ввели значения повторно password user");
        confirmPassword.sendKeys(props.getProperty("user.ConfirmPassword"));
        Selenide.sleep(2000);
        Log.info("Сохраняем user");
        save1.click();
        Selenide.sleep(2000);
    }

    public void findUser() throws IOException {
        props.load(new FileInputStream("src/main/resources/user.properties"));
        Log.info("Производим поиск user и вводим Username");
        checkName.sendKeys(props.getProperty("user.Username"));
        Log.info("Выбираем Use Role");
        checkRole.selectOptionContainingText(admin);
        checkESS.click();
        Log.info("Ввели значения Employee");
        checkEmployee.sendKeys(props.getProperty("user.Employee"));
        Log.info("Выбираем status User");
        checkStatus.selectOptionContainingText(disabled);
        Log.info("Проводим поиск user");
        checkSearch.click();
        Selenide.sleep(2000);
    }

    public void checkFormUser() {
        Log.info("Проверяем формы ввода для заполнения user");
        employeeName.shouldBe(visible);
        username1.shouldBe(exist);
        password1.shouldBe(visible);
        confirmPassword.shouldBe(exist);
    }

    public void checkUser() {
        Log.info("проверяем наличие User на странице");
        ElementsCollection elements = tableClassUser.$$("tr");
        Assertions.assertEquals(props.getProperty("user.Username") + " Admin " + props.getProperty("user.Employee") + " Disabled", elements.last().getText());
    }
}
