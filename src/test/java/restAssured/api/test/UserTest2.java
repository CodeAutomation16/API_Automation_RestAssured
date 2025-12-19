package restAssured.api.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.response.Response;
import restAssured.api.endpoints.UserEndPoints2;
import restAssured.api.payload.User;

public class UserTest2 {
	Faker faker;
	User Userpayload;
	public Logger logger;
	@BeforeClass
	public void setupdata() {

		this.faker = new Faker();
		this.Userpayload = new User();

		Userpayload.setId(faker.idNumber().hashCode());
		Userpayload.setUsername(faker.name().username());
		Userpayload.setFirstName(faker.name().firstName());
		Userpayload.setLastName(faker.name().lastName());
		Userpayload.setEmail(faker.internet().emailAddress());
		Userpayload.setPassword(faker.internet().password(5, 10));
		Userpayload.setPhone(faker.phoneNumber().cellPhone());
		logger = LogManager.getLogger(this.getClass());

	}

	@Test(priority = 1)

	public void testPostUser() {
		logger.info("**********creating user*************");
		Response response = UserEndPoints2.createUser(Userpayload);
		response.then().log().all();
		Assert.assertEquals(response.statusCode(), 200);

	}

	@Test(priority = 2)

	public void getUser() {
		logger.info("**********getting user*************");
		Response response = UserEndPoints2.getUser(this.Userpayload.getUsername());
		response.then().log().all();
		Assert.assertEquals(response.statusCode(), 200);

	}
	
	@Test (priority =3)
	public void updateUser(){
		Userpayload.setFirstName("Rahul");
		Userpayload.setLastName("Mohnish");
		Response response = UserEndPoints2.updateUser(Userpayload.getUsername(), Userpayload);
		response.then().log().all();
		
		//validate data after update
		logger.info("**********user updated*************");

		Response responseAfterUpdate = UserEndPoints2.getUser(this.Userpayload.getUsername());
		responseAfterUpdate.then().log().all();
	}
	
	@Test (priority =4)
	public void deleteUser() {
		logger.info("**********deleted user *************");

		Response response =UserEndPoints2.deleteUser(Userpayload.getUsername());
		Assert.assertEquals(response.statusCode(), 200);

		
	}
	
	

}
