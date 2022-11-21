import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CheckingJunitCode {

    @Test
   void CheckingTextSoftAssertions() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".markdown-body").shouldHave(Condition.text("Soft assertions"));
    }
    @Test
    void CheckingExampleCodeJunit5(){
        open("https://github.com/selenide/selenide/wiki/SoftAssertions");
        $("#wiki-body").shouldHave(Condition.text("Using JUnit5 extend test class:"));



    }
}
