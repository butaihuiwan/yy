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

WebUI.openBrowser(GlobalVariable.T_url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Person/HomePage/Login/clickperosn'))

WebUI.switchToWindowUrl(GlobalVariable.TP_swith_url)

WebUI.sendKeys(findTestObject('Person/HomePage/Login/username'), username)

WebUI.sendKeys(findTestObject('Person/HomePage/Login/pwd'), password)

WebUI.click(findTestObject('Person/HomePage/Login/loginbutton'))

WebUI.mouseOver(findTestObject('Person/HomePage/Login/checkelement'))

get_url = WebUI.getUrl()

if (get_url == GlobalVariable.TP_check_login_url) {
} else {
    WebUI.acceptAlert()
}

WebUI.click(findTestObject('Person/MyAccount/ModifyPhoneNum/Myinfo'))

WebUI.click(findTestObject('Person/MyAccount/ModifyPhoneNum/MidifyButton'))

WebUI.sendKeys(findTestObject('Person/MyAccount/ModifyPhoneNum/NumInput'), numinput)

WebUI.sendKeys(findTestObject('Person/MyAccount/ModifyPhoneNum/ImageCodeInput'), imgnum)

WebUI.sendKeys(findTestObject('Person/MyAccount/ModifyPhoneNum/MessageCodeInput'), mesinput)

WebUI.click(findTestObject('Person/MyAccount/ModifyPhoneNum/YesButton'))

value = WebUI.getText(findTestObject('Person/MyAccount/MyBounsQuery/Data'))

