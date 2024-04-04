package aplikasiQuiz;

public class loggedUser extends user {
	
	private String email;

    public loggedUser(String username, String password, String email) {
        super(username, password);
        this.email = email;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Email: " + email);
    }
    
    
}
