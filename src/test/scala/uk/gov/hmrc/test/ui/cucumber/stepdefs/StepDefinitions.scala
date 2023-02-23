/*
 * Copyright 2023 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages._
import uk.gov.hmrc.test.ui.pages.DoYouWantToUploadAnySupportingDocuments
import uk.gov.hmrc.test.ui.pages.RequiredInformationPage.{onPage, submitPage}
import uk.gov.hmrc.test.ui.pages.base.BasePage

class StepDefinitions extends BaseStepDef {

  Given("I am on the ARS Home Page")(() => BasePage.invokeURL(BasePage.URL_ARSHomePage))

  When("I click on Start new application in ARS Home") {
    () =>
      onPage(base.BasePage.arsHomePageText)
      submitPage()
  }
  And(
    "I check all the checkboxes and click continue in Information you need to complete an application page"
  ) {
    () =>
      RequiredInformationPage.loadPage()
      RequiredInformationPage.selectAllCheckbox()
      submitPage()
  }
  And("I select {booleanValue} and continue in Are you planning to import goods page") {
    (option: Boolean) =>
      PlanningToImportGoods.loadPage()
      PlanningToImportGoods.select(option)
      submitPage()
  }
  And("I click on continue in How We Contact You page") {
    () =>
      HowWeContactYou.loadPage()
      submitPage()
  }
  And("I select {booleanValue} and continue in Check the name and address page") {
    (option: Boolean) => AddressPage.loadPage().select(option).submitPage()
  }
  And("I select {booleanValue} and continue in Have you found the commodity code") {
    (option: Boolean) => HaveYouFoundTheCommodityCode.loadPage().select(option).submitPage()
  }
  And(
    "I select {booleanValue} and continue in Do you want to add any confidential information page"
  ) {
    (option: Boolean) =>
      DoYouWantToAddAnyConfidentialInformation
        .loadPage()
        .select(option)
        .submitPage()
  }
  And("I select {booleanValue} and continue in Are the Goods being shipped directly page") {
    (option: Boolean) =>
      AreTheGoodsBeingShippedDirectly
        .loadPage()
        .select(option)
        .submitPage()
  }
  And(
    "I select {booleanValue} and continue in Do you want to upload any supporting documents page"
  ) {
    (option: Boolean) =>
      DoYouWantToUploadAnySupportingDocuments
        .loadPage()
        .select(option)
        .submitPage()
  }

  And(
    "I enter Name- {string} Email- {string},Phone- {string} details and continue in Provide your contact details page"
  ) {
    (name: String, email: String, phone: String) =>
      ProvideYourContactDetails.loadPage()
      ProvideYourContactDetails.enterContactDetails(name, email, phone)
      submitPage()
  }
  And("I select Method {int} and continue in Select the method page") {
    (methodNumber: Int) =>
      MethodSelectionPage.loadPage()
      MethodSelectionPage.selectMethod(methodNumber)
      submitPage()
  }
  Then("I navigate to Description of the Goods") {
    () => BasePage.invokeURL(DescriptionOfTheGoods.url)
  }
  And("I enter {string} as the description and press continue") {
    (goodsName: String) =>
      DescriptionOfTheGoods
        .loadPage()
        .enterGoodsName(goodsName)
      submitPage()
  }
  And("I select {booleanValue} and continue in Have you found the commodity code page") {
    (option: Boolean) => HaveYouFoundTheCommodityCode.loadPage().select(option)
  }

  And("I enter the commodity code {string} and continue in What is the commodity code page") {
    (commodityCode: String) =>
      WhatIsTheCommodityCode
        .loadPage()
        .enterCommodityCode(commodityCode)
      submitPage()
  }
  And("I enter country {string} and continue in Which country are the Goods coming from page") {
    (country: String) =>
      WhichCountryAreTheGoodsComingFrom
        .loadPage()
        .enterCountry(country)
      submitPage()
  }

  And("I enter description and continue in How would you describe the Goods page") {
    () =>
      HowWouldYouDescribeTheGoods
        .loadPage()
        .enterGoodsDescription("Goods Description")
      submitPage()
  }
  And("I enter description and continue in How are the Goods made page") {
    () =>
      HowAreTheGoodsMade
        .loadPage()
        .enterHowItMade("How it Made Description")
      submitPage()
  }

  And(
    "I enter the details and continue in What confidential information would you like to add page"
  ) {
    () =>
      WhatConfidentialInformationWouldYouLikeToAdd
        .loadPage()
        .enterConfidentialInfo("Confidential info")
      submitPage()
  }

  And("I upload the document and continue in Upload supporting documents page") {
    () =>
      UploadSupportingDocuments
        .loadPage()
        .uploadDocument()
      submitPage()
  }
  And(
    "I select {booleanValue} and continue in Do you want this file to be marked as confidential page"
  ) {
    (option: Boolean) =>
      DoYouWantThisFileToBeMarkAsConfidential.loadPage().select(option).submitPage()
  }

  Then("I will be navigated to This service is designed for those") {
    () =>
      ThisServiceIsDesignedForThose.loadPage()
      ThisServiceIsDesignedForThose.linkNavigationValidation()
  }
  Then("I will be navigated to Your EORI details must be up to date to use this service")(
    () => YourEORIMustBeUpToDate.loadPage()
  )
  Then("I will be navigated to You must have a commodity code") {
    () =>
      YouMustHaveACommodityCode.loadPage()
      YouMustHaveACommodityCode.linkNavigationValidation()
  }
  Then("I will be navigated to Have the goods been subject to legal challenges") {
    () => HaveTheGoodsBeenSubjectToLegalChallenges.loadPage()
  }
  Then("I will be navigated to You have uploaded supporting document") {
    () => YouHaveUploadedSupportingDocument.loadPage()
  }

  Then("I will be navigated to Why Computed Value page")(() => WhyComputedValue.loadPage())

  And("I enter a reason and continue in Why Computed Value page") {
    () =>
      WhyComputedValue.enterReasonForComputedValue("Reasonable argument with evidence")
      submitPage()
  }

  Then("I will be navigated to Explain Reason Computed Value page") {
    () => ExplainWhyComputedValue.loadPage()
  }

  And("I enter a reason and continue in Explain Reason Computed Value page") {
    () =>
      ExplainWhyComputedValue.enterReasonForComputedValue("Detailed explanation")
      submitPage()
  }

  Then("I will be navigated to Explain Why Transaction of Similar Goods page") {
    () => WhyTransactionValueOfSimilarGoods.loadPage()
  }

  And("I enter a reason and continue in Explain Why Transaction of Similar Goods page") {
    () =>
      WhyTransactionValueOfSimilarGoods.enterReasonForComputedValue("Detailed explanation")
      submitPage()
  }

  Then("I will be navigated to Have You Used Method One In the Past page") {
    () => HaveYouUsedMethodOneInPast.loadPage()
  }

  And("I select {booleanValue} and continue in Have You Used Method One In the Past page") {
    (option: Boolean) => HaveYouUsedMethodOneInPast.select(option).submitPage()
  }

  Then("I will be navigated to Explain Why Identical Goods page") {
    () => WhyIdenticalGoods.loadPage()
  }

  And("I enter a reason and continue in Explain Why Identical Goods page") {
    () =>
      WhyIdenticalGoods.enterReasonForComputedValue("Detailed explanation")
      submitPage()
  }

  And("I select {booleanValue} and continue in Is There a Sale Involved") {
    (option: Boolean) => IsThereASaleInvolved.loadPage().select(option).submitPage()
  }

  And("I select {booleanValue} and continue in Is the sale between related parties") {
    (option: Boolean) => IsTheSaleBetweenRelatedParties.loadPage().select(option).submitPage()
  }

  And("I enter {string} and continue in Describe how the parties are related") {
    (text: String) =>
      DescribeHowPartiesAreRelated.enterText(text)
      submitPage()
  }

  And(
    "I select {booleanValue} and continue in Are there any restrictions on the use or resale of the goods"
  )((option: Boolean) => AreThereAnyRestrictionsOnGoods.select(option).submitPage())
  And("I enter {string} and continue in Describe any restrictions on the use or resale of goods") {
    (text: String) =>
      DescribeAnyRestrictions.enterText(text)
      submitPage()
  }

  And(
    "I select {booleanValue} and continue in Is the sale subject to any conditions or circumstances that could restrict you from valuing the goods"
  )((option: Boolean) => IsSaleSubjectToConditions.select(option).submitPage())

  And(
    "I enter {string} and continue in Describe the conditions or circumstances which cannot be calculated"
  ) {
    (text: String) =>
      DescribeAnyConditions.enterText(text)
      submitPage()
  }
}
