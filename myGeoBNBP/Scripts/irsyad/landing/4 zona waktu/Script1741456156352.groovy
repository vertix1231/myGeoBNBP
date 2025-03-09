import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mhews.geodashboard.io/en')

WebUI.maximizeWindow()

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.landing) + '//zonawaktu1.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/landing/test/div_00.53 WIB'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.landing) + '//zonawaktu2.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/landing/test/div_17.53UTC'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.landing) + '//zonawaktu3.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/landing/test/div_17.53 UTC'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.landing) + '//zonawaktu4.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/landing/test/div_00.53WIB'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.landing) + '//zonawaktu5.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/landing/test/div_00.53 WIB'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.landing) + '//zonawaktu6.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/landing/test/div_01.53WITA'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.landing) + '//zonawaktu7.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/landing/test/div_01.53 WITA'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.landing) + '//zonawaktu8.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/landing/test/div_02.53WIT'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.landing) + '//zonawaktu9.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/landing/test/div_02.53 WIT'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.landing) + '//zonawaktu10.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/landing/test/div_00.53WIB'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.landing) + '//zonawaktu11.jpg')