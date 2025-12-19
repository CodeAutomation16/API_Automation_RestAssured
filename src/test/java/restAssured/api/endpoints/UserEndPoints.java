package restAssured.api.endpoints;

import static io.restassured.RestAssured.*;
import io.restassured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import restAssured.api.payload.User;

public class UserEndPoints {

	public static Response createUser(User payload) {

		Response response = given().header("x-api-key", "f3f96a4e-c52d-4029-b5bf-23fba7eb9895")
				.contentType(ContentType.JSON).accept(ContentType.JSON).body(payload).when()
				.post(routes.post_url);
		return response;

	}

	public static Response getUser(String username) {

		Response response = given().log().uri().pathParam("username", username).when().get(routes.get_url);
		return response;

	}

	public static Response updateUser(String username, User payload) {

		Response response = given().contentType(ContentType.JSON).accept(ContentType.JSON).body(payload)
				.pathParam("username", username).when().put(routes.put_url);
		return response;

	}

	public static Response deleteUser(String username) {

		Response response = given().pathParam("username", username).when().delete(routes.delete_url);
		return response;

	}

}
