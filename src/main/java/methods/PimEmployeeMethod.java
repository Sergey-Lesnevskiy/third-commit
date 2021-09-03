package methods;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.gen5.api.Assertions;
import selectors.PimEmployeeSelector;
import utils.Log;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class PimEmployeeMethod extends PimEmployeeSelector {

    public void goToEmployeePim() {
        Log.info("Переходим на вкладку Pim");
        pimClick.click();
        selectSubUnitPim.selectOptionContainingText("Sales");
        Log.info("Производим поиск по  Sales");
        searchPim.click();
        Log.info("Переходим к персональной информации Nathan");
        nathanClick.click();
    }

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

    public void checkCustomFields() {
        Log.info("Проверяем форму  Custom Fields");
        editCustomFieldsClick.shouldBe(exist);
        ElementsCollection actual = bloodPim.$$("option");
        Assertions.assertEquals(expectedPim, actual.texts());

    }

    public void checkAttachments() {
        Log.info("Проверяем форму  Add Attachment");
        editAttachmentsPimClick.click();
        deckPim.shouldBe(exist);
        filePim.shouldBe(exist);
    }
}
