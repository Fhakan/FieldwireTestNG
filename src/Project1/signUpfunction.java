package Project1;

import Utils.ParameterWebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.support.ui.Select;

public class signUpfunction extends ParameterWebDriver {


    @Test
    void signUp() {


        Project1._03_PlaceOrderElements elements = new Project1._03_PlaceOrderElements(driver);

        driver.manage().window().maximize();


        elements.createAccount.click();

        elements.firstname.sendKeys("asdasfasff");

        elements.lastname.sendKeys("asdasfasflastf");

        elements.email.sendKeys("asda2ff@gmail.com");

        elements.password.sendKeys("12345678h");

        elements.acceptagre.click();

        elements.createaccount2.click();


        elements.company.sendKeys("asdafcomfp");

       Select ddmenu = new Select(elements.companytype);
       ddmenu.selectByVisibleText("General Contractor");

        Select ddmenu2 = new Select(elements.employenumber);
        ddmenu2.selectByIndex(2);

        elements.phone.sendKeys("2015678901");

        elements.complate.click();








    }


}
