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
  val ele_Method1    = "value_0"
  val ele_Method2    = "value_1"
  val ele_Method3    = "value_2"
  val ele_Method4    = "value_3"
  val ele_Method5    = "value_4"
  val ele_Method6    = "value_5"

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
      case 1 => driver.findElement(By.id(ele_Method1)).click()
      case 2 => driver.findElement(By.id(ele_Method2)).click()
      case 3 => driver.findElement(By.id(ele_Method3)).click()
      case 4 => driver.findElement(By.id(ele_Method4)).click()
      case 5 => driver.findElement(By.id(ele_Method5)).click()
      case _ => driver.findElement(By.id(ele_Method1)).click()

    }
}
