package Project1;

import Utils.ParameterWebDriver;

import org.testng.annotations.Test;

public class signinandsignoutfunction extends ParameterWebDriver {


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


        Waitof(3);

        elements.outname.click();

        elements.signout.click();















    }


}
