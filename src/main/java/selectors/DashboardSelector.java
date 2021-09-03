package selectors;

import com.codeborne.selenide.SelenideElement;
import org.jsoup.select.Selector;
import org.openqa.selenium.By;
import text.DashboardText;

import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class DashboardSelector extends DashboardText {
    public SelenideElement dashboardClick = $(By.xpath("//b[text()='Dashboard']"));
    //из него извлекаю данные и сравниваю
    public SelenideElement tableQuickLaunce = $(By.xpath("//table[@class='quickLaungeContainer']"));
    // извлекаю данные и сравниваю
    public SelenideElement tableLegend = $(By.xpath("//table[@style='font-size:smaller;color:#545454']"));
    // извлекаю данные и сравниваю
    public SelenideElement tableEmployeeDistributionBySubunit = $("[id='div_graph_display_emp_distribution']");
    //проверить надтись
    public SelenideElement dashboardCheck = $(By.xpath("//h1[text()='Dashboard']"));
    public SelenideElement quickLaunch =$(By.xpath("//legend[text()='Quick Launch']"));
    public SelenideElement employeeDistributionByySubunit =$(By.xpath(" //legend[text()='Employee Distribution by Subunit'] "));
    public SelenideElement pendingLeaveRequestsText =$(By.xpath(" //legend[text()='Pending Leave Requests'] "));
    public SelenideElement legendText =$(By.xpath(" //legend[text()='Legend'] "));

    public SelenideElement tablePendingLeaveRequests = $("[id='task-list-group-panel-menu_holder']");



}
