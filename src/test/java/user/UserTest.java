package user;

import beforeAfter.Before;
import methods.UserMethod;
import org.junit.jupiter.api.*;

import java.io.IOException;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UserTest extends Before {
    UserMethod userMethod = new UserMethod();
//
//    @Test
//    public void checkFormUser(){
//        userMethod.switchingToUser();
//        userMethod.checkFormUser();
//    }
//    @Test
//    public void addUserTest() throws IOException {
//        userMethod.switchingToUser();
//        userMethod.formFilling();
//        userMethod.findUser();
//        userMethod.checkUser();
//    }

}
