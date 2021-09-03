package methods;

import com.codeborne.selenide.Configuration;
import selectors.LoginSelector;
import utils.Log;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class LoginMethod extends LoginSelector {
    Properties props = new Properties();

    public void fillingInTheLogin() throws IOException {

        props.load(new FileInputStream("src/main/resources/login.properties"));
        Log.info("Ввели значения Login");
        loginName.sendKeys(props.getProperty("login.userName"));
        Log.info("Ввели значения Password");
        passwordField.sendKeys(props.getProperty("login.Password"));
        Log.info("Пробуем перейти на сайт");
        signInButton.click();
    }

    public void welcomeMessage() {
        Log.info("Проверяем переход на главную страницу");
        welcomeMessage.shouldBe(visible);
    }

    public void openPage() {
        Log.info("Открываем страницу для ввода логина и пароля");
        open("https://opensource-demo.orangehrmlive.com/");


    }
}
