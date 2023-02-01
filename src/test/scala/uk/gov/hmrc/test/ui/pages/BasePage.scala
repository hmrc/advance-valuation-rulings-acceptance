
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
    if (titlecheck == "Authority Wizard") {
      driver.findElement(By.id("redirectionUrl")).clear()
      driver.findElement(By.id("redirectionUrl")).sendKeys(URL_ARSHomePage )
      submitPage()
    }
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
