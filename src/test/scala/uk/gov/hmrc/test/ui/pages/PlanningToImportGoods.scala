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

object PlanningToImportGoods extends BasePage {

  val pageTile       =
    "To use this service, you must intend to bring goods into Great Britain - Advance Ruling Service - GOV.UK"
  val error_PageTile =
    "Error: To use this service, you must intend to bring goods into Great Britain - Advance Ruling Service - GOV.UK"

  def loadPage: this.type       = {
    onPage(this.pageTile)
    this
  }
  def error_LoadPage: this.type = {
    onPage(this.error_PageTile)
    this
  }
}
