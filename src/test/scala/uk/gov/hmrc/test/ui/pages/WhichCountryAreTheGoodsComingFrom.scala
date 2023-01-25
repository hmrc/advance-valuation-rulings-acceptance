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

import org.openqa.selenium.{By, Keys}

object WhichCountryAreTheGoodsComingFrom extends BasePage {

  // import uk.gov.hmrc.test.ui.conf.TestConfiguration

  // val pageTitle           = "Which country are the goods coming from - Advance Ruling Service - GOV.UK"
  val pageTitle                               = "Which country are the {0} coming from? - Advance Ruling Service - GOV.UK"
  val countryId                               = "countryId"
  def loadPage: this.type                     = {
    onPage(this.pageTitle)
    this
  }
  def enterCountry(countryName: String): Unit = {
    driver.findElement(By.id(countryId)).clear()
    driver.findElement(By.id(countryId)).sendKeys(countryName)
    Thread.sleep(2000)
    // driver.findElement(By.id(countryId)).sendKeys(Keys.ARROW_DOWN)
    driver.findElement(By.id(countryId)).sendKeys(Keys.ENTER)
    Thread.sleep(2000)
  }
}
