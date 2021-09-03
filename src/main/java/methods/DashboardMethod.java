package methods;

import com.codeborne.selenide.*;
import selectors.DashboardSelector;
import utils.Log;
import static com.codeborne.selenide.Condition.text;
public class DashboardMethod extends DashboardSelector {


    public void goToDashboardClick() {
        Log.info("переходим в раздел Dashboard");
        dashboardClick.click();
    }

    public void checkQuickLaunce() {
        Selenide.sleep(2000);
        Log.info("Проверяем всю информацию в Quick Launce");
        ElementsCollection elements1 = tableQuickLaunce.$$("tr");
        elements1.should(CollectionCondition.texts(assignLeave));
    }

    public void checkLegend() {
        Selenide.sleep(2000);
        Log.info("Проверяем всю информацию в Legend");
        ElementsCollection elements2 = tableLegend.$$("tbody");
       // elements2.should(CollectionCondition.texts(notAssignedToSubunits));
        System.out.println( elements2.texts());
    }

    public void checkEmployeeDistributionBySubunit() {
        Selenide.sleep(2000);
        Log.info("Проверяем всю информацию в Employee Pending Leave Requests");
        ElementsCollection elements3 = tableEmployeeDistributionBySubunit.$$("span");
        elements3.should(CollectionCondition.texts(num));
    }

    public void checkTablePendingLeaveRequests() {
        Selenide.sleep(2000);
        Log.info("Проверяем текст No Records are Available ");
        tablePendingLeaveRequests.should(text(noRecordsAreAvailable));
    }

    public void dashboardCheckText() {
        Log.info("Проверяем название раздела Dashboard");
        dashboardCheck.shouldHave(text(expectedDashboard));
    }

    public void quickLaunchText() {
        Log.info("Проверяем название раздела Quick Launch");
        quickLaunch.shouldHave(text(expectedQuickLaunch));
    }

    public void employeeDistributionByySubunitText() {
        Log.info("Проверяем название раздела Employee Distribution by Subunit");
        employeeDistributionByySubunit.shouldHave(text(expectedEmployeeDistributionByySubunit));
    }

    public void pendingLeaveRequestsText() {
        Log.info("Проверяем название раздела Pending Leave Requests");
        pendingLeaveRequestsText.shouldHave(text(expectedPendingLeaveRequestsText));
    }

    public void legendText() {
        Log.info("Проверяем название раздела Legend");
        legendText.shouldHave(text(expectedLegend));
    }

}
