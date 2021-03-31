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

Mobile.startApplication('kobiton-store:172098', true)

Mobile.tap(findTestObject('Mobile/API Demos/Text - v4'), 0)

Mobile.tap(findTestObject('Mobile/API Demos/Text - Content'), 0)

Mobile.tap(findTestObject('Mobile/API Demos/Text - Search'), 0)

Mobile.tap(findTestObject('Mobile/API Demos/Text - Print HTML'), 0)

String year = Mobile.getText(findTestObject('Mobile/API Demos/Text - 2012'), 0)

String name = Mobile.getText(findTestObject('Mobile/API Demos/Text Jorge'), 0)

String brand = Mobile.getText(findTestObject('Mobile/API Demos/Text - Yamaha'), 0)

Mobile.verifyMatch(year, '2012', false)

Mobile.verifyMatch(name, 'Jorge Lorenzo', false)

Mobile.verifyMatch(brand, 'Yamaha', false)

Mobile.closeApplication()

