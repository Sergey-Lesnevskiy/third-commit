package dashboard;

import beforeAfter.Before;
import io.qameta.allure.*;
import methods.*;


import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.IOException;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AllTests extends Before {
    DashboardMethod dashboardMethod = new DashboardMethod();
    LoginMethod loginMethod = new LoginMethod();
    UserMethod userMethod = new UserMethod();
    JobTitleMethod jobTitleMethod = new JobTitleMethod();
    LeaveMethod leaveMethod = new LeaveMethod();
    PimEmployeeMethod pimEmployeeMethod = new PimEmployeeMethod();
    LogoutMethod logoutMethod = new LogoutMethod();
    RecruitmentMethod recruitmentMethod = new RecruitmentMethod();

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

    @Attachment
    @Description("Test Login")
    @Severity(SeverityLevel.BLOCKER)
    @Link("https://opensource-demo.orangehrmlive.com/")
    @Owner("Sergey")
    @Test
    @Order(6)
    public void testLogin() {
        loginMethod.welcomeMessage();
    }

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

    @Attachment
    @Description("Test Candidates")
    @Severity(SeverityLevel.CRITICAL)
    @Link("https://opensource-demo.orangehrmlive.com/")
    @Owner("Sergey")
    @Test
    @Order(10)
    public void testCandidates() throws IOException {
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
    public void testCheckFormUser() {
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
    public void testAddUser() throws IOException {
        userMethod.switchingToUser();
        userMethod.formFilling();
        userMethod.findUser();
        userMethod.checkUser();
    }

    @Attachment
    @Description("Test Log Out")
    @Severity(SeverityLevel.TRIVIAL)
    @Link("https://opensource-demo.orangehrmlive.com/")
    @Owner("Sergey")
    @Test
    @Order(13)
    public void testLogOut(){
        logoutMethod.loginOut();
    }

}




























