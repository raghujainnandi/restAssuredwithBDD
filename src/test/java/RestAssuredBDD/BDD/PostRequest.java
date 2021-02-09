package RestAssuredBDD.BDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


import utilclasses.Posts;



public class PostRequest {
	
	         //POST a record uri path: /posts
			@Test
			public void postRecord(){

				Posts posts = new Posts();
				posts.setId("4");
				posts.setTitle("posts request");
				posts.setAuthor("Raghav");

				       given().
					   when().
					   contentType(ContentType.JSON).
					   body(posts)
					   .post("http://localhost:3000/posts")
				       .then()
				       .statusCode(201)
				       .log().all();
				       
				       


			




			}

}
