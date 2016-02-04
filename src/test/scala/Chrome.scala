import org.scalatest.testng.TestNGWrapperSuite

class Chrome extends TestNGWrapperSuite(
  List("src/test/resources/xml/testng.xml", "src/test/resources/xml/sanity.xml")
)