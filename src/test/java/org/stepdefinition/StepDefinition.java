package org.stepdefinition;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.pojoclass.PojoHome;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition extends BaseClass {

	public static PojoHome pj;

	@Given("user has to launch the chrome and hit the growthengineering website")
	public void user_has_to_launch_the_chrome_and_hit_the_growthengineering_website() {
		launchChrome();
		launchUrl("https://www.growthengineering.co.uk/");
		maxWindow();
		implicitWaitMethod();
	}

	@When("user has to click on the our product menu in the navigation page")
	public void user_has_to_click_on_the_our_product_menu_in_the_navigation_page() throws InterruptedException {
		pj = new PojoHome();
		moveElement(pj.getOurProduct());
		Thread.sleep(5000);

	}

	@When("user will be able to see the knowledge arcade ,authoring tool,academy LMS options")
	public void user_will_be_able_to_see_the_knowledge_arcade_authoring_tool_academy_LMS_options() {
		System.out.println("The options in the our products will be listed");
	}

	@Then("user will be able to click on the needed options in the our product menu")
	public void user_will_be_able_to_click_on_the_needed_options_in_the_our_product_menu() {
		System.out.println("The needed options can be clicked as per the requirements");
	}

	@When("user has to click on the get in touch menu and the form validation page opens")
	public void user_has_to_click_on_the_get_in_touch_menu_and_the_form_validation_page_opens() {
		btnClick(pj.getGetInTouch());

	}

	@When("user has to enter the firstname,last name in the text box")
	public void user_has_to_enter_the_firstname_last_name_in_the_text_box() {
		fillTheValues(pj.getFirstName(), "arul");
		fillTheValues(pj.getLastName(), "prakash");
	}

	@When("the email ,telephone number,company name has to be entered")
	public void the_email_telephone_number_company_name_has_to_be_entered() {
		fillTheValues(pj.getEmail(), "arulprakash@gmail.com");
		fillTheValues(pj.getTelephone(), "9876543210");
		fillTheValues(pj.getCompany(), "GrowthEngineering");
	}

	@When("the country dropdown should be selected with appropriate options")
	public void the_country_dropdown_should_be_selected_with_appropriate_options() {
		selectionByValue(pj.getCountry(), "India");
	}

	@When("the number of learners should be selected")
	public void the_number_of_learners_should_be_selected() {
		btnClick(pj.getNoOfLearners());
	}

	@When("user has to select the roles and the enquiry purpose should be selected from the multiple options")
	public void user_has_to_select_the_roles_and_the_enquiry_purpose_should_be_selected_from_the_multiple_options() throws InterruptedException {
		Thread.sleep(3000);
		selectionByInde(pj.getRoles(), 1);
		Thread.sleep(3000);
		selectionByInde(pj.getPurposeOfEnquiry(), 1);
	}

	@When("click on the privacy policy check box")
	public void click_on_the_privacy_policy_check_box() {
		btnClick(pj.getCheckBox());
	}

	@When("click on the submit button")
	public void click_on_the_submit_button() {
		//btnClick(pj.getSubmitBtn());
	}

	@Then("user wil navigate to the homepage with a message as member of our team will be in touch as soon as possible.")
	public void user_wil_navigate_to_the_homepage_with_a_message_as_member_of_our_team_will_be_in_touch_as_soon_as_possible() {
		System.out.println("Details are filled");
	}

}
