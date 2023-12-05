import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Configuration.baseUrl;

public class BasicInfo {
   @BeforeAll
   public static void beforeAll(){
      baseUrl="https://automationintesting.online";
   }
}
