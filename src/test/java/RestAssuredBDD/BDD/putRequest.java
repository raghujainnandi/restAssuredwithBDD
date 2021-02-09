package RestAssuredBDD.BDD;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import utilclasses.Posts;
import static io.restassured.RestAssured.*;


public class putRequest {
	
	         //PUT  post by id                uri path:  /posts/1
			@Test
			public void editPostwithId()
			{
				Posts posts = new Posts();
				posts.setId("4");
				posts.setAuthor("updated Post by Patch");
				posts.setTitle("Raghu");
				
			   given().
				when().
				contentType(ContentType.JSON).
				body(posts).
				put("http://localhost:3000/posts/4")
				.then()
				.statusCode(200)
				.log().all();
			  }
}
