package selectors;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LeaveSelector {

    public SelenideElement leaveClick = $(By.xpath("//b[text()='Leave']"));
    public SelenideElement assignLeaveClick1 = $(By.xpath("//a[text()='Assign Leave']"));
    public SelenideElement employeeNameLeave = $("[name='assignleave[txtEmployee][empName]']");
    public SelenideElement typeLeaveSelect = $("[name='assignleave[txtLeaveType]']");
    public SelenideElement changTypeLeave = $(By.xpath("//option[text()='CAN - Vacation']"));
    public SelenideElement fromDateLeave = $("[name='assignleave[txtFromDate]']");
    public SelenideElement clickFromDateLeave = $(By.xpath("//li[4]/img"));
    public SelenideElement toDateLeave = $("[name='assignleave[txtToDate]']");
    public SelenideElement clickToDateLeave = $(By.xpath("//li[5]/img"));
    // public SelenideElement clickDay = $(By.xpath("//a[text()='6']"));
    public SelenideElement partialDaysLeave = $("[name='assignleave[partialDays]']");
    public SelenideElement startDayOnlyPartial = $(By.xpath("//option[text()='Start Day Only']"));
    public SelenideElement startDayHalfDay = $("[name='assignleave[firstDuration][duration]']");
    public SelenideElement startDayHalfDayClick = $(By.xpath("//select[@name='assignleave[firstDuration][duration]']/option[@value='half_day']"));
    public SelenideElement startDayAfternoon = $("[name='assignleave[firstDuration][ampm]']");
    public SelenideElement startDayAfternoonClick = $(By.xpath("//select[@name='assignleave[firstDuration][ampm]']/option[text()='Afternoon']"));
    public SelenideElement сommentLeave = $("[name='assignleave[txtComment]']");
    public SelenideElement assignLeave1 = $("#assignBtn");
    public SelenideElement okLeave = $("#confirmOkButton");
    //поиск по записи отпуска
    public SelenideElement checkLeaveListClick = $("#menu_leave_viewLeaveList");
    public SelenideElement allLeaveListClick = $("[id='leaveList_chkSearchFilter_checkboxgroup_allcheck']");
    public SelenideElement employeeNameLeaveList1 = $("[name='leaveList[txtEmployee][empName]']");
    public SelenideElement searchLeaveListClick = $("[name='btnSearch']");
    // выбираем запись
    public SelenideElement tableLeaveList1 = $(By.xpath("//table[@class='table hover']//tbody"));

}
