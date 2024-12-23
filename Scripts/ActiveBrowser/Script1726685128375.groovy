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

WebUI.callTestCase(findTestCase('TC02'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Surgical Video/div_arrow_rightfolder_copy My procedures'))

WebUI.click(findTestObject('Object Repository/Page_Surgical Video/button_create_new_folder Create Procedure'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Surgical Video/h3_Create Procedure'), 'Create Procedure')

WebUI.setText(findTestObject('Page_Surgical Video/input_Email_sharedInput'), 'meghatest')

WebUI.click(findTestObject('Object Repository/Page_Surgical Video/div_Cholecystectomy'))

WebUI.setText(findTestObject('Object Repository/Page_Surgical Video/textarea_(Optional)_procedureDescription'), 'test')

WebUI.click(findTestObject('Object Repository/Page_Surgical Video/form_Name Procedure Type  Cholecystectomy c_1d873a'))

WebUI.click(findTestObject('Object Repository/Page_Surgical Video/mat-icon_arrow_drop_down'))

WebUI.click(findTestObject('Object Repository/Page_Surgical Video/div_donePrivate'))

WebUI.click(findTestObject('Object Repository/Page_Surgical Video/button_Create'))

WebUI.click(findTestObject('Object Repository/Page_Surgical Video/div_Upload Status_ng-native-scrollbar-hider_03e7e4'))

WebUI.click(findTestObject('Object Repository/Page_Surgical Video/span_meghatest'))

WebUI.click(findTestObject('Object Repository/Page_Surgical Video/mat-icon_more_horiz'))

WebUI.click(findTestObject('Object Repository/Page_Surgical Video/p_Delete Procedure'))

WebUI.click(findTestObject('Object Repository/Page_Surgical Video/button_Yes, delete'))

WebUI.click(findTestObject('Object Repository/Page_Surgical Video/div_ee'))

WebUI.click(findTestObject('Object Repository/Page_Surgical Video/p_Log Out'))

WebUI.click(findTestObject('Object Repository/Page_Surgical Video/button_Confirm'))

WebUI.closeBrowser()

