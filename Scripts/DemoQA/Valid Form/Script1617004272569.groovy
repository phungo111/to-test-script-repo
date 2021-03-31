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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

KeywordUtil.logInfo('User ID: ' + id)

KeywordUtil.logInfo("Params: Names: " + firstName + " "+ lastName + " - Email: " + email + " - Gender: " + gender 
	+ " - Phone number: " + userNumber)

WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')

WebUI.waitForElementVisible(findTestObject("DemoQA/form")
	, GlobalVariable.DEFAULT_TIMEOUT)

WebUI.setText(findTestObject('DemoQA/txt_First Name'), firstName)

WebUI.setText(findTestObject('DemoQA/txt_Last Name'), lastName)

WebUI.setText(findTestObject('DemoQA/txt_Email'), email)

CustomKeywords.'qademo.Methods.selectGender'(gender)

WebUI.setText(findTestObject('DemoQA/txt_number'), userNumber)

WebUI.click(findTestObject('DemoQA/txt_DoB'))

WebUI.click(findTestObject('DemoQA/div_Day 10'))

WebUI.scrollToElement(findTestObject('DemoQA/btn_Submit'), GlobalVariable.DEFAULT_TIMEOUT)

WebUI.click(findTestObject('DemoQA/btn_Submit'))

List<String> inputs = [firstName + " " + lastName, email, gender, userNumber]

Thread.sleep(300)

CustomKeywords.'qademo.Methods.verifyTable'(inputs)

