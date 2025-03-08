import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.takeScreenshot('C://Users//USER//Desktop//braga bnbp//evidence//'+GlobalVariable.landing+'//1.jpg')

//WebUI.scrollToElement(findTestObject('landing0/button_Latest Alerts'), 10000)
WebUI.click(findTestObject('Object Repository/landing0/button_Latest Alerts'))

WebUI.takeScreenshot('C://Users//USER//Desktop//braga bnbp//evidence//'+GlobalVariable.landing+'//2.jpg')

WebUI.setText(findTestObject('Object Repository/landing0/input_Multi Hazard Early Warning System Map_email'), GlobalVariable.username)

WebUI.setEncryptedText(findTestObject('Object Repository/landing0/input_Multi Hazard Early Warning System Map_2d5bf2'), 
    '76urUe1T5hacINtx1jFsbA==')

WebUI.click(findTestObject('Object Repository/landing0/button_Sign In'))

WebUI.takeScreenshot('C://Users//USER//Desktop//braga bnbp//evidence//'+GlobalVariable.landing+'//3.jpg')

WebUI.click(findTestObject('Object Repository/login/button_Back'))

WebUI.takeScreenshot('C://Users//USER//Desktop//braga bnbp//evidence//'+GlobalVariable.landing+'//4.jpg')

