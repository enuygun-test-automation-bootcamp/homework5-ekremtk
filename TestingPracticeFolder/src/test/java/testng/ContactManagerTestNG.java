package testng;

import devices.DeviceFarm;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.AddContactPage;
import pages.HomePage;
import utility.DeviceFarmUtility;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLOutput;

public class ContactManagerTestNG extends ElementVisibility implements TextCheck {

    public static AppiumDriver<?> Driver;
    HomePage homePage;
    AddContactPage addContactPage;
    DesiredCapabilities capabilities;
    String oreo, kitkat;



    public ContactManagerTestNG() {
        oreo = DeviceFarm.ANDROID_OREO.path;
        kitkat = DeviceFarm.ANDROID_KITKAT.path;
    }

    /*
    // Created a private element for Add Contact Button
    @AndroidFindBy(id = "addContactButton")
    private MobileElement addContactBtn;
    */

    /*
    // Before all test setted all the capabilities
    @BeforeClass
    public void setup() throws MalformedURLException {
        // Defined the App's Capabilities
        capabilities = new DesiredCapabilities();
        capabilities = DeviceFarmUtility.pathToDesiredCapabilities(this.oreo);
        capabilities.setCapability("app", new File("src/test/resources/apps/ContactManager.apk").getAbsolutePath());

        // Created a driver and added the capabilities to the driver
        Driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        homePage = new HomePage();
        addContactPage = new AddContactPage();
    }
    */


    /*
    // Before the Contact Phone Tests, all capabilities setted
    @BeforeGroups("Contact Phone Tests")
    public void setupForContactPhoneTests() throws MalformedURLException, InterruptedException {
        // Defined the App's Capabilities
        capabilities = new DesiredCapabilities();
        capabilities = DeviceFarmUtility.pathToDesiredCapabilities(this.oreo);
        capabilities.setCapability("app", new File("src/test/resources/apps/ContactManager.apk").getAbsolutePath());

        // Created a driver and added the capabilities to the driver
        Driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        homePage = new HomePage();
        addContactPage = new AddContactPage();

        homePage.getAddContactBtn().click();
        Thread.sleep(4000);
    }

     */

    // Before the Contact Email Tests, all capabilities setted
    @BeforeGroups("Contact Email Tests")
    public void setupForContactEmailTests() throws MalformedURLException, InterruptedException {
        // Defined the App's Capabilities
        capabilities = new DesiredCapabilities();
        capabilities = DeviceFarmUtility.pathToDesiredCapabilities(this.oreo);
        capabilities.setCapability("app", new File("src/test/resources/apps/ContactManager.apk").getAbsolutePath());

        // Created a driver and added the capabilities to the driver
        Driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        homePage = new HomePage();
        addContactPage = new AddContactPage();

        homePage.getAddContactBtn().click();
        Thread.sleep(4000);
    }

    /*
    // First open Contact Manager and click the button
    @Test(priority = 0)
    public void openAddContactOnOreo() throws NullPointerException, InterruptedException {
        homePage.getAddContactBtn().click();
        Thread.sleep(4000);
    }

    // User Checks Fields
    @Test(priority = 1)
    public void checkVisibility() {
        ElementVisibility.isDisplayed(addContactPage.getTitle());
        ElementVisibility.isDisplayed(addContactPage.getTargetAccountText());
        ElementVisibility.isDisplayed(addContactPage.getTargetAccountField());
        ElementVisibility.isDisplayed(addContactPage.getContactNameField());
        ElementVisibility.isDisplayed(addContactPage.getContactPhoneField());
        ElementVisibility.isDisplayed(addContactPage.getContactPhoneDrop());
        ElementVisibility.isDisplayed(addContactPage.getContactEmailField());
        ElementVisibility.isDisplayed(addContactPage.getContactEmailDrop());
        ElementVisibility.isDisplayed(addContactPage.getContactSaveBtn());
        System.out.println("All Fields Are Visible");
        System.out.println("-----------------------------------------------");
    }

    // User checks title whether it is "Add Contact"
    @Test(priority = 2)
    public void checkAddContactTitle() {
        Assert.assertEquals(addContactPage.getTitle().getText(), "Add Contact");
        System.out.println("Obtained Title is: " + addContactPage.getTitle().getText());
        System.out.println("-----------------------------------------------");
    }

    // User checks target account
    @Test(priority = 3)
    public void checkTargetAccountText() {
        Assert.assertEquals(addContactPage.getTargetAccountText().getText(), "etktestaccnt@gmail.com");
        System.out.println("Obtained Target Account is: " + addContactPage.getTargetAccountText().getText());
        String s = addContactPage.getTargetAccountText().getText();
        System.out.println("Does the text contain only letter characters: " + TextCheck.isText(s));
        System.out.println("-----------------------------------------------");
    }

    // User send a name for the account
    // Also check the name for letter and number characters
    @Test(priority = 4)
    public void checkNameText() {
        addContactPage.getContactNameField().sendKeys("Test Account");
        Assert.assertEquals(addContactPage.getContactNameField().getText(), "Test Account");
        System.out.println("Obtained Text is: " + addContactPage.getContactNameField().getText());
        String s = addContactPage.getContactNameField().getText();
        System.out.println("Does the text contain only letter characters (Spaces are acceptable): " + TextCheck.isText(s));
        System.out.println("-----------------------------------------------");
    }

    */

    /*
    // User add a home "Add Contact Phone"
    @Test(priority = 1, groups = "Contact Phone Tests")
    //@Test(priority = 5)
    public void addContactNumber() {
        System.out.println("-----------------------------------------------");
        addContactPage.getContactPhoneField().sendKeys("05005005050");
        System.out.println("Obtained Number is: " + addContactPage.getContactPhoneField().getText());
        System.out.println("-----------------------------------------------");
        String s = addContactPage.getContactNameField().getText();
        System.out.println("Does the text contain only numerical characters (Spaces are acceptable): " + TextCheck.isNumber(s));
        System.out.println("-----------------------------------------------");
    }

    // User Checks Contact Phone Field if it is equal to "Home"
    @Test(priority = 2, groups = "Contact Phone Tests")
    public void checkContactNumberFieldHome() throws InterruptedException {
        addContactPage.getContactPhoneDrop().click();
        Thread.sleep(2000);
        Assert.assertEquals(addContactPage.getDropListHome().getText(), "Home");
        System.out.println("Obtained Field is: " + addContactPage.getDropListHome().getText());
        System.out.println("-----------------------------------------------");
        addContactPage.getDropListHome().click();
    }


    // User Checks Contact Phone Field if it is equal to "Work"
    @Test(priority = 3, groups = "Contact Phone Tests")
    public void checkContactNumberFieldWork() throws InterruptedException {
        addContactPage.getContactPhoneDrop().click();
        Thread.sleep(2000);
        Assert.assertEquals(addContactPage.getDropListWork().getText(), "Work");
        System.out.println("Obtained Field is: " + addContactPage.getDropListWork().getText());
        System.out.println("-----------------------------------------------");
        addContactPage.getDropListWork().click();
    }

    // User Checks Contact Phone Field if it is equal to "Mobile"
    @Test(priority = 4, groups = "Contact Phone Tests")
    public void checkContactNumberFieldMobile() throws InterruptedException {
        addContactPage.getContactPhoneDrop().click();
        Thread.sleep(2000);
        Assert.assertEquals(addContactPage.getDropListMobile().getText(), "Mobile");
        System.out.println("Obtained Field is: " + addContactPage.getDropListMobile().getText());
        System.out.println("-----------------------------------------------");
        addContactPage.getDropListMobile().click();
    }

     */

    // User add a home "Add Contact Email"
    @Test(priority = 1, groups = "Contact Email Tests")
    public void addContactEmailHome() {
        System.out.println("-----------------------------------------------");
        addContactPage.getContactEmailField().sendKeys("test@mail.com");
        System.out.println("Obtained Email is: " + addContactPage.getContactEmailField().getText());
        System.out.println("-----------------------------------------------");
        String s = addContactPage.getContactEmailField().getText();
        System.out.println("Does the text contain only letter characters (@ is acceptable): " + TextCheck.isEmail(s));
        System.out.println("-----------------------------------------------");
    }

    // User Checks Contact Email Field if it is equal to "Home"
    @Test(priority = 2, groups = "Contact Email Tests")
    public void checkContactEmailFieldHome() throws InterruptedException {
        addContactPage.getContactEmailDrop().click();
        Thread.sleep(2000);
        Assert.assertEquals(addContactPage.getDropListHome().getText(), "Home");
        System.out.println("Obtained Field is: " + addContactPage.getDropListHome().getText());
        System.out.println("-----------------------------------------------");
        addContactPage.getDropListHome().click();
    }


    // User Checks Contact Email Field if it is equal to "Work"
    @Test(priority = 3, groups = "Contact Email Tests")
    public void checkContactEmailFieldWork() throws InterruptedException {
        addContactPage.getContactEmailDrop().click();
        Thread.sleep(2000);
        Assert.assertEquals(addContactPage.getDropListWork().getText(), "Work");
        System.out.println("Obtained Field is: " + addContactPage.getDropListWork().getText());
        System.out.println("-----------------------------------------------");
        addContactPage.getDropListWork().click();
    }

    // User Checks Contact Email Field if it is equal to "Mobile"
    @Test(priority = 4, groups = "Contact Email Tests")
    public void checkContactEmailFieldMobile() throws InterruptedException {
        addContactPage.getContactEmailDrop().click();
        Thread.sleep(2000);
        Assert.assertEquals(addContactPage.getDropListMobile().getText(), "Mobile");
        System.out.println("Obtained Field is: " + addContactPage.getDropListMobile().getText());
        System.out.println("-----------------------------------------------");
        addContactPage.getDropListMobile().click();
    }

    @AfterClass
    public void waiter() throws InterruptedException {
        Thread.sleep(2000);
    }

    /*
    // Print "Test Finished" to The Screen After Test Finished
    @AfterMethod
    public void informator(){
        System.out.println("Test Finished");
    }
    */
}
