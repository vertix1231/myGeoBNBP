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

Thread.sleep(10000)

WebUI.click(findTestObject('Object Repository/San/MH/button_Back'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/layer1.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/svg_More Detail_nuxt-icon--fill w-5 h-5')) 

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/layer2.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/svg_More Detail_nuxt-icon--fill w-5 h-5')) 

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/layer3.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/button_More Detail_focusoutline-none disabl_3c6454'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/layer4.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/svg_Others_nuxt-icon--fill w-4 h-4 text-gre_25f210'))

WebUI.click(findTestObject('Object Repository/San/MH/svg_Others_nuxt-icon--fill w-3 h-3 text-gre_8941d1'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/layer5.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/button_Zoom To Fit'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/layer6.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/svg_BNPB_nuxt-icon--fill w-4 h-4 text-grey-_e32480'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/laye61.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/svg_BNPB_nuxt-icon--fill w-3 h-3'))

WebUI.click(findTestObject('Object Repository/San/MH/svg_BNPB_nuxt-icon--fill w-3 h-3 text-grey-_1abfbc'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/layer7.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/button_Delete Layer'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/layer8.jpg')

WebUI.closeBrowser()

