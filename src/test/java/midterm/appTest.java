package midterm;

import org.testng.Assert;
import org.testng.annotations.Test;

public class appTest {
	@Test
    public void testValidUser() {
        Assert.assertTrue(validate("ram", "3025"));
    }

    @Test
    public void testInvalidUser() {
        Assert.assertFalse(validate("wronguser", "wrongId"));
    }

    public static boolean validate(String username, String id) {
        return username.equals("ram") && id.equals("3025");
    }
}