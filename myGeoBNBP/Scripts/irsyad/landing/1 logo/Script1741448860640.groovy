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

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_MHEWS Map'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.landing) + '//logo1.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_Tsunami Hazard Information'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.landing) + '//logo2.jpg')

WebUI.setText(findTestObject('Object Repository/irsyad/tsunami/input_Multi Hazard Early Warning System_email'), 'admin@example.com')

WebUI.setEncryptedText(findTestObject('Object Repository/irsyad/tsunami/input_Multi Hazard Early Warning System_password'), 
    '76urUe1T5hacINtx1jFsbA==')

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.landing) + '//logo3.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_Sign In'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.landing) + '//logo4.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_Back'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.landing) + '//logo5.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_More Detail_bg-transparent hoverbg-g_3acdfd'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.landing) + '//logo6.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_More Detail_bg-transparent hoverbg-g_3acdfd_1'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.landing) + '//logo7.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/img_MHEWS Map_h-9 max-w-32 smmax-w-56 objec_e7bcc4'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.landing) + '//logo8.jpg')

