package fr.epita.quiz.launchers;

public class AuthenticationService {
	
	private static final String DEFAULT_PWD = "pwd";
	private static final String DEFAULT_LOGIN = "login";
	
	public static boolean authenticate(String user, String password) {
		return user.equals(DEFAULT_LOGIN) && password.equals(DEFAULT_PWD);
			
		
	}

}
