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
import org.openqa.selenium.interactions.Actions as Actions

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mhews.geodashboard.io/en')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_MHEWS Map'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami1.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_Tsunami Hazard Information'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami2.jpg')

WebUI.setText(findTestObject('Object Repository/irsyad/tsunami/input_Multi Hazard Early Warning System_email'), 'admin@example.com')

WebUI.setEncryptedText(findTestObject('Object Repository/irsyad/tsunami/input_Multi Hazard Early Warning System_password'), 
    '76urUe1T5hacINtx1jFsbA==')

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami3.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_Sign In'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami4.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/div_270 km Tenggara PACITAN-JAWA TIMUR Peri_078255'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami5.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_Dashboard MHEWS'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami6.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_Close Warning Details'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami7.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_Early Warning'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami8.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/li_Early Warning'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami9.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/div_Warning Tsunami PD-4Tsunami Warning PD-_fe1870'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami10.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_Dissemination'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami11.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_Batalkan'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami12.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_Close Warning Details'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami13.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/div_270 km Tenggara PACITAN-JAWA TIMURTsuna_327471'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami14.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_Dissemination'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami15.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_Batalkan'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami16.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_Virtual Pusdalops'))

Thread.sleep(5000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami17.jpg')

WebUI.closeWindowUrl('https://chat.geodashboard.io/landing#/braga-tech/channels/bnpb')

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_Dissemination'))

Thread.sleep(1000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami18.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_Kirim Pesan'))

Thread.sleep(3000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami19.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_Dissemination_focusoutline-none disa_e114b0'))

Thread.sleep(3000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami20.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_Copy'))

Thread.sleep(3000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami21.jpg')

WebUI.click(findTestObject('irsyad/tsunami/fbshare'))

WebUI.switchToWindowTitle('Facebook')

Thread.sleep(3000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami22.jpg')

WebUI.closeWindowTitle('Facebook')

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/div_WASPADA_cursor-pointer p-2 bg-white rou_1e5e37_1'))

WebUI.switchToWindowTitle('Share on WhatsApp')

Thread.sleep(3000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami23.jpg')

WebUI.closeWindowTitle('Share on WhatsApp')

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/div_WASPADA_cursor-pointer p-2 bg-white rou_004ba1'))

WebUI.switchToWindowTitle('X')

Thread.sleep(3000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami24.jpg')

WebUI.closeWindowTitle('X')

WebUI.switchToDefaultContent()

Thread.sleep(3000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami25.jpg')

WebUI.click(findTestObject('irsyad/tsunami/exitshare'))

//WebUI.click(findTestObject('irsyad/tsunami/emailshare'))
WebUI.switchToDefaultContent()

Thread.sleep(3000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami26.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/p_Areas Potentially Affected by Tsunami'))

Thread.sleep(3000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami27.jpg')

WebUI.scrollToElement(findTestObject('Object Repository/irsyad/tsunami/button_More Detail_border border-grey-200 r_99f1f3'), 
    10000)

Thread.sleep(3000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami28.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/button_More Detail_border border-grey-200 r_99f1f3'))

WebUI.setText(findTestObject('Object Repository/irsyad/tsunami/input_More Detail_flex-1 bg-grey-50 text-xs_459d6f'), 'pacitan')

Thread.sleep(3000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami29.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/input_More Detail_flex-1 bg-grey-50 text-xs_459d6f'))

WebUI.setText(findTestObject('Object Repository/irsyad/tsunami/input_More Detail_flex-1 bg-grey-50 text-xs_459d6f'), 'bali')

Thread.sleep(3000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami30.jpg')

WebUI.click(findTestObject('Object Repository/irsyad/tsunami/input_More Detail_flex-1 bg-grey-50 text-xs_459d6f'))

WebUI.setText(findTestObject('Object Repository/irsyad/tsunami/input_More Detail_flex-1 bg-grey-50 text-xs_459d6f'), '')

Thread.sleep(3000)

WebUI.takeScreenshot(('C://Users//USER//Desktop//braga bnbp//evidence//' + GlobalVariable.tsunami) + '//listdetailtsunami31.jpg')

