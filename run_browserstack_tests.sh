#!/usr/bin/env bash


sbt -Dbrowser=browserstack -Dlanguage=english -Denvironment=local -Dbrowserstack.username=lilotxnmonitorin_6nwDxY -Dbrowserstack.key=Bc9qsr5GYVAHgMvCoVBq -Dbrowserstack.browser_version="11" -Dbrowserstack.browser="IE" -Dbrowserstack.os="Windows" -Dbrowserstack.os_version="10" 'testOnly uk.gov.hmrc.test.ui.cucumber.runner.Runner'


