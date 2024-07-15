package HomeWorkTest.hw;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class hw7Test {
    @Test
    public void myFirstTest() {
        open("https://www.google.ru/");
        $("[name=q]").setValue("ghjntbyjdst gtxtymz shock").pressEnter();
        $x("//h3[contains(text(),'FitnesSHOCK — вкусные десерты без сахара')] ").click();
        Selenide.sleep(5000);
    }
}
