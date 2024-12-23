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

WebUI.navigateToUrl('https://svp.sbs-stg.surgicalvideo.io/auth')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://svp.sbs-stg.surgicalvideo.io/auth')

WebUI.setText(findTestObject('Object Repository/Page_Surgical Video/Page_Surgical Video/input_Email_sharedInput'), 'svp2903@mailinator.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Surgical Video/Page_Surgical Video/input_Password_sharedInput'), 
    '7YYAPzqgNw77WVoSql9amg==')

WebUI.click(findTestObject('Object Repository/Page_Surgical Video/Page_Surgical Video/button_Sign In'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Surgical Video/Page_Surgical Video/p_My Procedures'), 'My Procedures')

WebUI.click(findTestObject('Object Repository/Page_Surgical Video/Page_Surgical Video/span_ETV mobile'))

WebUI.click(findTestObject('Object Repository/Page_Surgical Video/Page_Surgical Video/div_OT'))

WebUI.click(findTestObject('Object Repository/Page_Surgical Video/Page_Surgical Video/div_logoutLog Out'))

WebUI.click(findTestObject('Object Repository/Page_Surgical Video/Page_Surgical Video/button_Confirm'))

WebUI.closeBrowser()

