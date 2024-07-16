package HomeWorkTest.hw;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
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
    public void my2test2() {
        Configuraion.pageLoadStrategy = "eager";
        String userName = "Ivan";
        String userLName = "Egorov";
        String userEmail = "krovostok@mail.ru";
        String userGender = "Other";
        String userPhone = "1234567890";
        String XX = "07";
        String YY = "July";
        String ZZ = "2008";
        String userSubject = "Chemistry";
        String userHobbie = "Sports";
        String userPicture = "images/3.png";
        String userAdress = "Svoya ulica kv.5";
        String userState = "Uttar Pradesh";
        String userCity = "Agra";

        registrationPage.openPage()
                .setFirstName(userName)
                .setLastName(userLName)
                .setEmail(userEmail)
                .setGender(userGender)
                .setPhone(userPhone)
                .setBirthDate(XX, YY, ZZ)
                .setSubjects(userSubject)
                .setHobbies(userHobbie)
                .setPicture(userPicture)
                .setAdress(userAdress)
                .setStateAndCity(userState, userCity);

        registrationPage.verifyResultsModalAppears()
                .verifyResult("Student Name", "Ivan" + "Egorov")
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
