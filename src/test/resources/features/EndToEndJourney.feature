@EndToEndJourney

Feature: End To End Journey

#kickout pages
  Scenario: This service is designed for those page
    Given I am on the ARS Home Page
    When I Click on Continue
    Then I will be navigated to Required information page
    When I check all the checkboxes and click continue
    Then I will be navigated to Planning to Import Goods page
    When I select No and continue
    Then I will be navigated to This service is designed for those


Scenario: Your EORI details must be up to date to use this service
    Given I am on the ARS Home Page
    When I Click on Continue
    Then I will be navigated to Required information page
    When I check all the checkboxes and click continue
    Then I will be navigated to Planning to Import Goods page
    When I select Yes and continue
    Then I will be navigated to Some of the information you provide
    When I Click on Continue
    Then I will be navigated to How We Contact You page
    When I Click on Continue
    Then I will be navigated to Address page
    When I select No and continue
    Then I will be navigated to Your EORI details must be up to date to use this service


  Scenario: You must have a commodity code page
    Given I am on the ARS Home Page
    When I Click on Continue
    Then I will be navigated to Required information page
    When I check all the checkboxes and click continue
    Then I will be navigated to Planning to Import Goods page
    When I select Yes and continue
    Then I will be navigated to Some of the information you provide
    When I Click on Continue
    Then I will be navigated to How We Contact You page
    When I Click on Continue
    Then I will be navigated to Address page
    When I select Yes and continue
    Then I will be navigating to Provide your contact details
    When I enter details and continue in Provide your contact details page
    Then I will be navigated to Method selection page
    When I select Method and Click continue
    Then I will be navigated to Name of the Goods page
    When I enter the Goods Name and continue
    Then I will be navigated to Have you found the commodity code with Goods name
    When I select No and continue
    Then I will be navigated to You must have a commodity code

    # End 2 End Flow
  Scenario: Confidential information Yes flow
    Given I am on the ARS Home Page
    When I Click on Continue
    Then I will be navigated to Required information page
    When I check all the checkboxes and click continue
    Then I will be navigated to Planning to Import Goods page
    When I select Yes and continue
    Then I will be navigated to Some of the information you provide
    When I Click on Continue
    Then I will be navigated to How We Contact You page
    When I Click on Continue
    Then I will be navigated to Address page
    When I select Yes and continue
    Then I will be navigating to Provide your contact details
    When I enter details and continue in Provide your contact details page
    Then I will be navigated to Method selection page
    When I select Method and Click continue
    Then I will be navigated to Name of the Goods page
    When I enter the Goods Name and continue
    Then I will be navigated to Have you found the commodity code with Goods name
    When I select Yes and continue
    Then I will be navigated to What is the commodity code with Goods name
    When I enter commodity code and continue
    Then I will be navigated to Which country are the goods coming from
    When I enter country name and click continue
    Then I will be navigated to Are the Goods being shipped directly page
    When I select Yes and continue
    # No also same flow
    Then I will be navigated to How would you describe the
    When I enter the Goods Description and continue
    Then I will be navigated to How are the Goods made page
    When I enter How it made description and continue
    Then I will be navigated to  Do you want to add any confidential information page
    #from here
    When I select Yes and continue
    Then I will be navigated to What confidential information would you like to add
    When I enter confidential information and continue
  Then I will be navigated to Do you want to upload any supporting documents
  When I select Yes and continue
  Then I will be navigated to Upload supporting documents page
  When I enter or select document and continue
  Then I will be navigated to Do you want this file to be marked as confidential page
  When I select Yes and continue
    Then I will be navigated to You have uploaded supporting document

  Scenario: Confidential information No flow
    Given I am on the ARS Home Page
    When I Click on Continue
    Then I will be navigated to Required information page
    When I check all the checkboxes and click continue
    Then I will be navigated to Planning to Import Goods page
    When I select Yes and continue
    Then I will be navigated to Some of the information you provide
    When I Click on Continue
    Then I will be navigated to How We Contact You page
    When I Click on Continue
    Then I will be navigated to Address page
    When I select Yes and continue
    Then I will be navigating to Provide your contact details
    When I enter details and continue in Provide your contact details page
    Then I will be navigated to Method selection page
    When I select Method and Click continue
    Then I will be navigated to Name of the Goods page
    When I enter the Goods Name and continue
    Then I will be navigated to Have you found the commodity code with Goods name
    When I select Yes and continue
    Then I will be navigated to What is the commodity code with Goods name
    When I enter commodity code and continue
    Then I will be navigated to Which country are the goods coming from
    When I enter country name and click continue
    Then I will be navigated to Are the Goods being shipped directly page
    When I select Yes and continue
    # No also same flow
    Then I will be navigated to How would you describe the
    When I enter the Goods Description and continue
    Then I will be navigated to How are the Goods made page
    When I enter How it made description and continue
    Then I will be navigated to  Do you want to add any confidential information page
    #from here
    When I select No and continue
    Then I will be navigated to Do you want to upload any supporting documents
    When I select Yes and continue
    Then I will be navigated to Upload supporting documents page
    When I enter or select document and continue
    Then I will be navigated to Do you want this file to be marked as confidential page
    When I select Yes and continue
    Then I will be navigated to You have uploaded supporting document


  Scenario: Upload Supporting documents No flow
    Given I am on the ARS Home Page
    When I Click on Continue
    Then I will be navigated to Required information page
    When I check all the checkboxes and click continue
    Then I will be navigated to Planning to Import Goods page
    When I select Yes and continue
    Then I will be navigated to Some of the information you provide
    When I Click on Continue
    Then I will be navigated to How We Contact You page
    When I Click on Continue
    Then I will be navigated to Address page
    When I select Yes and continue
    Then I will be navigating to Provide your contact details
    When I enter details and continue in Provide your contact details page
    Then I will be navigated to Method selection page
    When I select Method and Click continue
    Then I will be navigated to Name of the Goods page
    When I enter the Goods Name and continue
    Then I will be navigated to Have you found the commodity code with Goods name
    When I select Yes and continue
    Then I will be navigated to What is the commodity code with Goods name
    When I enter commodity code and continue
    Then I will be navigated to Which country are the goods coming from
    When I enter country name and click continue
    Then I will be navigated to Are the Goods being shipped directly page
    When I select Yes and continue
    # No also same flow
    Then I will be navigated to How would you describe the
    When I enter the Goods Description and continue
    Then I will be navigated to How are the Goods made page
    When I enter How it made description and continue
    Then I will be navigated to  Do you want to add any confidential information page
    When I select Yes and continue
    Then I will be navigated to What confidential information would you like to add
    When I enter confidential information and continue
    Then I will be navigated to Do you want to upload any supporting documents
    When I select No and continue
  #  Then I will be navigated to Have there been any legal challenges relating to the goods


#
#  Scenario: Method 2 flow
#    Given I am on the ARS Home Page
#    When I Click on Continue
#    Then I will be navigated to Required information page
#    When I check all the checkboxes and click continue
#    Then I will be navigated to Planning to Import Goods page
#    When I select Yes and continue
#    Then I will be navigated to Some of the information you provide
#    When I Click on Continue
#    Then I will be navigated to How We Contact You page
#    When I Click on Continue
#    Then I will be navigated to Address page
#    When I select Yes and continue
#    Then I will be navigating to Provide your contact details
#    When I enter details and continue in Provide your contact details page
#    Then I will be navigated to Method selection page
#    When I select Method 2 and Click continue
#    Then I will be navigated to Name of the Goods page
#    When I enter the Goods Name and continue
#    Then I will be navigated to Have you found the commodity code with Goods name
#    When I select Yes and continue
#    Then I will be navigated to What is the commodity code with Goods name
#    When I enter commodity code and continue
#    Then I will be navigated to Which country are the goods coming from