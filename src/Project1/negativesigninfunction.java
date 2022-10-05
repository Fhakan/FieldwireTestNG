package Project1;

import Utils.ParameterWebDriver;

import org.testng.annotations.Test;

public class negativesigninfunction extends ParameterWebDriver {


    @Test
    void negativesigin() {


        _03_PlaceOrderElements elements = new _03_PlaceOrderElements(driver);

        driver.manage().window().maximize();


        elements.semail.sendKeys("asdadw121231231@gmail.com");

        Waitof(2);

       elements.next.click();

        Waitof(2);

        elements.spassword.sendKeys("12345asdawda678h");

        elements.login.click();













    }


}
