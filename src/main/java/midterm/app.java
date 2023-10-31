package midterm;

public class app {
	private static final String predefinedUsername = 
			"ram"; 
	private static final String predefinedId = 
			"3025"; 
	public static boolean validate(String inputUsername, 
	String inputId) { 
	return inputUsername.equals(predefinedUsername) && inputId.equals(predefinedId);
}
}
