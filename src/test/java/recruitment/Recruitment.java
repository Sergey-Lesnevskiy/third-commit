package recruitment;

import beforeAfter.Before;
import methods.RecruitmentMethod;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import java.io.IOException;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Recruitment extends Before {
    RecruitmentMethod recruitmentMethod =new RecruitmentMethod();
//
//    @Test
//    public void TestCandidates() throws IOException {
//        recruitmentMethod.goToAdd();
//        recruitmentMethod.fillingInTheCandidates();
//        recruitmentMethod.checkCandidatesRe();
//    }

}





