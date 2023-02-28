@EndToEndJourney
Feature: End To End Journey

#kickout pages
  Scenario: This service is designed for those page
    Given I am on the ARS Home Page
    When I click on Start new application in ARS Home
    And I check all the checkboxes and click continue in Information you need to complete an application page
    And I select "No" and continue in Are you planning to import goods page
    Then I will be navigated to This service is designed for those

  Scenario: Your EORI details must be up to date to use this service
    Given I am on the ARS Home Page
    When I click on Start new application in ARS Home
    And I check all the checkboxes and click continue in Information you need to complete an application page
    And I select "Yes" and continue in Are you planning to import goods page
    And I click on continue in How We Contact You page
    And I select "No" and continue in Check the name and address page
    Then I will be navigated to Your EORI details must be up to date to use this service

  Scenario: You must have a commodity code page
    Given I am on the ARS Home Page
    When I click on Start new application in ARS Home
    And I check all the checkboxes and click continue in Information you need to complete an application page
    And I select "Yes" and continue in Are you planning to import goods page
    And I click on continue in How We Contact You page
    And I select "Yes" and continue in Check the name and address page
    And I enter Name- "Automation Test" Email- "Test@automation.com",Phone- "9876543211" details and continue in Provide your contact details page
    Then I navigate to Description of the Goods
    And I enter "Coffee" as the description and press continue
    And I select "No" and continue in Have you found the commodity code
    Then I will be navigated to Have the goods been subject to legal challenges


#  Scenario: Confidential information Yes flow
#    Given I am on the ARS Home Page
#    When I click on Start new application in ARS Home
#    And I check all the checkboxes and click continue in Information you need to complete an application page
#    And I select "Yes" and continue in Are you planning to import goods page
#    And I click on continue in How We Contact You page
#    And I select "Yes" and continue in Check the name and address page
#    And I enter Name- "Automation Test" Email- "Test@automation.com",Phone- "9876543211" details and continue in Provide your contact details page
#    And I select Method 1 and continue in Select the method page
#    Then I navigate to Description of the Goods
#    And I enter "Coffee"  as the description and press continue
#    And I select "Yes" and continue in Have you found the commodity code page
#    And I enter the commodity code "1234" and continue in What is the commodity code page
#    And I enter country "Japan" and continue in Which country are the Goods coming from page
#    And I select "Yes" and continue in Are the Goods being shipped directly page
# # No also same flow
#    And I enter description and continue in How would you describe the Goods page
#    And I enter description and continue in How are the Goods made page
##from here
#    And I select "Yes" and continue in Do you want to add any confidential information page
#    And I enter the details and continue in What confidential information would you like to add page
#    And I select "Yes" and continue in Do you want to upload any supporting documents page
#    And I upload the document and continue in Upload supporting documents page
#    And I select "Yes" and continue in Do you want this file to be marked as confidential page
#    Then I will be navigated to You have uploaded supporting document

#
#
#  Scenario: Confidential information No flow
#    Given I am on the ARS Home Page
#    Given I am on the ARS Home Page
#    When I click on Start new application in ARS Home
#    And I check all the checkboxes and click continue in Information you need to complete an application page
#    And I select "Yes" and continue in Are you planning to import goods page
#    And I click on continue in How We Contact You page
#    And I select "Yes" and continue in Check the name and address page
#    And I enter Name- "Automation Test" Email- "Test@automation.com",Phone- "9876543211" details and continue in Provide your contact details page
#    And I select Method 1 and continue in Select the method page
#    Then I navigate to Description of the Goods
#    And I enter "Coffee" as the description and press continue
#    And I select "Yes" and continue in Have you found the commodity code page
#    And I enter the commodity code "1234" and continue in What is the commodity code page
#    And I enter country "India" and continue in Which country are the Goods coming from page
#    And I select "Yes" and continue in Are the Goods being shipped directly page
# # No also same flow
#    And I enter description and continue in How would you describe the Goods page
#    And I enter description and continue in How are the Goods made page
##    #from here
#    And I select "No" and continue in Do you want to add any confidential information page
#    And I select "Yes" and continue in Do you want to upload any supporting documents page
##    And I upload the document and continue in Upload supporting documents page
##    And I select "Yes" and continue in Do you want this file to be marked as confidential page
##    Then I will be navigated to You have uploaded supporting document
#



#
#  Scenario: Upload Supporting documents No flow
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
#    When I select Method and Click continue
#    Then I navigate to Description of the Goods
#    And I enter "Coffee" as the description and press continue
#    Then I will be navigated to Have you found the commodity code with Goods name
#    When I select Yes and continue
#    Then I will be navigated to What is the commodity code with Goods name
#    When I enter commodity code and continue
#    Then I will be navigated to Which country are the goods coming from
#    When I enter country name and click continue
#    Then I will be navigated to Are the Goods being shipped directly page
#    When I select Yes and continue
#    # No also same flow
#    Then I will be navigated to How would you describe the
#    When I enter the Goods Description and continue
#    Then I will be navigated to How are the Goods made page
#    When I enter How it made description and continue
#    Then I will be navigated to  Do you want to add any confidential information page
#    When I select Yes and continue
#    Then I will be navigated to What confidential information would you like to add
#    When I enter confidential information and continue
#    Then I will be navigated to Do you want to upload any supporting documents
#    When I select No and continue
#  #  Then I will be navigated to Have there been any legal challenges relating to the goods


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