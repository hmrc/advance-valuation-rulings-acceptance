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

trait MethodTwoStepDefintions extends BaseStepDef {
  Then("I will be navigated to Outline Why Not Method One page") {
    () => OutlineWhyNotMethodOne.loadPage()
  }

  And("I enter {string} as my reason why I did not select method 1") {
    (reason: String) =>
      OutlineWhyNotMethodOne
        .enterText(reason)
        .submitPage()
  }

  Then("I will be navigated to In the Past Have you used Method 1 to import any goods") {
    () => HaveYouUsedMethodOneToImportInPast.loadPage()
  }

  And("I select that I have used Method 1 to import goods and press continue") {
    () => HaveYouUsedMethodOneToImportInPast.selectYes().submitPage()
  }

  And("I select that I have not used Method 1 to import goods and press continue") {
    () => HaveYouUsedMethodOneToImportInPast.selectNo().submitPage()
  }

  Then(
    "I will be navigated to will you be comparing your goods to identical goods imported by another party"
  )(() => WillYouBeComparingToIdenticalGoods.loadPage())

  And("I select that I will be comparing the goods to identical goods imported by another party") {
    () => WillYouBeComparingToIdenticalGoods.selectYes().submitPage()
  }

  And(
    "I select that I will not be comparing my goods to identical goods imported by another party"
  )(() => WillYouBeComparingToIdenticalGoods.selectNo().submitPage())

  Then(
    "I will be navigated to Explain How You are Comparing Goods to identical goods imported by another party"
  )(() => ExplainHowYouWillCompareToIdenticalGoods.loadPage())

  And(
    "I enter {string} as my explanation of how I am comparing my goods to identical goods imported by another party"
  )((reason: String) => ExplainHowYouWillCompareToIdenticalGoods.enterText(reason).submitPage())

  Then("I will be navigated to Describe the Identical Goods") {
    () =>
      DescribeTheIdenticalGoods
        .loadPage()
  }
  And("I enter {string} as the description of the identical goods and press continue") {
    (description: String) =>
      DescribeTheIdenticalGoods
        .enterText(description)
        .submitPage()
  }

  And(
    "I enter {string} in my Description of the Goods page"
  )((reason: String) => DescriptionOfTheGoodsPage.enterText(reason).submitPage())

  And(
    "I enter {string} in my enter commodity code"
  )((reason: String) => EnterIntegerInCommidityCodePage.enterText(reason).submitPage())
}
