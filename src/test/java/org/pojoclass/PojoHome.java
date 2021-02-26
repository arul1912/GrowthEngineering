package org.pojoclass;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoHome extends BaseClass{
	
	
public PojoHome() {
	PageFactory.initElements(d, this);
}


@FindBy(xpath="(//a[text()='Our Products'])[1]")
private WebElement OurProduct;

@FindBy(xpath="//span[text()='GET IN TOUCH']")
private WebElement getInTouch;

@FindBy(xpath="//input[@id='firstname-63c6168e-e30a-4c79-ab68-77cedae08dfe']")
private WebElement firstName;

@FindBy(xpath="//input[@id='lastname-63c6168e-e30a-4c79-ab68-77cedae08dfe']")
private WebElement lastName;

@FindBy(xpath="//input[@id='email-63c6168e-e30a-4c79-ab68-77cedae08dfe']")
private WebElement email;

@FindBy(xpath="//input[@id='phone-63c6168e-e30a-4c79-ab68-77cedae08dfe']")
private WebElement telephone;
@FindBy(xpath="//input[@id='company-63c6168e-e30a-4c79-ab68-77cedae08dfe']")
private WebElement company;
@FindBy(xpath="//select[@id='country_-63c6168e-e30a-4c79-ab68-77cedae08dfe']")
private WebElement country;
@FindBy(xpath="(//label[@class='hs-form-radio-display'])[1]")
private WebElement noOfLearners;
@FindBy(xpath="//select[@id='role_description-63c6168e-e30a-4c79-ab68-77cedae08dfe']")
private WebElement roles;
@FindBy(xpath="//select[@id='what_is_the_purpose_of_your_enquiry_-63c6168e-e30a-4c79-ab68-77cedae08dfe']")
private WebElement purposeOfEnquiry;
@FindBy(xpath="//input[@type='checkbox']")
private WebElement checkBox;
@FindBy(xpath="//input[@type='submit']")
private WebElement submitBtn;


public WebElement getOurProduct() {
	return OurProduct;
}
public WebElement getGetInTouch() {
	return getInTouch;
}
public WebElement getFirstName() {
	return firstName;
}
public WebElement getLastName() {
	return lastName;
}
public WebElement getEmail() {
	return email;
}
public WebElement getTelephone() {
	return telephone;
}
public WebElement getCompany() {
	return company;
}
public WebElement getCountry() {
	return country;
}
public WebElement getNoOfLearners() {
	return noOfLearners;
}
public WebElement getRoles() {
	return roles;
}
public WebElement getPurposeOfEnquiry() {
	return purposeOfEnquiry;
}
public WebElement getCheckBox() {
	return checkBox;
}
public WebElement getSubmitBtn() {
	return submitBtn;
}



}
