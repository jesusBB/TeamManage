package test.cases;

import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.jayway.restassured.response.Response;

import test.setup.RestAssuredSetup;
public class TeamTest extends RestAssuredSetup{
	 @Test
	    public void basicPingTest() {
	        given().when().get("/list").then().statusCode(200);
	    }
	 
	 @Test
	    public void testCadizTeam() {
	        Map<String,String> car = new HashMap<>();
	        car.put("name", "Cadiz C.F.");
	       

	        given()
	        .contentType("application/json")
	        .body(car)
	        .when().post("/get").then()
	        .body("city",equalTo("Cadiz"))
	        .body("competition.name",equalTo("La Liga 123") );
	    }
	 
	 @Test
	 public void testListTeams(){
		 given().when().get("/list").then().assertThat().body("size()", equalTo(2));
		 
		 given().when().get("/list").then().assertThat().body("name",hasItems("Real Madrid","Cadiz C.F."));
		 
	 }
}
