import sbt.Keys._

name := "SbtProject"

version := "1.0"

scalaVersion := "2.11.7"

val seleniumVersion = "2.49.1"
val jacksonVersion = "1.9.13"
val fasterxmlVersion = "2.5.2"

libraryDependencies ++= Seq(

  "org.testng" % "testng" % "6.9.10",
  "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test",
  "org.seleniumhq.selenium" % "selenium-chrome-driver" % seleniumVersion,
  "org.seleniumhq.selenium" % "selenium-leg-rc" % seleniumVersion,
  "org.seleniumhq.selenium" % "selenium-firefox-driver" % seleniumVersion,
  "org.seleniumhq.selenium" % "selenium-ie-driver" % seleniumVersion,
  "org.seleniumhq.selenium" % "selenium-java" % seleniumVersion,
  "org.seleniumhq.selenium" % "selenium-support" % seleniumVersion,
  "com.saucelabs" % "saucerest" % "1.0.28" % "test",
  "com.codeborne" % "phantomjsdriver" % "1.2.1",
  "joda-time" % "joda-time" % "2.9.1",
  "io.appium" % "java-client" % "2.2.0",
  "org.slf4j" % "slf4j-api" % "1.7.14",
  "org.slf4j" % "slf4j-log4j12" % "1.7.14",
  "com.google.code.findbugs" % "jsr305" % "3.0.1",
  "org.apache.directory.studio" % "org.apache.commons.io" % "2.4",
  "com.fasterxml.jackson.core" % "jackson-databind" % fasterxmlVersion,
  "com.fasterxml.jackson.core" % "jackson-core" % fasterxmlVersion,
  "org.codehaus.jackson" % "jackson-mapper-asl" % jacksonVersion,
  "org.codehaus.jackson" % "jackson-core-asl" % jacksonVersion,
  "com.google.guava" % "guava" % "19.0"
)

