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

object RequiredInformationPage extends BasePage {

  import org.openqa.selenium.By

  val pageTitle      =
    "Information you need to complete an application - Advance Ruling Service - GOV.UK"
  val errorPageTitle =
    "Error: Information you need to complete an application - Advance Ruling Service - GOV.UK"
  val ele_Checkbox1  = "value_0"
  val ele_Checkbox2  = "value_1"
  val ele_Checkbox3  = "value_2"
  val ele_Checkbox4  = "value_3"
  val ele_Checkbox5  = "value_4"
  val ele_Checkbox6  = "value_5"
  val ele_Checkbox7  = "value_6"
  val ele_Checkbox8  = "value_7"
  val ele_Continue   = "govuk-button"

  def loadPage() {
    onPage(this.pageTitle)
  }

  def error_LoadPage: this.type = {
    //  driver.navigate().to(url)
    onPage(this.errorPageTitle)
    this
  }

  def selectAllCheckbox(): this.type = {

    if (!driver.findElement(By.id(ele_Checkbox1)).isSelected)
      driver.findElement(By.id(ele_Checkbox1)).click()
    if (!driver.findElement(By.id(ele_Checkbox2)).isSelected)
      driver.findElement(By.id(ele_Checkbox2)).click()
    if (!driver.findElement(By.id(ele_Checkbox3)).isSelected)
      driver.findElement(By.id(ele_Checkbox3)).click()
    if (!driver.findElement(By.id(ele_Checkbox4)).isSelected)
      driver.findElement(By.id(ele_Checkbox4)).click()
    if (!driver.findElement(By.id(ele_Checkbox5)).isSelected)
      driver.findElement(By.id(ele_Checkbox5)).click()
    if (!driver.findElement(By.id(ele_Checkbox6)).isSelected)
      driver.findElement(By.id(ele_Checkbox6)).click()
    if (!driver.findElement(By.id(ele_Checkbox7)).isSelected)
      driver.findElement(By.id(ele_Checkbox7)).click()
    if (!driver.findElement(By.id(ele_Checkbox8)).isSelected)
      driver.findElement(By.id(ele_Checkbox8)).click()

    // PlanningToImportGoods
    this
  }

  def notSelectAllCheckbox() {
    val rand = new scala.util.Random
    val i    = rand.nextInt(7)

    if (i != 0) driver.findElement(By.id(ele_Checkbox1)).click()
    if (i != 1) driver.findElement(By.id(ele_Checkbox2)).click()
    if (i != 2) driver.findElement(By.id(ele_Checkbox3)).click()
    if (i != 3) driver.findElement(By.id(ele_Checkbox4)).click()
    if (i != 4) driver.findElement(By.id(ele_Checkbox5)).click()
    if (i != 5) driver.findElement(By.id(ele_Checkbox6)).click()
    if (i != 6) driver.findElement(By.id(ele_Checkbox7)).click()
    if (i != 7) driver.findElement(By.id(ele_Checkbox8)).click()
    submitPage()

  }

}
