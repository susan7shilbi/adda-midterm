package midterm;

public class app {
	private static final String predefinedUsername = 
			"Susan"; 
	private static final String predefinedId = 
			"20MIC0006"; 
	public static boolean validate(String inputUsername, 
	String inputId) { 
	return inputUsername.equals(predefinedUsername) && inputId.equals(predefinedId);
}
}
