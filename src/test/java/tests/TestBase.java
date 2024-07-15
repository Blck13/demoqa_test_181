package tests;
import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Configuration;
import pages.RegistrationPage;


public class TestBase {

    public RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";

    }

}
