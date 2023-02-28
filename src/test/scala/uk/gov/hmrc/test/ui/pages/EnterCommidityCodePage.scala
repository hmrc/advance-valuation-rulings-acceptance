package uk.gov.hmrc.test.ui.pages

import uk.gov.hmrc.test.ui.pages.base.BasePage

case object EnterCommidityCodePage extends BasePage {
  val url = s"${BasePage.baseUrl}/advance-valuation-ruling/commodityCode"

  val pageTitle = "What is the commodity code for the goods? - Advance Ruling Service - GOV.UK"
}
