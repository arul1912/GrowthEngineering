Feature: To validate whether all the menu links in the home page of the growthengineering is working

  Background: 
    Given user has to launch the chrome and hit the growthengineering website

  Scenario: To verify the menu in the the navigation is working
    When user has to click on the our product menu in the navigation page
    And user will be able to see the knowledge arcade ,authoring tool,academy LMS options
    Then user will be able to click on the needed options in the our product menu

    Scenario: To verify the form validation works on the contact page
    When user has to click on the get in touch menu and the form validation page opens
    And user has to enter the firstname,last name in the text box
    And the email ,telephone number,company name has to be entered
    And the country dropdown should be selected with appropriate options
    And the number of learners should be selected 
    And user has to select the roles and the enquiry purpose should be selected from the multiple options
    And click on the privacy policy check box
    And click on the submit button 
    Then user wil navigate to the homepage with a message as member of our team will be in touch as soon as possible.