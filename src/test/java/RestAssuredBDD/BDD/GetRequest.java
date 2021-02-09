package RestAssuredBDD.BDD;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;
 	

public class GetRequest {
	
	

	        //GET all the posts     uri path :/posts
			//@Test
			public void getAllPosts()
			{
				                 given()
						        .when()
						        .get("http://localhost:3000/posts")
						        .then()
						        .statusCode(200)
						        .log().all();
		    }
			
			//GET a post by id    /posts/1
			@Test
			public void getPostById()
			{
				        given().
						when().
						get("http://localhost:3000/posts/4")
				        .then()
				        .statusCode(200)
				        .log().all();
			}

}
