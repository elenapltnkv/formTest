package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BookRoomPage {
    private SelenideElement
            nameInput = $("#name"),
            emailInput = $("#email"),
            phoneInput = $("#phone"),
            subjectInput = $("#subject"),
            descriptionInput = $("#description");



        public BookRoomPage openPage() {
            open(baseUrl);
            return this;
        }

//    public BookRoomPage setValue() {
//
//        //$("#name").setValue("Fanny");
//        //$("#email").setValue("fanny@totot.com");
//        //$("#phone").setValue("79999999995");
//        //$("#subject").setValue("This room");
//        $("#description").setValue("This room djhfryet tryrtyetreytr");
//
//        return this;
//    }

        public pages.BookRoomPage setName(String value) {
            nameInput.setValue(value);
            return this;
        }

        public pages.BookRoomPage setEmail(String value) {
            emailInput.setValue(value);
            return this;
        }

        public pages.BookRoomPage setPhone(String value) {
            phoneInput.setValue(value);
            return this;
        }

        public pages.BookRoomPage setSubject(String value) {
            subjectInput.setValue(value);
            return this;
        }

        public pages.BookRoomPage setDescription(String value) {
            descriptionInput.setValue(value);
            return this;
        }


        public pages.BookRoomPage submitInfo() {
            $("#submitContact").click();
            $(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/h2")).shouldHave((text("Thanks for getting in")));
            return this;
        }
    }

