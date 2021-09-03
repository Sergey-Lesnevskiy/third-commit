
package selectors;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LogoutSelector {

    public SelenideElement welcomeLogout=$("[class='panelTrigger']");
    public SelenideElement logoutClick=$(By.xpath("//a[text()='Logout']"));
    public  SelenideElement out =$(By.xpath("//div[text()='LOGIN Panel']"));


}
