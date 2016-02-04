//import sbt.Keys._
//import sbt._
//
//object  ApplicationBuild extends Build {
//
//  lazy val root = Project(appName, file("."), settings = Seq(
//    name := "hello",
//    resolvers ++= appResolvers,
//    libraryDependencies ++= appDependencies
//  ))
//  val appName = "SbtProject"
//  val appDependencies = Seq(
//    "org.testng" % "testng" % "6.9.10",
//    "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test",
//    "org.seleniumhq.selenium" % "selenium-chrome-driver" % "2.49.1",
//    "org.seleniumhq.selenium" % "selenium-leg-rc" % "2.49.1",
//    "org.seleniumhq.selenium" % "selenium-firefox-driver" % "2.49.1",
//    "org.seleniumhq.selenium" % "selenium-ie-driver" % "2.49.1",
//    "org.seleniumhq.selenium" % "selenium-java" % "2.49.1",
//    "org.seleniumhq.selenium" % "selenium-support" % "2.49.1",
//    "com.saucelabs" % "saucerest" % "1.0.28" % "test",
//    "com.codeborne" % "phantomjsdriver" % "1.2.1",
//    "joda-time" % "joda-time" % "2.9.1",
//    "io.appium" % "java-client" % "2.2.0",
//    "org.slf4j" % "slf4j-api" % "1.7.14",
//    "org.slf4j" % "slf4j-log4j12" % "1.7.14",
//    "com.google.code.findbugs" % "jsr305" % "3.0.1",
//    "org.apache.directory.studio" % "org.apache.commons.io" % "2.4",
//    "com.fasterxml.jackson.core" % "jackson-databind" % "2.5.2",
//    "com.fasterxml.jackson.core" % "jackson-core" % "2.5.2",
//    "org.codehaus.jackson" % "jackson-mapper-asl" % "1.9.13",
//    "org.codehaus.jackson" % "jackson-core-asl" % "1.9.13",
//    "com.google.guava" % "guava" % "19.0"
//  )
//  val appResolvers = Seq(
//    "SauceLabs - releases" at "http://repository-saucelabs.forge.cloudbees.com/release",
//    "Apache - releases" at "http://repo1.maven.org/maven2/",
//    "jBCrypt Repository - releases" at "http://repo1.maven.org/maven2/org/",
//
//    Resolver.url("Objectify Play - releases", url("http://schaloner.github.com/releases/"))(Resolver.ivyStylePatterns)
//  )
//  val buildSettings = Seq(
//    javaOptions += "-Xmx2G"
//  )
//
//}
