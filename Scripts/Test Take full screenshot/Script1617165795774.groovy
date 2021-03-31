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

WebUI.openBrowser("https://analytics.katalon.com/login")

WebUI.setText(findTestObject("Take Screenshot/TestOps Login/input_username"), "phu.ngo@katalon.com")

WebUI.setText(findTestObject("Take Screenshot/TestOps Login/input_password"), "Abcd@1234")

WebUI.click(findTestObject("Take Screenshot/TestOps Login/btn_submit"))

WebUI.waitForElementVisible(findTestObject("Object Repository/Take Screenshot/TestOps/TestOps Icon"), GlobalVariable.DEFAULT_TIMEOUT)

WebUI.navigateToUrl("https://analytics.katalon.com/team/104750/project/119966/grid/plan")

WebUI.waitForElementVisible(findTestObject("Take Screenshot/TestOps/main"), GlobalVariable.DEFAULT_TIMEOUT)

WebUI.takeFullPageScreenshot('/Users/phuhuyngo/Desktop/Test.png')

