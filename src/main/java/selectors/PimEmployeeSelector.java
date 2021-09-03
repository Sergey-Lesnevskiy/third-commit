package selectors;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import text.PimText;

import static com.codeborne.selenide.Selenide.$;

public class PimEmployeeSelector extends PimText {
    public SelenideElement pimClick = $(By.xpath("//b[text()='PIM']"));
    public SelenideElement nathanClick = $(By.xpath("//a[text()='Nathan']"));
    public SelenideElement firstNamePim = $("[name='personal[txtEmpFirstName]']");
    public SelenideElement middleNamePim = $("[name='personal[txtEmpMiddleName]']");
    public SelenideElement lastNamePim = $("[name='personal[txtEmpLastName]']");
    public SelenideElement employeeIdPim = $("[name='personal[txtEmployeeId]']");
    public SelenideElement otherIDPim = $("[name='personal[txtOtherID]']");
    public SelenideElement licenNoPim = $("[name='personal[txtLicenNo]']");
    public SelenideElement licExpDatePim = $("[name='personal[txtLicExpDate]']");
    public SelenideElement nationPim = $("[name='personal[cmbNation]']");
    public SelenideElement birthPim = $("[name='personal[DOB]']");
    public SelenideElement maritalStatusPim = $("[name='personal[cmbMarital]']");
    public SelenideElement editPersonalDetailsPimClick = $("[id='btnSave']");
    public SelenideElement editCustomFieldsClick = $("[id='btnEditCustom']");
    public SelenideElement bloodPim = $("[name='custom1']");
    public SelenideElement editAttachmentsPimClick = $("[id='btnAddAttachment']");
    public SelenideElement radio1Pim = $("[id='personal_optGender_1']");
    public SelenideElement radio2Pim = $("[id='personal_optGender_2']");
    public SelenideElement fotoPim = $("[alt='Employee Photo']");
    public SelenideElement deckPim = $("[name='txtAttDesc']");
    public SelenideElement filePim = $("[name='ufile']");
    public SelenideElement selectSubUnitPim = $("[name='empsearch[sub_unit]']");
    public SelenideElement searchPim = $("[id='searchBtn']");
}
