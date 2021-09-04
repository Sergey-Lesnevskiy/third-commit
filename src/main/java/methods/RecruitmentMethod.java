package methods;



import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import selectors.RecruitmentSelector;

import utils.Log;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import static org.junit.gen5.api.Assertions.assertEquals;

public class RecruitmentMethod extends RecruitmentSelector {
    Properties props = new Properties();
   @Step("Переходим в раздел добавления Recruitment")
    public void goToAdd() {
        Log.info("Переходим в раздел добавления Recruitment");
        recruimentClick.click();
        candidatesClick.click();
        candidatesAddClick.click();
    }
    @Step("Заполняем поля пользователя в Recruitment")
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
    @Step("Проверяем наличие кандидата в списке Recruitment")
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
