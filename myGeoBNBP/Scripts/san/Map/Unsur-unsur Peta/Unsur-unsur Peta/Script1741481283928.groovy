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

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/up0.jpg')

WebUI.rightClick(findTestObject('Object Repository/San/MH/canvas_Share Map_maplibregl-canvas'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/up1.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/button_More Detail_bg-transparent hoverbg-w_8a6e27'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/up2.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/button_More Detail_bg-transparent hoverbg-w_8a6e27_1'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/up3.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/button_More Detail_bg-transparent hoverbg-w_8a6e27_1_2'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/up4.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/button_More Detail_bg-transparent hoverbg-w_8a6e27_1_2_3'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/up5.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/button_More Detail_headlessui-menu-button-v_aa1e3c'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/up6.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/button_Here'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/up7.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/button_More Detail_headlessui-menu-button-v_aa1e3c'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/up8.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/button_Maptiler Topo'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/up9.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/button_More Detail_headlessui-menu-button-v_aa1e3c'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/up10.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/button_Google Street'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/up11.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/svg_More Detail_nuxt-icon--fill w-5 h-5'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/up12.jpg')

WebUI.click(findTestObject('Object Repository/San/MH/button_Legend_focusoutline-none disabledcur_e9328f'))

WebUI.takeScreenshot(('/Users/fabhiantom/Downloads/myGeoBNBP/evidence/' + GlobalVariable.hazard) + '/up13.jpg')

WebUI.closeBrowser()