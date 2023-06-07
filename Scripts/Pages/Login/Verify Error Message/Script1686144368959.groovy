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

if (userMail == '') {
    WebUI.verifyElementVisible(findTestObject('Page_Customer Login/div_Mail Error Msg'))
    WebUI.verifyElementText(findTestObject('Page_Customer Login/div_Mail Error Msg'), expectedMailErrMsg)
} else if (!(usermail.contains('@mytestmail.net'))) {
    WebUI.verifyElementVisible(findTestObject('Page_Customer Login/div_Mail Error Msg'))
    WebUI.verifyElementText(findTestObject('Page_Customer Login/div_Mail Error Msg'), expectedMailErrMsg)
}

if (userPass == '') {
    WebUI.verifyElementVisible(findTestObject('Page_Customer Login/div_Pass Error Msg'))
    WebUI.verifyElementText(findTestObject('Page_Customer Login/div_Pass Error Msg'), expectedPassErrMsg)
}

if (usermail != 'jamal@mytestmail.net' || userPass != 'a1b2.C3d4e5') {
    WebUI.verifyElementVisible(findTestObject('Page_Customer Login/div_Error Incorrect Message'))
}

