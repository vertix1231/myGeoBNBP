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

WebUI.click(findTestObject('Object Repository/San/MH/button_MHEWS Map'))

WebUI.click(findTestObject('Object Repository/San/MH/button_Multi Hazard Information'))

WebUI.setText(findTestObject('Object Repository/San/MH/input_Multi Hazard Early Warning System_email'), 'admin@example.com')

WebUI.setEncryptedText(findTestObject('Object Repository/San/MH/input_Multi Hazard Early Warning System_password'), '76urUe1T5hacINtx1jFsbA==')

WebUI.click(findTestObject('Object Repository/San/MH/button_Sign In'))

Thread.sleep(5000)

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/map1.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/div_Warning Tsunami PD-4 Peringatan Tsunami_130ce7'))

Thread.sleep(5000)

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/map2.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/span_Back'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/map3.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/span_Share Map_iconify i-mimenu text-lg tex_a5e43c'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/map4.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/button_Tsunami'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/map5.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/button_Back'))

WebUI.click(findTestObject('Object Repository/San/MH/button_Tsunami Hazard Information'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/map6.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/li_Flood Hazard Information'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/map7.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/button_Back_1_2'))

WebUI.click(findTestObject('Object Repository/San/MH/button_Flood Hazard Information'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/map8.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/li_Multi Hazard Information'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/map9.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/button_Back_1'))

WebUI.closeBrowser()

