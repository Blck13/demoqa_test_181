import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class JUnitExamples {

    @BeforeAll
     static void beforAll (){
        System.out.println ("  Here is beforAll()");

    }
    @BeforeEach
    void beforEach() {
        System.out.println ("  Here is beforEach");
    }

    @Test
    void firstTest(){
        System.out.println("  Here is firstTest");
    }
    @Test

    void secondTest(){
        System.out.println("  Here is secondTest");

    }
}

 class homework7 {
    @Test
    void testenterprisePageChecks() {
        open("https://github.com");
        $$(By.cssSelector(".HeaderMenu-link")).findBy(text("Solutions")).hover();
        $$(By.cssSelector(".HeaderMenu-dropdown-link")).findBy(text("Enterprise")).click();
        $(byText("Build like the best")).shouldBe(visible);
    }
}