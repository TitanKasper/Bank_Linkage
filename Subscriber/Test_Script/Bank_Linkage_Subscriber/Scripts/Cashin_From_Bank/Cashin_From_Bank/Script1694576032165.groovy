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

////////Need to update//////////////

Mobile.startApplication('C:\\Users\\USER\\Desktop\\Bank_Linkage\\Subscriber\\app-uat-armeabi-v7a-release.apk', false)

Mobile.tap(findTestObject('Object Repository/Cashin_From_Bank/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Cashin_From_Bank/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Cashin_From_Bank/android.view.ViewGroup (2)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Cashin_From_Bank/android.widget.TextView - Cash In by Bank Account'), 
    'Cash In by Bank Account')

Mobile.verifyElementText(findTestObject('Object Repository/Cashin_From_Bank/android.widget.TextView - LAI YEE MAUNG'), 'LAI YEE MAUNG')

Mobile.tap(findTestObject('Object Repository/Cashin_From_Bank/android.view.ViewGroup (3)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Cashin_From_Bank/android.widget.EditText - 10,000'), '10,000')

Mobile.tap(findTestObject('Object Repository/Cashin_From_Bank/android.view.View'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Cashin_From_Bank/android.widget.TextView - LAI YEE MAUNG (1)'), 
    'LAI YEE MAUNG')

Mobile.verifyElementText(findTestObject('Object Repository/Cashin_From_Bank/android.widget.TextView - 10,000.00 MMK'), '10,000.00 MMK')

Mobile.verifyElementText(findTestObject('Object Repository/Cashin_From_Bank/android.widget.TextView - 0.00 MMK'), '0.00 MMK')

Mobile.verifyElementText(findTestObject('Object Repository/Cashin_From_Bank/android.widget.TextView - 10,000.00 MMK (1)'), 
    '10,000.00 MMK')

Mobile.tap(findTestObject('Object Repository/Cashin_From_Bank/android.view.View (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Cashin_From_Bank/android.view.ViewGroup (4)'), 0)

Mobile.closeApplication()

