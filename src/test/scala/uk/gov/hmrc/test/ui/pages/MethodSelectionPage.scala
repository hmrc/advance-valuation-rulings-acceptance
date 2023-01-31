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

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.By

object MethodSelectionPage extends BasePage {

  val pageTile       =
    "Select the method you will use to value your goods - Advance Ruling Service - GOV.UK"
  val error_PageTile =
    "Error: Select the method you will use to value your goods - Advance Ruling Service - GOV.UK"
  val methodOne      = By.id("value_0")
  val methodTwo      = By.id("value_1")
  val methodThree    = By.id("value_2")
  val methodFour     = By.id("value_3")
  val methodFive     = By.id("value_4")
  val methodSix      = By.id("value_5")

  def loadPage: this.type = {
    onPage(this.pageTile)
    this
  }

  def errorLoadPage: this.type = {
    onPage(this.error_PageTile)
    this
  }

  def selectMethod(methodNumber: Int): Unit =
    methodNumber match {
      case 1 => methodOne.find.click()
      case 2 => methodTwo.find.click()
      case 3 => methodThree.find.click()
      case 4 => methodFour.find.click()
      case 5 => methodFive.find.click()
      case 6 => methodSix.find.click()
      case _ => throw new Exception("Invalid method number")
    }
}
