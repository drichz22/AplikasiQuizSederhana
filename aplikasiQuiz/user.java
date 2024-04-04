package aplikasiQuiz;

public class user {
	
	private String username;
    private String password;

    public user(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void displayInfo() {
        System.out.println("Username: " + username);
    }

    public boolean loginPassword(String enteredPassword) {
        return enteredPassword.equals(password);
    }
    
    public boolean loginUsername (String enteredUsername) {
    	return enteredUsername.equals(username);
    }
    
    public String getUsername() {
        return username;
    }
	
}
