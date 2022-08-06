package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Data;
import org.openqa.selenium.support.PageFactory;
import testng.ContactManagerTestNG;

@Data
public class AddContactPage {

    public AddContactPage(){
        PageFactory.initElements(new AppiumFieldDecorator(ContactManagerTestNG.Driver),  this);
    }

    // FindBys ile Title alınmaya çalışıldı ama olmadı
    @AndroidFindBys({@AndroidFindBy(id="title"),@AndroidFindBy(tagName = "title")})
    private MobileElement titleBys;

    // FindBy ile yalnızca (id = "title") Çalışmadı
    @AndroidFindBy(id = "android:id/title")
    private MobileElement title;

    // Target Account Field
    @AndroidFindBy(id = "accountSpinner")
    private MobileElement targetAccountField;

    // Account Text
    @AndroidFindBy(id = "android:id/text1")
    private MobileElement targetAccountText;

    // Contact Name Field
    @AndroidFindBy(id = "contactNameEditText")
    private MobileElement contactNameField;

    // Contact Phone Field
    @AndroidFindBy(id = "contactPhoneEditText")
    private MobileElement contactPhoneField;

    // Contact Phone Type
    @AndroidFindBy(id = "contactPhoneTypeSpinner")
    private MobileElement contactPhoneDrop;

    // Contact Email Field
    @AndroidFindBy(id = "contactEmailEditText")
    private MobileElement contactEmailField;

    // Contact Email Type
    @AndroidFindBy(id = "contactEmailTypeSpinner")
    private MobileElement contactEmailDrop;

    // Save Button
    @AndroidFindBy(id = "contactSaveButton")
    private MobileElement contactSaveBtn;

    // From Drop List Find The Text With The Title "Home"
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@index=0]")
    private MobileElement dropListHome;

    // From Drop List Find The Text With The Title "Work"
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@index=1]")
    private MobileElement dropListWork;

    // From Drop List Find The Text With The Title "Mobile"
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@index=2]")
    private MobileElement dropListMobile;




}
