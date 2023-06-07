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

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/')

WebUI.click(findTestObject('Object Repository/OLD/Checkout/Page_Home Page/a_My Cart11items'))

WebUI.click(findTestObject('Object Repository/OLD/Checkout/Page_Home Page/button_Proceed to Checkout'))

WebUI.setText(findTestObject('Object Repository/OLD/Checkout/Page_Checkout/input_Street Address Line 1_street0'), 'Street Address')

WebUI.setText(findTestObject('Object Repository/OLD/Checkout/Page_Checkout/input_City_city'), 'City')

WebUI.selectOptionByValue(findTestObject('Object Repository/OLD/Checkout/Page_Checkout/select_Please select a region, state or pro_d80c8a'), 
    'Please select a region, state or province.', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/OLD/Checkout/Page_Checkout/select_Please select a region, state or pro_d80c8a'), 
    '63', true)

WebUI.setText(findTestObject('Object Repository/OLD/Checkout/Page_Checkout/input_ZipPostal Code_postcode'), '12345')

WebUI.setText(findTestObject('Object Repository/OLD/Checkout/Page_Checkout/input_Phone Number_telephone'), '12345678')

WebUI.click(findTestObject('Object Repository/OLD/Checkout/Page_Checkout/input_Carrier Title_ko_unique_7'))

WebUI.click(findTestObject('Object Repository/OLD/Checkout/Page_Checkout/button_Next'))

WebUI.click(findTestObject('Object Repository/OLD/Checkout/Page_Checkout/button_Place Order'))

WebUI.verifyElementPresent(findTestObject('Object Repository/OLD/Checkout/Page_Success Page/span_Thank you for your purchase'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/OLD/Checkout/Page_Success Page/span_Thank you for your purchase'), 
    'Thank you for your purchase!')

WebUI.verifyElementPresent(findTestObject('Object Repository/OLD/Checkout/Page_Success Page/p_Your order number is 000011368'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/OLD/Checkout/Page_Success Page/p_Well email you an order confirmation with_2423d5'), 
    'We\'ll email you an order confirmation with details and tracking info.')

