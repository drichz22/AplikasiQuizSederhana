package aplikasiQuiz;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	private static List<Courses> randomizeQuestions(List<Courses> questions){
		List<Courses> shuffledQuestions = new ArrayList<>(questions);
        Collections.shuffle(shuffledQuestions);
        return shuffledQuestions;
	}
	
	private static void consumeNewLine(Scanner scanner) {
		if (scanner.hasNextLine()) {
	        scanner.nextLine();
	    }
	}
	
	private static void displayQuestionAndCollectAnswer(int index, Courses question, Scanner scanner) {
		System.out.println("\nQuestion " + (index + 1) + " (ID: " + question.getId() + "):");
	    question.display();
	    System.out.print("Your answer: ");
	}
	
	private static boolean evaluateAnswer(Courses question, String userAnswer) {
	    return question.isCorrect(userAnswer);
	}
	
	private static void takeQuiz(List<Courses> questions, Scanner scanner, ArrayList<Integer> scoreList) {
        int score = 0, correctScore = 5;
        String correctFeedback = "Correct!", incorrectFeedback = "Incorrect. The correct answer is: ";

        System.out.println("\nQuiz Start:");
        List<Courses> shuffledQuestions = randomizeQuestions(questions);
        consumeNewLine(scanner);
        
        for (int i = 0; i < shuffledQuestions.size(); i++) {
        	Courses currentQuestion = shuffledQuestions.get(i);
            displayQuestionAndCollectAnswer(i, currentQuestion, scanner);
            String userAnswer = scanner.nextLine();
            
            if (evaluateAnswer(currentQuestion, userAnswer)) {
                System.out.println(correctFeedback);
                score += correctScore;
            } else {
                System.out.println(incorrectFeedback + currentQuestion.getAnswer());
            }
        }

        System.out.println("\nQuiz Complete. Your Score: " + score + "/" + shuffledQuestions.size() * 5);
        scoreList.add(score);
    }
	
	private static void signUp(Map<String, loggedUser> users, Scanner scanner) {
		consumeNewLine(scanner);
		
        System.out.println("\nREGISTRATION");
        System.out.print("\nEnter username: ");
        String regUsername = scanner.nextLine();
        
        while (regUsername.length() < 5 || regUsername.length() > 20) {
        	System.out.println("Length of username must be between 5 and 20 (inclusive)!");
        	System.out.println("\nREGISTRATION");
            System.out.print("\nEnter username: ");
            regUsername = scanner.nextLine();
        }

        while (users.containsKey(regUsername)) {
            System.out.println("Username already exists. Please choose another username.");
            System.out.print("\nEnter username: ");
            regUsername = scanner.nextLine();
        }

        System.out.print("Enter password: ");
        String regPassword = scanner.nextLine();
        
        System.out.print("Enter email: ");
        String regEmail = scanner.nextLine();
        
        loggedUser loggeduser = new loggedUser(regUsername, regPassword, regEmail);
        users.put(regUsername, loggeduser);

        System.out.println("Registration successful!");
    }

    private static boolean login(Map<String, loggedUser> users, Scanner scanner, ArrayList<String> usernameList) {
    	consumeNewLine(scanner);
    	System.out.println("\nLOGIN");
        System.out.println("");
        System.out.print("Enter your username: ");
        String enteredUsername = scanner.nextLine();

        if (!users.containsKey(enteredUsername)) {
            System.out.println("Username not found. Please sign up first.");
            return false;
        }
        
        usernameList.add(enteredUsername);
        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();

        loggedUser loggeduser = users.get(enteredUsername);

        if (loggeduser.loginPassword(enteredPassword)) {
            System.out.println("\nLogin successful!");
            System.out.println("");
            loggeduser.displayInfo();
            return true;
        } else {
            System.out.println("Login failed. Incorrect password.");
            return false;
        }
    }
        
    private static Map<String, Integer> createLeaderboardMap(ArrayList<String> usernames, ArrayList<Integer> scores) {
        Map<String, Integer> leaderboardMap = new HashMap<>();
        int size = Math.min(usernames.size(), scores.size());
        if (usernames == null || scores == null || usernames.size() != scores.size()) {
            throw new IllegalArgumentException("Usernames and scores lists must be NOT NULL and of same size!");
        }

        for (int i = 0; i < size; i++) {
        	String username = usernames.get(i);
        	int score = scores.get(i);
        	leaderboardMap.put(username, score);
        }
        return leaderboardMap;
    }
    
    private static void displayLeaderboard(Map<String, Integer> leaderboardMap) {
        System.out.println("\nLEADERBOARD");
        System.out.println("==============");
        if (leaderboardMap == null || leaderboardMap.isEmpty()) {
            System.out.println("Leaderboard is empty.");
            return;
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(leaderboardMap.entrySet());

        entries.sort((entry1, entry2) -> Integer.compare(entry2.getValue(), entry1.getValue()));

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + '\t' + entry.getValue());
        }
    }
    
    private static void printMenu() {
        System.out.println("\n-- Ruangdosen --");
        System.out.println("1. Sign - Up");
        System.out.println("2. Login");
        System.out.println("3. View Leaderboard");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }
    
    private static void printQuizMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Java Course");
        System.out.println("2. Math Course");
        System.out.println("3. C Course");
        System.out.println("4. DBMS Course");
        System.out.println("5. Front-End Course");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    
    private static void runQuizMenu(Scanner scanner, ArrayList<Integer> scoreList) {
        int choice;
        do {
            printQuizMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    takeQuiz(new javaCourse().getQuestions(), scanner, scoreList);
                    break;
                case 2:
                    takeQuiz(new mathCourse().getQuestions(), scanner, scoreList);
                    break;
                case 3:
                    takeQuiz(new CCourse().getQuestions(), scanner, scoreList);
                    break;
                case 4:
                    takeQuiz(new DBMSCourse().getQuestions(), scanner, scoreList);
                    break;
                case 5:
                    takeQuiz(new FrontEndCourse().getQuestions(), scanner, scoreList);
                    break;
                case 6:
                    System.out.println("Exiting the quiz menu. See ya!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 6);
    }
    
    private static void loginAndRunMenu(Map<String, loggedUser> users, Scanner scanner, ArrayList<String> usernameList, ArrayList<Integer> scoreList) {
        if (!login(users, scanner, usernameList)) {
            return;
        }
        
        runQuizMenu(scanner, scoreList);
    }
    
    private static void runRuangdosen(Scanner scanner) {
        ArrayList<Integer> scoreList = new ArrayList<>();
        ArrayList<String> usernameList = new ArrayList<>();
        Map<String, loggedUser> users = new HashMap<>();
        
        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    signUp(users, scanner);
                    break;
                case 2:
                    loginAndRunMenu(users, scanner, usernameList, scoreList);
                    break;
                case 3:
                    displayLeaderboard(createLeaderboardMap(usernameList, scoreList));
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye! :)");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
    
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
        try {
            runRuangdosen(scanner);
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
	}
}