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

WebUI.navigateToUrl('http://automationpractice.com/index.php')

WebUI.click(findTestObject('Login Section/a_Sign in'))

WebUI.setText(findTestObject('Page_Login - My Store/Login Section/input_Email address_create'), 'evgenych751@gmail.com')

WebUI.click(findTestObject('Page_Login - My Store/Registration Section/button_Create an account'))

WebUI.click(findTestObject('Registration Page/Personal Info Section/Radio_Gender_Mr_id_gender'))

WebUI.setText(findTestObject('Registration Page/Personal Info Section/input_Firstname'), 'Evgeny')

WebUI.setText(findTestObject('Registration Page/Personal Info Section/input_Lastname'), 'Chernyak')

WebUI.setEncryptedText(findTestObject('Page_Login - My Store/Login Section/input__passwd'), 'i/dXg6mUwgfBI/2RopaY2A==')

WebUI.click(findTestObject('Registration Page/Address Section/input__firstname'))

WebUI.setText(findTestObject('Registration Page/Address Section/Addres_line 1'), '77 Main street')

WebUI.setText(findTestObject('Registration Page/Address Section/input__city'), 'Melbourne')

WebUI.selectOptionByValue(findTestObject('Registration Page/Address Section/select_State'), 
    '8', true)

WebUI.setText(findTestObject('Registration Page/Address Section/input__postcode'), '30765')

WebUI.setText(findTestObject('Registration Page/Personal Info Section/input__phone_mobile'), '0435651284')

WebUI.click(findTestObject('Registration Page/Personal Info Section/Radio_Gender_Mrs_id_gender'))

WebUI.selectOptionByValue(findTestObject('Registration Page/Personal Info Section/Select_DOBYear'), 
    '26', true)

WebUI.selectOptionByValue(findTestObject('Registration Page/Personal Info Section/select_DOBMonth'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Registration Page/Personal Info Section/select_DOBDay'), 
    '1979', true)

WebUI.click(findTestObject('Registration Page/div_AuthenticationCreate an accountYour per_78050e'))

WebUI.setText(findTestObject('Page_Login - My Store/Login Section/input__Email address'), 'evgenych751@gmail.com')

WebUI.setText(findTestObject('Registration Page/Address Section/input__alias'), 'My address 2')

WebUI.click(findTestObject('Registration Page/Check_Partner_special_offer'))

WebUI.click(findTestObject('Registration Page/Personal Info Section/Register_Button'))

WebUI.closeBrowser()

