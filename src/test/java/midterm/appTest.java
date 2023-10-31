package midterm;

public class appTest {
	private static final String predefinedUsername = 
			"Susan"; 
	private static final String predefinedId = 
			"20MIC0006"; 
	public static boolean validate(String inputUsername, 
	String inputId) { 
	return inputUsername.equals(predefinedUsername) && inputId.equals(predefinedId);
}
}