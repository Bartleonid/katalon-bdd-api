package issues
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import internal.GlobalVariable

class IssueSteps {

	@When('^I make a GET request')
	def get_google() {
		GlobalVariable.latest_response = WS.callTestCase(findTestCase('Add Phone/GET Google Test'), [:], FailureHandling.STOP_ON_FAILURE);
	}

	@Then('^I get response code "(.*)"$')
	def assert_code(String code) {
		WS.verifyResponseStatusCode(GlobalVariable.latest_response, code as Integer)
	}
}
