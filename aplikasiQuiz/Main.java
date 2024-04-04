package aplikasiQuiz;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	private static int min (int a, int b) {
		return (a < b) ? a : b;
	}
	
	private static void takeQuiz(List<Courses> questions, Scanner scanner, ArrayList<Integer> scoreList) {
        int score = 0;

        System.out.println("\nQuiz Start:");
        List<Courses> shuffledQuestions = new ArrayList<>(questions);
        Collections.shuffle(shuffledQuestions);
        for (int i = 0; i < shuffledQuestions.size(); i++) {
        	Courses currentQuestion = shuffledQuestions.get(i);
            System.out.println("\nQuestion " + (i + 1) + " (ID: " + currentQuestion.getId() + "):");
            currentQuestion.display();;
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            userAnswer += scanner.nextLine();

            if (currentQuestion.isCorrect(userAnswer)) {
                System.out.println("Correct!");
                score += 5;
            } else {
                System.out.println("Incorrect. The correct answer is: " + currentQuestion.getAnswer());
            }
        }

        System.out.println("\nQuiz Complete. Your Score: " + score + "/" + shuffledQuestions.size() * 5);
        scoreList.add(score);
    }
	
	private static void signUp(Map<String, loggedUser> users, Scanner scanner) {
        System.out.println("\nREGISTRATION");
        System.out.println("");
        System.out.print("Enter username: ");
        String regUsername = scanner.next();
        regUsername += scanner.nextLine();

        while (users.containsKey(regUsername)) {
            System.out.println("Username already exists. Please choose another username.");
            System.out.print("Enter username: ");
            regUsername = scanner.next();
            regUsername += scanner.nextLine();
        }

        System.out.print("Enter password: ");
        String regPassword = scanner.next();
        regPassword += scanner.nextLine();
        
        System.out.print("Enter email: ");
        String regEmail = scanner.next();
        
        loggedUser loggeduser = new loggedUser(regUsername, regPassword, regEmail);
        users.put(regUsername, loggeduser);

        System.out.println("Registration successful!");
    }

    private static boolean login(Map<String, loggedUser> users, Scanner scanner, ArrayList<String> usernameList) {
        System.out.println("\nLOGIN");
        System.out.println("");
        System.out.print("Enter your username: ");
        String enteredUsername = scanner.next();
        enteredUsername += scanner.nextLine();

        if (!users.containsKey(enteredUsername)) {
            System.out.println("Username not found. Please sign up first.");
            return false;
        }
        
        usernameList.add(enteredUsername);
        System.out.print("Enter your password: ");
        String enteredPassword = scanner.next();
        enteredPassword += scanner.nextLine();

        loggedUser loggeduser = users.get(enteredUsername);

        if (loggeduser.loginPassword(enteredPassword)) {
            System.out.println("Login successful!");
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
        int size = min(usernames.size(), scores.size());

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

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(leaderboardMap.entrySet());

        entries.sort((entry1, entry2) -> Integer.compare(entry2.getValue(), entry1.getValue()));

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + '\t' + entry.getValue());
        }
    }
    
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
        int choice, choice1;
        ArrayList<Integer> scoreList = new ArrayList<>();
        ArrayList<String> usernameList = new ArrayList<>();

        Courses javaCourse = new javaCourse();
        Courses mathCourse = new mathCourse();
        Courses CCourse = new CCourse();
        Courses DBMSCourse = new DBMSCourse();
        Courses FrontEndCourse = new FrontEndCourse();
        
        Map<String, loggedUser> users = new HashMap<>();
        
        try {	
        while (true) {
        	System.out.println("\n-- Ruangdosen --");
        	System.out.println("1. Sign - Up");
        	System.out.println("2. Login");
        	System.out.println("3. View Leaderboard");
        	System.out.println("4. Exit");
        	System.out.print("Enter your choice: ");
        	choice1 = scanner.nextInt();
        	switch (choice1) {
        		case 1:
        			signUp(users, scanner);
                    break;
        		case 2:
        			if (!login(users, scanner, usernameList)) {
        				break;
        			}
        				do {
        		            System.out.println("\nMenu:");
        		            System.out.println("1. Java Course");
        		            System.out.println("2. Math Course");
        		            System.out.println("3. C Course");
        		            System.out.println("4. DBMS Course");
        		            System.out.println("5. Front-End Course");
        		            System.out.println("6. Exit");
        		            System.out.print("Enter your choice: ");
        		            choice = scanner.nextInt();    		
        		            switch (choice) {
        		                case 1:
        		                    takeQuiz(javaCourse.getQuestions(), scanner, scoreList);
        		                    break;
        		                case 2:
        		                    takeQuiz(mathCourse.getQuestions(), scanner, scoreList);
        		                    break;
        		                case 3:
        		                	takeQuiz(CCourse.getQuestions(), scanner, scoreList);
        		                    break;
        		                case 4:
        		                	takeQuiz(DBMSCourse.getQuestions(), scanner, scoreList);
        		                    break;
        		                case 5:
        		                	takeQuiz(FrontEndCourse.getQuestions(), scanner, scoreList);
        		                    break;
          		                case 6:
        		                    System.out.println("Exiting the quiz menu. See ya!");
        		                    break;
        		                default:
        		                    System.out.println("Invalid choice. Please enter a valid option.");
        		            	}
        		    } while (choice != 6);
        		    break;
        		case 3:
        			displayLeaderboard(createLeaderboardMap(usernameList, scoreList));
        			break;
        		case 4:
        			System.out.println("Exiting the program. Goodbye! :)");
        			System.exit(0);
                    break;
        		default:
                    System.out.println("Invalid choice. Please enter a valid option.");
        	}
          }
       } catch (Exception e) {
        		   System.out.println("Galat");
       }
         finally {
        	 if (scanner != null) {
        		   scanner.close();
        	 }
         }
	}
}
