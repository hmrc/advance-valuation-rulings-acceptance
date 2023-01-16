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

object ProvideYourContactDetails extends BasePage {

  val pageTile       =
    "Provide the contact details for this application - Advance Ruling Service - GOV.UK"
  val error_PageTile =
    "Error: Provide the contact details for this application - Advance Ruling Service - GOV.UK"

  val ele_name                                                                = "name"
  val ele_email                                                               = "email"
  val ele_contact                                                             = "phone"
  def loadPage: this.type                                                     = {
    onPage(this.pageTile)
    this
  }
  def enterContactDetails(name: String, email: String, contact: String): Unit = {
    driver.findElement(By.id(ele_name)).clear()
    driver.findElement(By.id(ele_name)).sendKeys(name)
    driver.findElement(By.id(ele_email)).clear()
    driver.findElement(By.id(ele_email)).sendKeys(email)
    driver.findElement(By.id(ele_contact)).clear()
    driver.findElement(By.id(ele_contact)).sendKeys(contact)
  }
}
