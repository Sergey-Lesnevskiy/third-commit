package methods;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;
import org.junit.gen5.api.Assertions;
import selectors.PimEmployeeSelector;
import utils.Log;
import static com.codeborne.selenide.Condition.*;


public class PimEmployeeMethod extends PimEmployeeSelector {
@Step("Переходим в персональные данные в разделе Pim")
    public void goToEmployeePim() {
        Log.info("Переходим на вкладку Pim");
        pimClick.click();
        selectSubUnitPim.selectOptionContainingText("Sales");
        Log.info("Производим поиск по  Sales");
        searchPim.click();
        Log.info("Переходим к персональной информации Nathan");
        nathanClick.click();
    }
    @Step("Проверяем форму Personal Details в разделе Pim")
    public void checkPersonalDetails() {
        Log.info("Проверяем форму Personal Details");
        fotoPim.shouldBe(visible);
        editPersonalDetailsPimClick.click();
        firstNamePim.shouldBe(visible);
        middleNamePim.shouldBe(visible);
        lastNamePim.shouldBe(visible);
        employeeIdPim.shouldBe(visible);
        otherIDPim.shouldBe(visible);
        licenNoPim.shouldBe(visible);
        licExpDatePim.shouldBe(visible);
        nationPim.shouldBe(visible);
        birthPim.shouldBe(visible);
        maritalStatusPim.shouldBe(visible);
        radio1Pim.shouldBe(visible);
        radio2Pim.shouldBe(visible);
    }
    @Step("Проверяем форму  Custom Fields в разделе Pim")
    public void checkCustomFields() {
        Log.info("Проверяем форму  Custom Fields");
        editCustomFieldsClick.shouldBe(exist);
        ElementsCollection actual = bloodPim.$$("option");
        Assertions.assertEquals(expectedPim, actual.texts());

    }
    @Step("Проверяем форму  Add Attachment в разделе Pim")
    public void checkAttachments() {
        Log.info("Проверяем форму  Add Attachment");
        editAttachmentsPimClick.click();
        deckPim.shouldBe(exist);
        filePim.shouldBe(exist);
    }
}
