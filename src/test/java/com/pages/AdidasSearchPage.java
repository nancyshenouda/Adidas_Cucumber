package com.pages;

import com.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdidasSearchPage {

    public AdidasSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//a[@id='itemc'])[2]")
    public WebElement laptops;

    @FindBy(xpath = "//a[.='Sony vaio i5']")
    public WebElement SonyVaioI5;

    @FindBy(xpath = "//a[.='Add to cart']")
    public WebElement addToCart;

    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    public WebElement homeButton;

    @FindBy(xpath = "//a[.='Dell i7 8gb']")
    public WebElement dellLaptop;

    @FindBy(xpath = "//a[@id='cartur']")
    public WebElement cartButton;
    @FindBy(xpath = "(//a[.='Delete'])[2]")
    public WebElement deleteButton;

    @FindBy(xpath = "//button[@class='btn btn-success']")
    public WebElement placeOrder;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement name;

    @FindBy(xpath = "//input[@id='country']")
    public WebElement country;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement city;

    @FindBy(xpath = "//input[@id='card']")
    public WebElement card;

    @FindBy(xpath = "//input[@id='month']")
    public WebElement month;

    @FindBy(xpath = "//input[@id='year']")
    public WebElement year;

    @FindBy(xpath = "//button[.='Purchase']")
    public WebElement okButton;

    @FindBy(xpath = "//p[@class='lead text-muted ']")
    public WebElement confirmation;

    @FindBy(xpath = "//h3[.='700']")
    public WebElement expectedOrderAmount;

    @FindBy(xpath = "//button[@class='confirm btn btn-lg btn-primary']")
    public WebElement lastOkButton;



}
