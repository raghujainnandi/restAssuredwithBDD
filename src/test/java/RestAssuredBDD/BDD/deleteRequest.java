package RestAssuredBDD.BDD;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class deleteRequest {
	
	        //DELETE /posts/1
			@Test
			public void deletePost(){
			   given().
				when().
				delete("http://localhost:3000/posts/4")
				.then()
				.statusCode(200);
			   }

}
