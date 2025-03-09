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

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/span_MHEWS Map_iconify i-heroiconschevron-d_69a333'))

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_Tsunami Hazard Information'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//lihatdetailtsunami1.jpg')

WebUI.setText(findTestObject('Object Repository/irsyad/tsunami/input_Multi Hazard Early Warning System_email'), 'admin@example.com')

WebUI.setEncryptedText(findTestObject('Object Repository/irsyad/tsunami/input_Multi Hazard Early Warning System_password'), 
    '76urUe1T5hacINtx1jFsbA==')

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//lihatdetailtsunami2.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_Sign In'))

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/div_Warning Tsunami PD-4 Peringatan Tsunami_e09de8'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//lihatdetailtsunami3.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/div_270 km Tenggara PACITAN-JAWA TIMUR Peri_078255'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//lihatdetailtsunami4.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_Dashboard MHEWS'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//lihatdetailtsunami5.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_Close Warning Details'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//lihatdetailtsunami6.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/div_Warning Tsunami PD-4Tsunami Warning PD-_fe1870'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//lihatdetailtsunami7.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_Close Warning Details'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//lihatdetailtsunami8.jpg')

