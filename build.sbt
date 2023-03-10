lazy val testSuite = (project in file("."))
  .disablePlugins(
    JUnitXmlReportPlugin
  ) // Required to prevent https://github.com/scalatest/scalatest/issues/1427
  .settings(
    name := "advance-valuation-rulings-acceptance",
    version := "0.1.0",
    scalaVersion := "2.12.12",
    scalacOptions ++= Seq("-feature"),
    scalafmtOnCompile := true,
    libraryDependencies ++= Dependencies.test,
    // The testOptions from SbtAutoBuildPlugin supports only ScalaTest. Resetting testOptions for Cucumber Tests.
    Test / testOptions := Seq.empty
  )
