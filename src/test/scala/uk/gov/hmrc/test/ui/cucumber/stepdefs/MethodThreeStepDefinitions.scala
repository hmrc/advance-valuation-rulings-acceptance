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

import uk.gov.hmrc.test.ui.pages.RequiredInformationPage.submitPage
import uk.gov.hmrc.test.ui.pages._

trait MethodThreeStepDefintions extends BaseStepDef {

  Then("I will be navigated to Explain Why Transaction of Similar Goods page") {
    () => ExplainWhyNotMethodOneOrTwo.loadPage()
  }

  Then("I will be navigated to Describe the Similar Goods page") {
    () => DescribeTheSimilarGoodsPage.loadPage()
  }

  And("I select {booleanValue} and continue in Have You Used Method One In the Past 90 days") {
    (option: Boolean) =>
      HaveYouUsedMethod1InLast90days.loadPage()
      HaveYouUsedMethod1InLast90days.select(option)
      submitPage()
  }

  And("I enter a reason and continue in Explain Why Transaction of Similar Goods page") {
    () =>
      ExplainWhyNotMethodOneOrTwo
        .enterText("Detailed explanation")
        .submitPage()
  }

  And("I enter a reason and continue in Describe the Similar Goods page") {
    () =>
      DescribeTheSimilarGoodsPage
        .enterText("Detailed explanation")
        .submitPage()
  }

  Then("I will be navigated to have you used Valuation Method 1 to import similar goods") {
    () => ExplainWhyNotMethodOneOrTwo.loadPage()
  }

  And("I select that I have used Method 1 to import similar goods in the past 90 days") {
    () =>
      ExplainWhyNotMethodOneOrTwo
        .enterText("Detailed explanation")
        .submitPage()
  }

  And("I select that I have not used Method 1 to import similar goods in the past 90 days") {
    () =>
      ExplainWhyNotMethodOneOrTwo
        .enterText("Detailed explanation")
        .submitPage()
  }
}
