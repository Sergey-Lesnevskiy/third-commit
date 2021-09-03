package dashboard;

import beforeAfter.Before;
import io.qameta.allure.*;
import methods.*;


import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.IOException;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DashboardTest extends Before {
    DashboardMethod dashboardMethod = new DashboardMethod();

    @Attachment
    @Description("Check Quick Launce")
    @Severity(SeverityLevel.NORMAL)
    @Link("https://opensource-demo.orangehrmlive.com/")
    @Owner("Sergey")
    @Test
    @Order(1)
    public void testCheckQuickLaunce() {
        dashboardMethod.goToDashboardClick();
        dashboardMethod.checkQuickLaunce();
        dashboardMethod.dashboardCheckText();
        dashboardMethod.quickLaunchText();
    }

    @Attachment
    @Description("Check Legend")
    @Severity(SeverityLevel.NORMAL)
    @Link("https://opensource-demo.orangehrmlive.com/")
    @Owner("Sergey")
    @Test
    @Order(2)
    public void testCheckLegend() {
        dashboardMethod.goToDashboardClick();
        dashboardMethod.checkLegend();
        dashboardMethod.legendText();
    }

    @Attachment
    @Description("Distribution By Subunit")
    @Severity(SeverityLevel.NORMAL)
    @Link("https://opensource-demo.orangehrmlive.com/")
    @Owner("Sergey")
    @Test
    @Order(3)
    public void testEmployeeDistributionBySubunit() {
        dashboardMethod.goToDashboardClick();
        dashboardMethod.checkEmployeeDistributionBySubunit();
        dashboardMethod.employeeDistributionByySubunitText();
    }
    @Attachment
    @Description("Pending Leave Requests")
    @Severity(SeverityLevel.NORMAL)
    @Link("https://opensource-demo.orangehrmlive.com/")
    @Owner("Sergey")
    @Test
    @Order(14)
    public void testTablePendingLeaveRequests() {
        dashboardMethod.goToDashboardClick();
        dashboardMethod.pendingLeaveRequestsText();
        dashboardMethod.checkTablePendingLeaveRequests();

    }

    UserMethod userMethod = new UserMethod();
    JobTitleMethod jobTitleMethod = new JobTitleMethod();


    @Attachment
    @Description("Job Add")
    @Severity(SeverityLevel.CRITICAL)
    @Link("https://opensource-demo.orangehrmlive.com/")
    @Owner("Sergey")
    @Test
    @Order(4)
    public void testJobAdd() throws IOException {
        userMethod.switchingToUser();
        jobTitleMethod.goToTheJob();
        jobTitleMethod.addJobTitles();
        jobTitleMethod.checkJob();
        jobTitleMethod.deleteJobTitles();
        jobTitleMethod.checkDeleteJob();
    }

    LeaveMethod leaveMethod = new LeaveMethod();


    @Attachment
    @Description("Test Leave")
    @Severity(SeverityLevel.MINOR)
    @Link("https://opensource-demo.orangehrmlive.com/")
    @Owner("Sergey")
    @Test
    @Order(5)
    public void testLeave() throws IOException {
        leaveMethod.goToTheLeave();
        leaveMethod.findLeaveEmployee();
        leaveMethod.checkLeaveEmployee();
    }

    LoginMethod loginMethod = new LoginMethod();

    @Attachment
    @Description("Test Login")
    @Severity(SeverityLevel.BLOCKER)
    @Link("https://opensource-demo.orangehrmlive.com/")
    @Owner("Sergey")
    @Test
    @Order(6)
    public void loginTest() {
        loginMethod.welcomeMessage();
    }

    PimEmployeeMethod pimEmployeeMethod = new PimEmployeeMethod();

    @Attachment
    @Description("Test Leave")
    @Severity(SeverityLevel.TRIVIAL)
    @Link("https://opensource-demo.orangehrmlive.com/")
    @Owner("Sergey")
    @Test
    @Order(7)
    public void testPersonalDetails() {
        pimEmployeeMethod.goToEmployeePim();
        pimEmployeeMethod.checkPersonalDetails();

    }
    @Attachment
    @Description("Custom Fields")
    @Severity(SeverityLevel.MINOR)
    @Link("https://opensource-demo.orangehrmlive.com/")
    @Owner("Sergey")
    @Test
    @Order(8)
    public void testCustomFields() {
        pimEmployeeMethod.goToEmployeePim();
        pimEmployeeMethod.checkCustomFields();
    }

    @Attachment
    @Description("Test Attachments")
    @Severity(SeverityLevel.NORMAL)
    @Link("https://opensource-demo.orangehrmlive.com/")
    @Owner("Sergey")
    @Test
    @Order(9)
    public void testAttachments() {
        pimEmployeeMethod.goToEmployeePim();
        pimEmployeeMethod.checkAttachments();
    }

    RecruitmentMethod recruitmentMethod = new RecruitmentMethod();
    @Attachment
    @Description("Test Candidates")
    @Severity(SeverityLevel.CRITICAL)
    @Link("https://opensource-demo.orangehrmlive.com/")
    @Owner("Sergey")
    @Test
    @Order(10)
    public void TestCandidates() throws IOException {
        recruitmentMethod.goToAdd();
        recruitmentMethod.fillingInTheCandidates();
        recruitmentMethod.checkCandidatesRe();
    }

    @Attachment
    @Description("Test Form User")
    @Severity(SeverityLevel.TRIVIAL)
    @Link("https://opensource-demo.orangehrmlive.com/")
    @Owner("Sergey")
    @Test
    @Order(11)
    public void checkFormUser() {
        userMethod.switchingToUser();
        userMethod.checkFormUser();
    }

    @Attachment
    @Description("Test User Test")
    @Severity(SeverityLevel.TRIVIAL)
    @Link("https://opensource-demo.orangehrmlive.com/")
    @Owner("Sergey")
    @Test
    @Order(12)
    public void addUserTest() throws IOException {
        userMethod.switchingToUser();
        userMethod.formFilling();
        userMethod.findUser();
        userMethod.checkUser();
    }

    LogoutMethod logoutMethod = new LogoutMethod();
    @Attachment
    @Description("Test Log Out")
    @Severity(SeverityLevel.TRIVIAL)
    @Link("https://opensource-demo.orangehrmlive.com/")
    @Owner("Sergey")
    @Test
    @Order(13)
    public void logOut(){
        logoutMethod.loginOut();
    }

}




























