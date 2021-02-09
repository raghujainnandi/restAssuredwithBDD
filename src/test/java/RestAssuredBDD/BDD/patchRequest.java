package RestAssuredBDD.BDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
 	

public class patchRequest {
	        //PATCH  /posts/1
			@Test
			public void patch()
			{
				given().
				body("{ \"title\":\"updated by PUT request\" }").
				when().
				contentType(ContentType.JSON).
				patch("http://localhost:3000/posts/4")
				.then()
				.statusCode(200)
				.log().all();
			}
}
