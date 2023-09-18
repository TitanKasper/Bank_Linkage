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

/////Need To Update//////////

Mobile.startApplication('C:\\Users\\USER\\Desktop\\Bank_Linkage\\Subscriber\\app-uat-armeabi-v7a-release.apk', false)

Mobile.delay(80)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Login/android.view.View'), 0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText'), '1', 0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText (1)'), '2', 0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText (2)'), '1', 0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText (3)'), '2', 0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText (4)'), '1', 0)

Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText (5)'), '2', 0)

Mobile.delay(10)

////////////////

Mobile.tap(findTestObject('Object Repository/Link-Bank-Account/UserMenu'), 5)

Mobile.tap(findTestObject('Object Repository/Link-Bank-Account/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Link-Bank-Account/android.view.ViewGroup (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Link-Bank-Account/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Link-Bank-Account/android.view.ViewGroup (3)'), 0)

Mobile.setText(findTestObject('Object Repository/Link-Bank-Account/android.widget.EditText - xxxxxxxxxxxx'), '210027514335', 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Link-Bank-Account/android.widget.EditText - LAI YEE MAUNG'), 
    'LAI YEE MAUNG')

Mobile.verifyElementText(findTestObject('Object Repository/Link-Bank-Account/android.widget.EditText - 12ThaGaKa(N)193752'), 
    '12/ThaGaKa(N)193752')

Mobile.verifyElementText(findTestObject('Object Repository/Link-Bank-Account/android.widget.EditText - 06151994'), '06/15/1994')

Mobile.verifyElementText(findTestObject('Object Repository/Link-Bank-Account/android.widget.EditText - Female'), 'Female')

Mobile.tap(findTestObject('Object Repository/Link-Bank-Account/android.view.View'), 0)

for (int i = 0; i <= 3; i++) {

Mobile.tap(findTestObject('Object Repository/Link-Bank-Account/android.view.ViewGroup (4)'), 0)

}

Mobile.verifyElementText(findTestObject('Object Repository/Link-Bank-Account/android.widget.TextView - Bank Linkage Successful'), 
    'Bank Linkage Successful')

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.verifyElementText(findTestObject('Object Repository/Link-Bank-Account/android.widget.TextView - LAI YEE MAUNG'), 
    'LAI YEE MAUNG')

Mobile.delay(5)

Mobile.closeApplication()

