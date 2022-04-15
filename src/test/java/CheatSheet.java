import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CheatSheet {
    @Test
    void fillFormTestDateClick() {
        $(""); //1st SelenideElement
        $$(""); //ElementsCollection
        $(".class1");              //of class1
        $("[class=class1]");
        $(".class1.class2");       //of class1 & of class2
        $(".class1:not(.class2");  //of class1 & not of class2
        $("div>div");              //1st child of div
        $("div").$("h3");          //any h3 child of div
        $("div h3");               //any h3 child of div - a bit faster
        $(byXpath("//*[@class='my-class' and text()='my-text']"));

        $("").closest("h1");        //closest up the tree element h1 to the set element
        $("").sibling(0);           //next sibling to the set element
        $("").sibling(1);           //next+1 sibling to the set element
        $("").preceding(0);         //previous sibling to the set element
        $("").shouldHave(text("substring"));  //non case sensitive
        $("").shouldHave(exactText("exact_string"));

        $("[class*=disabled][class*=custom-control-label][for=noRadio]");
        //class contains "disabled" & class contains "custom-control-label" & for="noRadio"

        $$(byText("some_text")).find(visible).click(); //find 1st visible element with "some_text" and click it

    }
}
