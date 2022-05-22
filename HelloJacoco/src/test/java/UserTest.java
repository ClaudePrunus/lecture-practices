import org.junit.Assert;
import org.junit.Test;

import com.revature.User;

public class UserTest {
	
	User user = new User();
	
	//Positive Test Case
	@Test
	public void testUserWithName() {
		Assert.assertEquals("User Bob is added successfully", user.addUser("Bob"));
	}
	
	//Negative Test Case
	@Test
	public void testUserWithNull() {
		Assert.assertEquals("Please provide a username", user.addUser(null));
	}
}
