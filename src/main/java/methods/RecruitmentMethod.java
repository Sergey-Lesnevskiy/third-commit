package methods;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import selectors.RecruitmentSelector;
import text.RecruitmentText;
import utils.Log;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.$;
import static org.junit.gen5.api.Assertions.assertEquals;

public class RecruitmentMethod extends RecruitmentSelector {
    Properties props = new Properties();
    RecruitmentText recruitmentText = new RecruitmentText();

    public void goToAdd() {
        Log.info("Переходим в раздел добавления Recruitment");
        recruimentClick.click();
        candidatesClick.click();
        candidatesAddClick.click();
    }

    public void fillingInTheCandidates() throws IOException {
        props.load(new FileInputStream("src/main/resources/candidate.properties"));
        Log.info("Вводим данные в поля заполнения кандидата");
        firstNameCandidates.sendKeys(props.getProperty("candidate.firstName"));
        middleNameCandidates.sendKeys(props.getProperty("candidate.middleName1"));
        lastNameCandidates.sendKeys(props.getProperty("candidate.lastName"));
        emailCandidates.sendKeys(props.getProperty("candidate.email1"));
        contactNoCandidates.sendKeys(props.getProperty("candidate.contactNo"));
        jobVacancyCandidates.selectOptionContainingText("Junior Account Assistant");
        Log.info("Вводим персональный ключь");
        keywordsCandidates.sendKeys(props.getProperty("candidate.keywords"));
        commentCandidate.sendKeys(props.getProperty("candidate.comment1"));
        dateOfApplicationCandidates.click();
        timeClick.click();
        consentToKeepDataCandidates.click();
        Log.info("Сохраняем данные");
        buttonSaveCandidates.click();
        buttonBackCandidates.click();
    }

    public void checkCandidatesRe() throws IOException {
        props.load(new FileInputStream("src/main/resources/candidate.properties"));
        Log.info("Произвадим поиск по персональному ключу");
        candidateSearchKeywords.sendKeys(props.getProperty("candidate.keywords"));
        clickSearch.click();
        Selenide.sleep(2000);
        SelenideElement actual = textCandidate.$("tbody");
        Log.info("Проверяем наличие кандидата в списке");
        assertEquals(expectedAnton, actual.getText());

    }

}
