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

WebUI.click(findTestObject('Object Repository/Akun/Bank/Page_Evermos - Katalog/span'))

WebUI.scrollToElement(findTestObject('Akun/a_Nomor Rekening Terdaftar'), 10)

WebUI.click(findTestObject('Object Repository/Akun/a_Nomor Rekening Terdaftar'))

WebUI.click(findTestObject('Akun/Page_Akun Bank Saya/Dropdown_Action'))

WebUI.click(findTestObject('Akun/Page_Akun Bank Saya/a_Edit'))

WebUI.click(findTestObject('Akun/Page_Akun Bank Saya/Dropdown_Bank_Edit'))

WebUI.click(findTestObject('Akun/Page_Evermos/span_BANK Mandiri'))

WebUI.delay(3)

//WebUI.sendKeys(findTestObject('Akun/Page_Evermos/Edit_input_Nama Pemilik Rekening'), Keys.chord(Keys.CONTROL, 'a'))
//WebUI.delay(3)
//WebUI.sendKeys(findTestObject('Akun/Page_Evermos/Edit_input_Nama Pemilik Rekening'), Keys.chord(Keys.BACK_SPACE))
//WebUI.setText(findTestObject('Akun/Page_Evermos/Edit_input_Nama Pemilik Rekening'), 'Athalla Tsaqif Afsyus Salaam')
WebUI.click(findTestObject('Akun/Page_Evermos/button_Simpan_Perubahan'))

WebUI.verifyTextPresent('Anda akan mengubah data rekening anda ke rekening BANK MANDIRI 126572898798123 atas nama  Athalla Tsaqif ', 
    false)

WebUI.click(findTestObject('Object Repository/Akun/Page_Evermos/button_Ya, Benar'))

WebUI.click(findTestObject('Akun/Page_Akun Bank Saya/button_back_ubah_rekening'))

