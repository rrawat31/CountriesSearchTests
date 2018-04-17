package test;

import io.restassured.RestAssured;
import org.junit.Test;
import org.junit.runner.RunWith;
import net.serenitybdd.junit.runners.SerenityRunner;

import static org.hamcrest.Matchers.is;

@RunWith(SerenityRunner.class)

public class CountriesSearchTests {

	
	@Test
	public void verifyThatWeCanFindUnitedStatesOfAmericaUsingTheCodeUS(){
		RestAssured.
		when().get("http://services.groupkt.com/country/get/iso2code/US").
		then().assertThat().statusCode(200).
		and().body("RestResponse.result.name", is("United States of America"));
	}

	@Test
	public void verifyThatWeCanFindIndiaCountryUsingTheCodeIN(){
		RestAssured.
		when().get("http://services.groupkt.com/country/get/iso2code/IN").
		then().assertThat().statusCode(200).
		and().body("RestResponse.result.name", is("India"));
	}

	@Test
	public void verifyThatWeCanFindBrazilCountryUsingTheCodeBR(){
		RestAssured.
		when().get("http://services.groupkt.com/country/get/iso2code/BR").
		then().assertThat().statusCode(200).
		and().body("RestResponse.result.name", is("Brazil-Incorrect"));
	}
	@Test
	public void verifyThatWeCanFindUnitedStatesOfAmericaUsingTheCodeUS1(){
		RestAssured.
		when().get("http://services.groupkt.com/country/get/iso2code/US").
		then().assertThat().statusCode(200).
		and().body("RestResponse.result.name", is("United States of America"));
	}

	@Test
	public void verifyThatWeCanFindIndiaCountryUsingTheCodeIN1(){
		RestAssured.
		when().get("http://services.groupkt.com/country/get/iso2code/IN").
		then().assertThat().statusCode(200).
		and().body("RestResponse.result.name", is("India"));
	}

	@Test
	public void verifyThatWeCanFindBrazilCountryUsingTheCodeBR1(){
		RestAssured.
		when().get("http://services.groupkt.com/country/get/iso2code/BR").
		then().assertThat().statusCode(200).
		and().body("RestResponse.result.name", is("Brazil"));
	}


}
