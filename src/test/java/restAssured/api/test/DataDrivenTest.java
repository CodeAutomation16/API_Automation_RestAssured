package restAssured.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import restAssured.api.endpoints.UserEndPoints;
import restAssured.api.payload.User;
import restAssured.api.utilities.DataProviders;

public class DataDrivenTest {
	
	@Test (priority =1, dataProvider = "Data", dataProviderClass = DataProviders.class )
	public void testPostUser(String UserID, String username, String firstname, String lastname, String useremail, String password, String phone) 
	
	{
		
		User Userpayload = new User();
		Userpayload.setId(Integer.parseInt(UserID));
		Userpayload.setUsername(username);
		Userpayload.setFirstName(firstname);
		Userpayload.setLastName(lastname);
		Userpayload.setEmail(useremail);
		Userpayload.setPassword(password);
		Userpayload.setPhone(phone);

		Response response = UserEndPoints.createUser(Userpayload);
		Assert.assertEquals(response.statusCode(), 200);

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
