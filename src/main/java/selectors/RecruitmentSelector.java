package selectors;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import text.RecruitmentText;

import static com.codeborne.selenide.Selenide.$;

public class RecruitmentSelector extends RecruitmentText{

    public SelenideElement recruimentClick = $(By.xpath("//b[text()='Recruitment']"));
    public SelenideElement candidatesClick = $(By.xpath("//a[text()='Candidates']"));
    public SelenideElement candidatesAddClick = $("#btnAdd");
    public SelenideElement firstNameCandidates = $("#addCandidate_firstName");
    public SelenideElement middleNameCandidates = $("[id='addCandidate_middleName']");
    public SelenideElement lastNameCandidates = $("#addCandidate_lastName");
    public SelenideElement emailCandidates = $(By.name("addCandidate[email]"));
    public SelenideElement contactNoCandidates = $(By.name("addCandidate[contactNo]"));
    public SelenideElement jobVacancyCandidates = $(By.name("addCandidate[vacancy]"));
    public SelenideElement juniorAccountAssistantCandidates = $(By.xpath("//option[text()='Junior Account Assistant']"));
    //  public SelenideElement resumeCandidates= $(By.xpath("//option[text()='Junior Account Assistant']"));
    public SelenideElement keywordsCandidates = $(By.name("addCandidate[keyWords]"));
    public SelenideElement commentCandidate = $(By.name("addCandidate[comment]"));
    public SelenideElement dateOfApplicationCandidates = $(By.name("addCandidate[appliedDate]"));
    public SelenideElement timeClick = $(By.xpath(" //a[text()='1']"));
    public SelenideElement consentToKeepDataCandidates = $(By.name("addCandidate[consentToKeepData]"));
    public SelenideElement buttonSaveCandidates = $("[value='Save']");
    public SelenideElement buttonBackCandidates = $("[value='Back']");
    public SelenideElement candidateSearchKeywords = $("[name='candidateSearch[keywords]']");
    //проверка по имени
    public SelenideElement clickSearch = $("[value='Search']");
    public SelenideElement checkCandidates = $(By.xpath("//a[text()='wqe qqwe qwe']"));
    public SelenideElement textCandidate =$(By.xpath("//table[@class='table hover']"));
}
