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

import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.driver.BrowserDriver

import org.openqa.selenium.By
import org.scalatest.matchers.should.Matchers

trait BasePage extends BrowserDriver with Matchers {
  val continueButton          = "govuk-button"
  var GoodsName               = "Coffee"
  val radioOptionYes          = "(//input[@type='radio'])[1]"
  val radioOptionNo           = "(//input[@type='radio'])[2]"
  val arsHomePageText         = "Your applications and rulings - Advance Ruling Service - GOV.UK"
  val ele_StartNewApplication = "csrfToken"
  lazy val baseUrl            = TestConfiguration.environmentHost
  val URL_ARSHomePage         = s"$baseUrl/advance-valuation-ruling/accountHome"

  def submitPage(): Unit =
    driver.findElement(By.className(continueButton)).click()

  def invokeURL(URL: String) {
    driver.navigate().to(URL)
    val titlecheck = driver.getTitle
    if (titlecheck == "Authority Wizard")
      submitPage()
  }

  def onPage(pageTitle: String): Unit = {
    var actual: String = driver.getTitle
    actual = actual.trim
    val expected       = driver.getTitle.trim
    println("Actual   -" + actual)
    println("Expected -" + pageTitle)

    if (expected != pageTitle)
      throw PageNotFoundException(
        s"Expected '$pageTitle' page, but found '$actual' page."
      )
  }

  def arsHomePageValidation(): Unit = {
    onPage(this.arsHomePageText)
    assert(driver.findElement(By.name(ele_StartNewApplication)).isDisplayed)
  }

  def radioOptionSelect(radioOption: String) {
    radioOption match {
      case "Yes" => driver.findElement(By.xpath(radioOptionYes)).click()
      case "No"  => driver.findElement(By.xpath(radioOptionNo)).click()
      case _     => Thread.sleep(1000)
    }
  }
}

case class PageNotFoundException(s: String) extends Exception(s)
