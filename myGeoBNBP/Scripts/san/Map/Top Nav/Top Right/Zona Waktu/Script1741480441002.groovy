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

WebUI.click(findTestObject('Object Repository/San/MH/span_MHEWS Map_iconify i-heroiconschevron-d_69a333'))

WebUI.click(findTestObject('Object Repository/San/MH/button_Multi Hazard Information'))

WebUI.setText(findTestObject('Object Repository/San/MH/input_Multi Hazard Early Warning System_email'), 'admin@example.com')

WebUI.setEncryptedText(findTestObject('Object Repository/San/MH/input_Multi Hazard Early Warning System_password'), '76urUe1T5hacINtx1jFsbA==')

WebUI.click(findTestObject('Object Repository/San/MH/button_Sign In'))

WebUI.click(findTestObject('Object Repository/San/MH/button_Back'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/jam0.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/div_13.20 WIB'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/jam1.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/div_06.21UTC'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/jam2.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/div_06.21 UTC'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/jam3.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/div_14.21WITA'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/jam4.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/div_14.21 WITA'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/jam5.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/div_15.21WIT'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/jam6.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/div_15.21 WIT'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/jam7.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/div_13.21WIB'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/jam8.jpg')

WebUI.closeBrowser()

