package HomeWorkTest.hw;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class hw5Test2 extends TestBase {
    private Configuration Configuraion;

    @Test
    public void my2test2(){
        Configuraion.pageLoadStrategy = "eager";
        registrationPage.openPage()
                               .setFirstName("Ivan")
                               .setLastName("Egorov")
                               .setEmail("krovostok@mail.ru")
                               .setGender("Other")
                               .setPhone("1234567890")
                               .setBirthDate("07","September","2007");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-dropdown-container").$(byText("February")).click();
        $(".react-datepicker__year-dropdown-container").$(byText("1992")).click();
        $(".react-datepicker__month-container").$(byText("6")).click();
        $("#subjectsInput").setValue("Chemistry").pressEnter();
        $("#hobbies-checkbox-1").parent().$(byText("Sports")).click();
        //$("#uploadPicture").uploadFromClasspath("images/3.png");
        $("#currentAddress").setValue("Svoya ulica kv.5");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("Uttar Pradesh")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Agra")).click();
        $("#submit").click();

        registrationPage.verifyResultsModalAppears()
                .verifyResult("Student Name", "Ivan"+"Egorov")
                .verifyResult("Student Email", "krovostok@mail.ru")
                .verifyResult("Gender", "Other")
                .verifyResult("Mobile", "1234567890")
                .verifyResult("Date of Birth", "07 September,2007");

        $(".modal-body").shouldHave(text("Chemistry"));
        $(".modal-body").shouldHave(text("Sports"));
        $(".modal-body").shouldHave(text("Svoya ulica kv.5"));
        $(".modal-body").shouldHave(text("Uttar Pradesh Agra"));
        $("#closeLargeModal").click();
        Selenide.sleep(5000);


    }
}
