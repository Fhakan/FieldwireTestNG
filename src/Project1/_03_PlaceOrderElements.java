package Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _03_PlaceOrderElements {


     public _03_PlaceOrderElements(WebDriver driver){

         PageFactory.initElements(driver,this);
     }

    // singup elements
    @FindBy (xpath = "//*[@id=\"signup-link\"]/a")
    public WebElement createAccount;


    @FindBy (xpath = "//*[@id=\"firstNameInput\"]")
    public WebElement firstname;


    @FindBy (xpath = "//*[@id=\"lastNameInput\"]")
    public WebElement lastname;


    @FindBy (xpath = "//*[@id=\"emailInput\"]")
    public WebElement email;


    @FindBy (xpath = "//*[@id=\"passwordInput\"]")
    public WebElement password;

    @FindBy (xpath = "//*[@id=\"explicitAgreement\"]")
    public WebElement acceptagre;

    @FindBy (xpath = "//*[@id=\"login\"]/form/fw-button/button/span")
    public WebElement createaccount2;


    @FindBy (xpath = "//*[@id=\"company\"]")
    public WebElement company;


    @FindBy (xpath = "//*[@id=\"companyType\"]")
    public WebElement companytype;


    @FindBy (xpath = "//*[@id=\"companySize\"]")
    public WebElement employenumber;


    @FindBy (xpath = "//*[@id=\"phone\"]")
    public WebElement phone;

    @FindBy (xpath = "//*[@id=\"login\"]/form/fw-button/button")
    public WebElement complate;

    // sing in elements


    @FindBy (xpath = "//*[@id=\"email-input\"]")
    public WebElement semail;

    @FindBy (xpath = "//*[@id=\"auth-sign-in\"]/div[1]/form/fw-button/button")
    public WebElement next;

    @FindBy (xpath = "//*[@id=\"password-input\"]")
    public WebElement spassword;

    @FindBy (xpath = "//*[@id=\"auth-sign-in-with-password\"]/div[1]/form/fw-button/button/span")
    public WebElement login;

    // new project elements

    @FindBy (xpath = "/html/body/div[1]/div/div/div/ui-view/div[1]/div/fw-button/button/span")
    public WebElement newprojectt;

    @FindBy (xpath = "/html/body/div[1]/div/div/div/div[2]/form/div[1]/input")
    public WebElement projectname;

    @FindBy (xpath = "/html/body/div[1]/div/div/div/div[2]/form/fw-button/button/span")
    public WebElement createproject;


    @FindBy (xpath = "/html/body/div[1]/div/div/div/div[3]/fw-button/button/span")
    public WebElement projectnext1;

    @FindBy (xpath = "/html/body/div[1]/div/div/div/div[3]/fw-button[2]/button/span")
    public WebElement projectnext2;


    @FindBy (xpath = "/html/body/div[1]/div/div/div/div[3]/fw-button[2]/button/span")
    public WebElement projectnext3;

    @FindBy (xpath = "/html/body/div[1]/div/div/div/div[3]/fw-button[2]/button/span")
    public WebElement projectdone;


    // new task elements

    @FindBy (xpath = "/html/body/div[1]/div/div/div/ui-view/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/div[1]/div")
    public WebElement project1;

    @FindBy (xpath = "//*[@id=\"sidebar-wrapper\"]/div/ul/div/li[3]/a/span")
    public WebElement tasks;

    @FindBy (xpath = "//*[@id=\"page-content-wrapper\"]/div/div/div[2]/div/div/div[1]/div/div[1]/fw-button[1]/button/span")
    public WebElement newtask;

    @FindBy (xpath = "/html/body/div[1]/div/div/div/table/tbody/tr[2]/td[1]/div[1]/div[4]/div/related-list/div[2]/div[1]")
    public WebElement newtask2;

    @FindBy (xpath = "/html/body/div[1]/div/div/div/table/tbody/tr[2]/td[1]/div[1]/div[4]/div/related-list/div[1]/form/div[1]/div/div/input")
    public WebElement tasktitle;


    @FindBy (xpath = "/html/body/div[1]/div/div/div/table/tbody/tr[2]/td[1]/div[1]/div[4]/div/related-list/div[1]/form/div[2]/fw-button[1]/button")
    public WebElement taskdone;

    @FindBy (xpath = "/html/body/div[1]/div/div/div/div[1]")
    public WebElement taskexit;


    //signout elements


    @FindBy (xpath = "/html/body/div[1]/div/div/nav-bar/nav/div/ul/li[4]/a")
    public WebElement outname;

    @FindBy (xpath = "/html/body/div[1]/div/div/nav-bar/nav/div/ul/li[4]/ul/li[5]/a")
    public WebElement signout;







}
