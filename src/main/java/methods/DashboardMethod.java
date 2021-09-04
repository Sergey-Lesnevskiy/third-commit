package methods;

import com.codeborne.selenide.*;
import io.qameta.allure.Step;
import selectors.DashboardSelector;
import utils.Log;

import static com.codeborne.selenide.Condition.text;

public class DashboardMethod extends DashboardSelector {

    @Step("Переходим в раздел Dashboard")
    public void goToDashboardClick() {
        Log.info("переходим в раздел Dashboard");
        dashboardClick.click();
    }

    @Step("Проверяем всю информацию в Quick Launce в раздел Dashboard")
    public void checkQuickLaunce() {
        Selenide.sleep(2000);
        Log.info("Проверяем всю информацию в Quick Launce");
        ElementsCollection elements1 = tableQuickLaunce.$$("tr");
        elements1.should(CollectionCondition.texts(assignLeave));
    }

    @Step("Проверяем всю информацию в Legend в раздел Dashboard")
    public void checkLegend() {
        Selenide.sleep(2000);
        Log.info("Проверяем всю информацию в Legend");
        ElementsCollection elements2 = tableLegend.$$("tbody");
        elements2.should(CollectionCondition.texts(notAssignedToSubunits));
        System.out.println(elements2.texts());
    }

    @Step("Проверяем информацию в Employee Pending Leave Requests в раздел Dashboard")
    public void checkEmployeeDistributionBySubunit() {
        Selenide.sleep(2000);
        Log.info("Проверяем всю информацию в Employee Pending Leave Requests");
        ElementsCollection elements3 = tableEmployeeDistributionBySubunit.$$("span");
        elements3.should(CollectionCondition.texts(num));
    }

    @Step("Проверяем текст No Records are Available в раздел Dashboard")
    public void checkTablePendingLeaveRequests() {
        Selenide.sleep(2000);
        Log.info("Проверяем текст No Records are Available ");
        tablePendingLeaveRequests.should(text(noRecordsAreAvailable));
    }

    @Step("Проверяем название раздела Dashboard")
    public void dashboardCheckText() {
        Log.info("Проверяем название раздела Dashboard");
        dashboardCheck.shouldHave(text(expectedDashboard));
    }

    @Step("Проверяем название раздела Quick Launch в раздел Dashboard")
    public void quickLaunchText() {
        Log.info("Проверяем название раздела Quick Launch");
        quickLaunch.shouldHave(text(expectedQuickLaunch));
    }

    @Step("Проверяем название раздела Employee Distribution by Subunit в раздел Dashboard")
    public void employeeDistributionByySubunitText() {
        Log.info("Проверяем название раздела Employee Distribution by Subunit");
        employeeDistributionByySubunit.shouldHave(text(expectedEmployeeDistributionByySubunit));
    }

    @Step("Проверяем название раздела Pending Leave Requests в раздел Dashboard")
    public void pendingLeaveRequestsText() {
        Log.info("Проверяем название раздела Pending Leave Requests");
        pendingLeaveRequestsText.shouldHave(text(expectedPendingLeaveRequestsText));
    }

    @Step("Проверяем название раздела Legend в раздел Dashboard")
    public void legendText() {
        Log.info("Проверяем название раздела Legend");
        legendText.shouldHave(text(expectedLegend));
    }

}
