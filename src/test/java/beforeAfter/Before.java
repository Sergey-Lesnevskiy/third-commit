package beforeAfter;
import methods.Before1;
import methods.LoginMethod;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import java.io.IOException;
import static com.codeborne.selenide.Selenide.closeWebDriver;

public class Before extends Before1 {
    LoginMethod loginMethod = new LoginMethod();

    @BeforeEach
    public void setUp() throws IOException {
        openDR();
        openPage();
        loginMethod.fillingInTheLogin();
    }

    @AfterEach
    public void tearDown() {
        closeWebDriver();
    }
}
