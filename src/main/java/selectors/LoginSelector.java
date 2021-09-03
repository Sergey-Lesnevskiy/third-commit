package selectors;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LoginSelector {
    public SelenideElement loginName = $(By.name("txtUsername"));
    public SelenideElement passwordField = $(By.name("txtPassword"));
    public SelenideElement signInButton = $(By.name("Submit"));
    public SelenideElement welcomeMessage = $("#welcome");// для проверки


}
