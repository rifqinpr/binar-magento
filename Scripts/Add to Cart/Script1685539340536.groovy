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

WebUI.click(findTestObject('Object Repository/Add to Cart/Page_Home Page/div_M'))

WebUI.click(findTestObject('Object Repository/Add to Cart/Page_Home Page/div_XL_option-label-color-93-item-57'))

WebUI.click(findTestObject('Object Repository/Add to Cart/Page_Home Page/button_Add to Cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Add to Cart/Page_Home Page/div_You added Radiant Tee to your shopping cart'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Add to Cart/Page_Home Page/div_You added Radiant Tee to your shopping cart'), 
    'You added Radiant Tee to your shopping cart.')

WebUI.click(findTestObject('Object Repository/Add to Cart/Page_Home Page/a_My Cart11items'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Add to Cart/Page_Home Page/a_Radiant Tee'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Add to Cart/Page_Home Page/a_Radiant Tee'), 'Radiant Tee')

