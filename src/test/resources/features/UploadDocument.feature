@EndToEndJourney

Feature: End To End Journey

@smoke
Scenario: Upload document

Given I am on the ARS Home Page
When I click on Start new application in ARS Home
And I check all the checkboxes and click continue in Information you need to complete an application page
And I select "Yes" and continue in Are you planning to import goods page
And I click on continue in How We Contact You page
And I select "Yes" and continue in Check the name and address page
And I enter Name- "Automation Test" Email- "Test@automation.com",Phone- "9876543211" details and continue in Provide your contact details page

  And I select Method 3 and continue in Select the method page
  Then I will be navigated to Explain Why Transaction of Similar Goods page
  And I enter a reason and continue in Explain Why Transaction of Similar Goods page
  Then I will be navigated to Have You Used Method One In the Past page
  And I select "Yes" and continue in Have You Used Method One In the Past page

  And I enter description and continue in How would you describe the Goods page
  And I enter description and continue in How are the Goods made page

  And I select "Yes" and continue in Have you found the commodity code page
  And I enter the commodity code "1234" and continue in What is the commodity code page

  Then I will be navigated to Have the goods been subject to legal challenges
#  And I select "Yes" and continue in Have the goods been subject to legal challenges
#  And I enter description and continue in describe the legal challenges

#  And I select "Yes" and continue in Do you want to add any confidential information page
#  And I enter the details and continue in What confidential information would you like to add page
#  And I select "Yes" and continue in Do you want to upload any supporting documents page
#  And I upload the document "abc" and continue in Upload supporting documents page
#  And I select "Yes" and continue in Do you want this file to be marked as confidential page
#  Then I will be navigated to You have uploaded supporting document



##  Scenario: Confidential information No flow
##    Given I am on the ARS Home Page
##    Given I am on the ARS Home Page
##    When I click on Start new application in ARS Home
##    And I check all the checkboxes and click continue in Information you need to complete an application page
##    And I select "Yes" and continue in Are you planning to import goods page
##    And I click on continue in How We Contact You page
##    And I select "Yes" and continue in Check the name and address page
##    And I enter Name- "Automation Test" Email- "Test@automation.com",Phone- "9876543211" details and continue in Provide your contact details page
##    And I select Method 2 and continue in Select the method page
##    Then I will be navigated to Explain Why Identical Goods page
##    And I enter a reason and continue in Explain Why Identical Goods page
##    Then I will be navigated to Have You Used Method One In the Past page
##    And I select "Yes" and continue in Have You Used Method One In the Past page
#
#
##    And I select "Yes" and continue in Have you found the commodity code page
##    And I enter the commodity code "1234" and continue in What is the commodity code page
##    And I enter country "India" and continue in Which country are the Goods coming from page
##    And I select "Yes" and continue in Are the Goods being shipped directly page
## # No also same flow
##    And I enter description and continue in How would you describe the Goods page
##    And I enter description and continue in How are the Goods made page
#
#
#    And I select "Yes" and continue in Do you want to add any confidential information page
#    #    #from here
#
#    And I select "Yes" and continue in Do you want to upload any supporting documents page
#    And I upload the document "test" and continue in Upload supporting documents page
#    And I select "Yes" and continue in Do you want this file to be marked as confidential page
#    Then I will be navigated to You have uploaded supporting document
#
#
#
#
#  Scenario: Confidential information Yes flow
#    Given I am on the ARS Home Page
#    When I click on Start new application in ARS Home
#    And I check all the checkboxes and click continue in Information you need to complete an application page
#    And I select "Yes" and continue in Are you planning to import goods page
#    And I click on continue in How We Contact You page
#    And I select "Yes" and continue in Check the name and address page
#    And I enter Name- "Automation Test" Email- "Test@automation.com",Phone- "9876543211" details and continue in Provide your contact details page
#    And I select Method 3 and continue in Select the method page
#
#
##    And I select "Yes" and continue in Have you found the commodity code page
##    And I enter the commodity code "1234" and continue in What is the commodity code page
#    And I enter country "Japan" and continue in Which country are the Goods coming from page
#    And I select "Yes" and continue in Are the Goods being shipped directly page
# # No also same flow
#    And I enter description and continue in How would you describe the Goods page
#    And I enter description and continue in How are the Goods made page
##from here
##    And I select "Yes" and continue in Do you want to add any confidential information page
##    And I enter the details and continue in What confidential information would you like to add page
##    And I select "Yes" and continue in Do you want to upload any supporting documents page
##    And I upload the document "abc" and continue in Upload supporting documents page
##    And I select "Yes" and continue in Do you want this file to be marked as confidential page
##    Then I will be navigated to You have uploaded supporting document