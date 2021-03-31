
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.ResponseObject

import java.util.List

import java.lang.Boolean

import com.applitools.eyes.selenium.Eyes

import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.TestObject

import java.lang.String

import com.applitools.eyes.RectangleSize



def static "api.Methods.toJson"(
    	ResponseObject ro	) {
    (new api.Methods()).toJson(
        	ro)
}


def static "api.Methods.verifyJsonProperties"(
    	ResponseObject ro	
     , 	java.util.List<String> propertiesList	) {
    (new api.Methods()).verifyJsonProperties(
        	ro
         , 	propertiesList)
}


def static "general.Methods.greetings"(
    	int hour	) {
    (new general.Methods()).greetings(
        	hour)
}


def static "general.Methods.waitUntilCondition"(
    	Boolean condition	) {
    (new general.Methods()).waitUntilCondition(
        	condition)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkElement"(
    	Eyes eyes	
     , 	WebElement element	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkElement(
        	eyes
         , 	element)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkTestObject"(
    	TestObject testObject	
     , 	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkTestObject(
        	testObject
         , 	testName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow"(
    	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkWindow(
        	testName)
}


def static "login.Methods.verifyBlankTooltip"(
    	String username	
     , 	String password	) {
    (new login.Methods()).verifyBlankTooltip(
        	username
         , 	password)
}


def static "qademo.Methods.selectGender"(
    	String gender	) {
    (new qademo.Methods()).selectGender(
        	gender)
}


def static "qademo.Methods.verifyTable"(
    	java.util.List<String> actualInputs	) {
    (new qademo.Methods()).verifyTable(
        	actualInputs)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesInit"() {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesInit()
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpen"(
    	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpen(
        	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpenWithBaseline"(
    	String baselineName	
     , 	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpenWithBaseline(
        	baselineName
         , 	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesClose"(
    	Eyes eyes	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesClose(
        	eyes)
}
