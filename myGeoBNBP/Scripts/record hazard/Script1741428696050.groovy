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

WebUI.click(findTestObject('Object Repository/hazard/button_MHEWS Map'))

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence' + GlobalVariable.hazard) + '//hazard1.jpg')

WebUI.click(findTestObject('Object Repository/hazard/button_Multi Hazard Information'))

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence' + GlobalVariable.hazard) + '//hazard2.jpg')

WebUI.setText(findTestObject('Object Repository/hazard/input_Multi Hazard Early Warning System_email'), 'admin@example.com')

WebUI.setEncryptedText(findTestObject('Object Repository/hazard/input_Multi Hazard Early Warning System_password'), '76urUe1T5hacINtx1jFsbA==')

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence' + GlobalVariable.hazard) + '//hazard3.jpg')

WebUI.click(findTestObject('Object Repository/hazard/button_Sign In'))

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence' + GlobalVariable.hazard) + '//hazard4.jpg')

Thread.sleep(10000)

WebUI.click(findTestObject('Object Repository/hazard/button_Back'))

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence' + GlobalVariable.hazard) + '//hazard5.jpg')

WebUI.click(findTestObject('Object Repository/hazard/button_More Detail_bg-transparent hoverbg-w_8a6e27'))

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence' + GlobalVariable.hazard) + '//hazard6.jpg')

WebUI.click(findTestObject('Object Repository/hazard/button_More Detail_bg-transparent hoverbg-w_8a6e27_1'))

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence' + GlobalVariable.hazard) + '//hazard7.jpg')

WebUI.click(findTestObject('Object Repository/hazard/button_More Detail_bg-transparent hoverbg-w_8a6e27_1_2'))

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence' + GlobalVariable.hazard) + '//hazard8.jpg')

WebUI.click(findTestObject('Object Repository/hazard/button_More Detail_bg-transparent hoverbg-w_8a6e27_1_2_3'))

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence' + GlobalVariable.hazard) + '//hazard9.jpg')

