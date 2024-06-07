import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selectors.byCssSelector;


public class TextBox {


    @BeforeAll
    static void beforeAll () {
        Configuration.browserSize= "1920X1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {


        Configuration.pageLoadStrategy="eager";

           open ("/text-box");


        $(byCssSelector("[id=userName]")).setValue("Zoro");
        $(byCssSelector("[#userEmail]")).setValue("Alex@egorov.com");
        $(byCssSelector("[#currentAddress]")).setValue("Some adress 1");
        $(byCssSelector("[#permanentAddress]")).setValue("Another adress 1");
        $(byCssSelector("[#submit]")).click();
        $(byCssSelector("[#output]")).shouldHave(text("Zoro Zoro"),text("Zdravstvuigost@mail.ru"),
                text("Some adress 1"),text("Another adress 1") );

      }
}
