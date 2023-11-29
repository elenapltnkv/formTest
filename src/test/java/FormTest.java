import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class FormTest {

    @BeforeAll
    public static void beforeall() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    public void fillForm() {
        open("/automation-practice-form");
        $("#firstName").setValue("Dsheyetye");
        $("#lastName").setValue("Rhhhdfgd");
        $("#userEmail").setValue("rev@vok.com");
        $("#gender-radio-1").click();
        $("#userNumber").setValue("7997358252");
        $("#submit").click();






    }

}

