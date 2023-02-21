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

import org.scalatestplus.selenium.Edge.submit

object DoYouWantThisFileToBeMarkAsConfidential extends BasePage {

  val pageTitle = "Upload supporting documents for the goods - Advance Ruling Service - GOV.UK"
  val radioYes = "input#disableUndertakingConfirm"
  val radioNo = "input#disableUndertakingConfirm-2"

  def loadPage: this.type = {
    onPage(this.pageTitle)
    this
  }


//  def clickYesToConfirm(areYouSureToConfirm: Boolean = true): Unit = {
//    if (areYouSureToConfirm) {
//      clickByCss(radioYes)
//    }
//    else {
//      clickByCss(radioNo)
//    }
//    submit()
//  }

}
