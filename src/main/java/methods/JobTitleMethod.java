package methods;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.gen5.api.Assertions;
import org.openqa.selenium.By;
import selectors.JobSelector;
import utils.Log;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class JobTitleMethod extends JobSelector {
    Properties props = new Properties();

    public void goToTheJob() {
        Log.info("Переходим на Job");
        jobSelector.click();
        jobTitles.click();
    }

    public void addJobTitles() throws IOException {

        props.load(new FileInputStream("src/main/resources/job.properties"));
        Log.info("Добавляем 3 вакансии");
        for (int i = 0; i < 3; i++) {
            jobAdd.click();
            jobTitlesAdd.setValue(props.getProperty("job.titles" + i));
            jobDescription.setValue(props.getProperty("job.description"));
            jobNote.setValue(props.getProperty("job.note"));
            joSave.click();
        }
    }

    public void checkJob() throws IOException {
        props.load(new FileInputStream("src/main/resources/job.properties"));
        ElementsCollection list = $$(withText("rock-musician"));
        //я хотел попробовать найти по части текста и можно было на этом остановиться, но я сделал ещё одну проверку, а вдруг есть персонаж "rock-musician-folk-punk"
        for (int i = 0; i < 3; i++) {
            Assertions.assertEquals(props.getProperty("job.titles" + i), list.get(i).text());
        }
    }

    public void deleteJobTitles() {
        Log.info("Удаляем созданные 3 вакансии");
        for (int i = 0; i < 3; i++) {
            $(By.xpath("//a[text()='" + props.getProperty("job.titles" + i) + "']/../../td[1]"))
                    .click();

        }
        deleteButton.click();
        deleteOk.click();
    }

    public void checkDeleteJob() {
        Log.info("Проверяем удаление");
        tableJob.shouldNotBe(text("rock-musician1"));
        tableJob.shouldNotBe(text("rock-musician2"));
        tableJob.shouldNotBe(text("rock-musician3"));
    }


}
