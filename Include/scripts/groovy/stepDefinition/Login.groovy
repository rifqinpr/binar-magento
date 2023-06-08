package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class Login {
	@When("User click login text link")
	public void user_click_login_link() {
		WebUI.callTestCase(findTestCase('Pages/Login/Click Sign In'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User input email {string}")
	public void user_input_email(String email) {
		WebUI.callTestCase(findTestCase('Pages/Login/Input Email'), [('userMail') : email], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User input password {string}")
	public void user_input_password(String userPass) {
		WebUI.callTestCase(findTestCase('Pages/Login/Input Password'), [('userPass') : userPass], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User click Sign In button")
	public void user_click_signin_button() {
		WebUI.callTestCase(findTestCase('Pages/Login/Click Button Sign In'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("Verify User see Welcome Message")
	public void verify_user_see_welcome_message() {
		WebUI.callTestCase(findTestCase('Pages/Login/Verify After Login Content'), [('expectedText') : 'Welcome, Jamaludin Arkani!'],
			FailureHandling.STOP_ON_FAILURE)
	}
}