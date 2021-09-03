package methods;

import com.codeborne.selenide.Configuration;
import org.junit.gen5.api.AfterAll;
import utils.Log;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class Before1 {

    public void openDR() {
        Configuration.startMaximized = true;
    }

    public void openPage() {
        Log.info("Открываем страницу для ввода логина и пароля");
        open("https://opensource-demo.orangehrmlive.com/");

    }

}
