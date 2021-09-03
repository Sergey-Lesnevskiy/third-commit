package jobTest;

import beforeAfter.Before;;
import methods.JobTitleMethod;
import methods.UserMethod;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.io.IOException;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class JobTest extends Before {
    UserMethod userMethod = new UserMethod();
    JobTitleMethod jobTitleMethod = new JobTitleMethod();
//
//    @Test
//
//    public void TestJobAdd() throws IOException {
//        userMethod.switchingToUser();
//        jobTitleMethod.goToTheJob();
//        jobTitleMethod.addJobTitles();
//        jobTitleMethod.checkJob();
//        jobTitleMethod.deleteJobTitles();
//        jobTitleMethod.checkDeleteJob();
//    }
}
