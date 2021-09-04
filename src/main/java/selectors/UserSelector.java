package selectors;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class UserSelector {
    //заполнения
    public SelenideElement clickAdmin = $("#menu_admin_viewAdminModule");
    public SelenideElement clickAdd = $("#btnAdd");
    public SelenideElement useRole = $(By.name("systemUser[userType]"));
    public SelenideElement employeeName = $(By.name("systemUser[employeeName][empName]"));
    public SelenideElement username1 = $("#systemUser_userName");
    public SelenideElement statusUser = $("#systemUser_status");
    public SelenideElement password1 = $(By.name("systemUser[password]"));
    public SelenideElement confirmPassword = $("#systemUser_confirmPassword");
    public SelenideElement save1 = $(By.name("btnSave"));
    //проверка
    public SelenideElement checkName =$("input[name='searchSystemUser[userName]']");
    public SelenideElement checkRole =$("#searchSystemUser_userType");
    public SelenideElement checkEmployee =$("[name='searchSystemUser[employeeName][empName]']");
    public SelenideElement checkStatus =$("#searchSystemUser_status");
    public SelenideElement checkESS =$(By.xpath("//option[text()='Admin']"));
    public SelenideElement checkSearch=$("[value='Search']");
    public SelenideElement tableClassUser = $("[class='table hover']");
}
