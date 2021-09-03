package selectors;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class JobSelector {
    public SelenideElement jobSelector = $(By.xpath("//a[text()='Job']"));
    public SelenideElement jobTitles = $(By.xpath("//a[text()='Job Titles']"));
    public SelenideElement jobAdd = $(By.name("btnAdd"));
    public SelenideElement jobTitlesAdd = $(By.name("jobTitle[jobTitle]"));
    public SelenideElement jobDescription = $(By.name("jobTitle[jobDescription]"));
    public SelenideElement jobNote = $(By.name("jobTitle[note]"));
    public SelenideElement joSave = $(By.name("btnSave"));
    public SelenideElement deleteButton = $(By.name("btnDelete"));
    public SelenideElement deleteOk = $("#dialogDeleteBtn");
    public SelenideElement tableJob = $("[class='table hover']");
}
