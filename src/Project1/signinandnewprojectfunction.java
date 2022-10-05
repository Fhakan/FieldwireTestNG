package Project1;

import Utils.ParameterWebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class signinandnewprojectfunction extends ParameterWebDriver {


    @Test
    void sigin() {


        _03_PlaceOrderElements elements = new _03_PlaceOrderElements(driver);

        driver.manage().window().maximize();


        elements.semail.sendKeys("asda2ff@gmail.com");

        Waitof(2);

       elements.next.click();

        Waitof(2);

        elements.spassword.sendKeys("12345678h");

        elements.login.click();


        elements.newprojectt.click();

        elements.projectname.sendKeys("project1");

        elements.createproject.click();

        elements.projectnext1.click();

        elements.projectnext2.click();

        elements.projectnext3.click();

        elements.projectdone.click();












    }


}
