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

WebUI.maximizeWindow()

WebUI.navigateToUrl('automationpractice.com')

'home page'
WebUI.click(findTestObject('Home Page/Page_Login - My Store/a_Sign in'))

'login page '
WebUI.setText(findTestObject('My account/New user registration/input_Email address_email_create'), 
    'hhhh@test.com')

WebUI.click(findTestObject('Page_Login - My Store/Page_Login - My Store/button_Create an account'))

'registration page'
WebUI.delay(3)

WebUI.check(findTestObject('Registration Page/Personal Info Section/radio_Gender_Dr_id_gender'))

WebUI.delay(3)

WebUI.check(findTestObject('Registration Page/Personal Info Section/Radio_Gender_Mrs_id_gender'))

WebUI.delay(1)

WebUI.check(findTestObject('Registration Page/Check_Partner_special_offer'))

WebUI.selectOptionByValue(findTestObject('Registration Page/Personal Info Section/select_DOBMonth'), '5', false)

'my account page'
WebUI.selectOptionByIndex(findTestObject('Registration Page/Personal Info Section/Select_DOBYear'), 4)

WebUI.delay(4)

WebUI.closeBrowser()

