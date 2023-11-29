import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BookRoomTest {
    @BeforeAll
    public static void beforeAll(){
        baseUrl="https://automationintesting.online";
    }

    @Test
    public void bookRoom(){
        open(baseUrl);
        $("#name").setValue("Fanny");
        $("#email").setValue("fanny@totot.com");
        $("#phone").setValue("79999999995");
        $("#subject").setValue("This room");
        $("#description").setValue("This room djhfryet tryrtyetreytr");
        $("#submitContact").click();
        $(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/h2")).shouldHave((text("Thanks for getting in")));



    }
}
