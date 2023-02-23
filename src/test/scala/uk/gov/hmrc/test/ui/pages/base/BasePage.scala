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

package uk.gov.hmrc.test.ui.pages.base
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.driver.BrowserDriver

import org.openqa.selenium.{By, WebDriver}
import org.scalatest.matchers.should.Matchers

trait BasePage extends BrowserDriver with Matchers {
  val pageTitle: String

  val continueButton          = "govuk-button"
  var GoodsName               = "No name of goods found"
  val ele_StartNewApplication = "csrfToken"

  def submitPage(): Unit =
    driver.findElement(By.className(continueButton)).click()

  def loadPage(): this.type = {
    onPage(this.pageTitle)
    this
  }

  def onPage(pageTitle: String): Unit = {
    val actual: String = driver.getTitle.trim

    if (actual != pageTitle)
      throw PageNotFoundException(
        s"Expected '$pageTitle' page, but found '$actual' page."
      )
  }
}

case class PageNotFoundException(s: String) extends Exception(s)

object BasePage {
  lazy val baseUrl = TestConfiguration.environmentHost

  val continueButton                                           = "govuk-button"
  val arsHomePageText                                          = "Your applications and rulings - Advance Ruling Service - GOV.UK"
  val URL_ARSHomePage                                          = s"$baseUrl/advance-valuation-ruling/accountHome"
  val nameOfGoodsUrl                                           = s"$baseUrl/advance-valuation-ruling/nameOfGoods"
  def invokeURL(URL: String)(implicit driver: WebDriver): Unit = {
    driver.navigate().to(URL)
    val titlecheck = driver.getTitle
    if (titlecheck == "Authority Wizard") {
      driver.findElement(By.id("redirectionUrl")).clear()
      driver.findElement(By.id("redirectionUrl")).sendKeys(URL_ARSHomePage)
      driver.findElement(By.className(continueButton)).click()
    }
  }
}
