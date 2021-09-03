package login;

import beforeAfter.Before;
import methods.LoginMethod;
import org.junit.jupiter.api.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LoginTest extends Before {

    LoginMethod loginMethod= new LoginMethod();

//    @Test
//    public void loginTest() {
//        loginMethod.welcomeMessage();
//    }
}
