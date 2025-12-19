package restAssured.api.endpoints;

import static io.restassured.RestAssured.*;
import java.util.ResourceBundle;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import restAssured.api.payload.User;

public class UserEndPoints2 {

	static ResourceBundle getURL() {

		ResourceBundle routes = ResourceBundle.getBundle("routes"); // load properties file
		return routes;
	}

	public static Response createUser(User payload) {
		String post_url = getURL().getString("post_url");

		Response response = given().header("x-api-key", "f3f96a4e-c52d-4029-b5bf-23fba7eb9895")
				.contentType(ContentType.JSON).accept(ContentType.JSON).body(payload).when().post(post_url);
		return response;

	}

	public static Response getUser(String username) {
		String get_url = getURL().getString("get_url");

		Response response = given().log().uri().pathParam("username", username).when().get(get_url);
		return response;

	}

	public static Response updateUser(String username, User payload) {
		String put_url = getURL().getString("put_url");

		Response response = given().contentType(ContentType.JSON).accept(ContentType.JSON).body(payload)
				.pathParam("username", username).when().put(put_url);
		return response;

	}

	public static Response deleteUser(String username) {
		String delete_url = getURL().getString("delete_url");

		Response response = given().pathParam("username", username).when().delete(delete_url);
		return response;

	}

}
