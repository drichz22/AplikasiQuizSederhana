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
    
    private static void javaReferences() {
    	System.out.println("\nGeneral\r"
    			+ "\r\n"
    			+ "Oracle Java mother site @ https://www.oracle.com/technetwork/java/index.html.\r\n"
    			+ "\r\n"
    			+ "OpenJDK mother site @ https://openjdk.java.net/.\r\n"
    			+ "\r\n"
    			+ "Java Documentation @ https://docs.oracle.com/en/java/index.html.\r\n"
    			+ "\r\n"
    			+ "JDK (Java SE or Java Platform Standard Edition)\r\n"
    			+ "JDK (Java SE) mother site @ https://www.oracle.com/technetwork/java/javase/overview/index.html.\r\n"
    			+ "\r\n"
    			+ "JDK API Documentation Online @ https://docs.oracle.com/en/java/javase/11/ (for JDK 11).\r\n"
    			+ "\r\n"
    			+ "Ken Arnold, James Gosling and David Holmes, \"The Java Programming Language\", 4th ed, 2005. (The defacto standard for Java Language, but does not seem to have been updated to cover the latest features?!)\r\n"
    			+ "James Gosling, Bill Joy, Guy Steele and Gilad Bracha, \"The Java Language Specification\", 3rd ed, 2005. (The defacto standard for JVM, but does not seem to have been updated?!)\r\n"
    			+ "\r\n"
    			+ "JDK Demos and Samples (to be downloaded @ https://www.oracle.com/technetwork/java/javase/downloads/index.html).\r\n"
    			+ "\r\n"
    			+ "Books & Online Tutorials\r\n"
    			+ "\r\n"
    			+ "The online Java tutorial @ https://docs.oracle.com/javase/tutorial/. (The authoritative source)\r\n"
    			+ "Paul Deitel and Harvey Deitel, \"Java How to Program, Late Object\", latest edition. (A comprehensive reference for programmers)\r\n"
    			+ "Y. Daniel Liang, \"Introduction to Java Programming\", latest edition. (Good text book for undergraduate Java courses.)\r\n"
    			+ "Bruce Eckel, \"Thinking in Java\", 4th ed, 2007. (Great book but has not been updated?!)");
    }
    
    private static void mathReferences() {
    	System.out.println("\nOnline Learning Platforms:\r"
    			+ "\r\n"
    			+ "Khan Academy\r\n"
    			+ "\r\n"
    			+ "Website\r\n"
    			+ "Provides instructional videos, practice exercises, and a personalized learning dashboard for various math topics.\r\n"
    			+ "Coursera - Mathematics Courses\r\n"
    			+ "\r\n"
    			+ "Website\r\n"
    			+ "Offers online courses from universities and colleges around the world, covering a wide range of mathematical subjects.\r\n"
    			+ "edX - Mathematics\r\n"
    			+ "\r\n"
    			+ "Website\r\n"
    			+ "Similar to Coursera, edX offers online courses from universities and institutions, allowing you to learn at your own pace.\r\n"
    			+ "Books:\r\n"
    			+ "\"Mathematics: Its Content, Methods, and Meaning\" by A. D. Aleksandrov\r\n"
    			+ "\r\n"
    			+ "A comprehensive overview of various branches of mathematics.\r\n"
    			+ "\"How to Solve It\" by George Pólya\r\n"
    			+ "\r\n"
    			+ "Focuses on problem-solving heuristics and methods.\r\n"
    			+ "\"The Princeton Companion to Mathematics\" edited by Timothy Gowers\r\n"
    			+ "\r\n"
    			+ "A comprehensive reference guide to various areas of mathematics.\r\n"
    			+ "Websites and Forums:\r\n"
    			+ "Wolfram Alpha\r\n"
    			+ "\r\n"
    			+ "Website\r\n"
    			+ "A computational engine that can help you solve mathematical problems and generate visualizations.\r\n"
    			+ "Art of Problem Solving (AoPS)\r\n"
    			+ "\r\n"
    			+ "Website\r\n"
    			+ "A community and resource for high-performing math students, with an emphasis on competition math.\r\n"
    			+ "Math Stack Exchange\r\n"
    			+ "\r\n"
    			+ "Website\r\n"
    			+ "A Q&A platform where you can ask and answer mathematical questions.\r\n"
    			+ "Reference Materials:\r\n"
    			+ "Wolfram MathWorld\r\n"
    			+ "\r\n"
    			+ "Website\r\n"
    			+ "An extensive and interactive mathematics encyclopedia.\r\n"
    			+ "MIT OpenCourseWare - Mathematics\r\n"
    			+ "\r\n"
    			+ "Website\r\n"
    			+ "Provides free access to course materials from many MIT mathematics courses.\r\n"
    			+ "YouTube Channels:\r\n"
    			+ "3Blue1Brown\r\n"
    			+ "\r\n"
    			+ "YouTube Channel\r\n"
    			+ "Visualizes complex mathematical concepts to make them more intuitive.\r\n"
    			+ "Numberphile\r\n"
    			+ "\r\n"
    			+ "YouTube Channel\r\n"
    			+ "Offers videos about numbers and mathematics in an entertaining way.");
    }
    
    private static void CReferences() {
    	System.out.println("\nC Programming:\r"
    			+ "\r\n"
    			+ "Book: \"C Programming Absolute Beginner's Guide\" by Perry and Miller\r\n"
    			+ "https://www.informit.com/store/c-programming-absolute-beginners-guide-pearson-9780789751980\r\n"
    			+ "\r\n"
    			+ "Online Course: \"C Programming for Beginners\" on Udemy\r\n"
    			+ "https://www.udemy.com/course/c-for-technical-interview/\r\n"
    			+ "\r\n"
    			+ "Website: GeeksforGeeks C Programming Tutorials\r\n"
    			+ "https://www.geeksforgeeks.org/c-programming-language/\r\n");
    }
    
    private static void DBMSReferences() {
    	System.out.println("\nDatabase Management Systems (DBMS):\r"
    			+ "\r\n"
    			+ "Book: \"Database Management Systems\" by Raghu Ramakrishnan and Johannes Gehrke\r\n"
    			+ "https://www.db-book.com/\r\n"
    			+ "\r\n"
    			+ "Online Course: \"Introduction to Database Management Systems\" on Coursera\r\n"
    			+ "https://www.coursera.org/learn/database-management\r\n"
    			+ "\r\n"
    			+ "Website: Oracle Documentation for Oracle Database\r\n"
    			+ "https://docs.oracle.com/en/database/\r\n");
    }
    
    private static void FrontEndReferences() {
    	System.out.println("\nWeb Development (HTML, CSS, and JavaScript):\r"
    			+ "\r\n"
    			+ "MDN Web Docs:\r\n"
    			+ "https://developer.mozilla.org/en-US/docs/Learn/HTML\r\n"
    			+ "https://developer.mozilla.org/en-US/docs/Learn/CSS\r\n"
    			+ "https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide\r\n"
    			+ "\r\n"
    			+ "Online Course: \"The Web Developer Bootcamp 2023\" on Udemy by Colt Steele\r\n"
    			+ "https://www.udemy.com/course/the-web-developer-bootcamp/\r\n"
    			+ "\r\n"
    			+ "W3Schools:\r\n"
    			+ "https://www.w3schools.com/html/\r\n"
    			+ "https://www.w3schools.com/css/\r\n"
    			+ "https://www.w3schools.com/js/\r\n"
    			+ "\r\n"
    			+ "GitHub Repository: FreeCodeCamp's Responsive Web Design Certification\r\n"
    			+ "https://github.com/freeCodeCamp/freeCodeCamp\r\n");
    }
    
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        int choice, choice1, choice2;
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
        		            System.out.println("6. Link References");
        		            System.out.println("7. Exit");
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
        		                	do {
        		                	System.out.println("\nLINK REFERENCES");
        		                	System.out.println("1. Java Course");
        		                	System.out.println("2. Math Course");
        		                	System.out.println("3. C Course");
        		                	System.out.println("4. DBMS Course");
        		                	System.out.println("5. Front-End Course");
        		                	System.out.println("6. Exit");
        		                	System.out.print("Enter your choice: ");
        		                	choice2 = scanner.nextInt();
        		                	switch (choice2) {
        		                		case 1:
        		                			javaReferences();
        		                			break;
        		                		case 2:
        		                			mathReferences();
        		                			break;
        		                		case 3:
        		                			CReferences();
        		                			break;
        		                		case 4:
        		                			DBMSReferences();
        		                			break;
        		                		case 5:
        		                			FrontEndReferences();
        		                			break;
        		                		case 6:
        		                			System.out.println("Exiting references. See ya!");
        		                			break;
        		                		default:
        		                			System.out.println("Invalid choice. Please enter a valid option.");
        		                		}      		      
        		                	} while (choice2 != 6);
        		                	break;
        		                case 7:
        		                    System.out.println("Exiting the quiz menu. See ya!");
        		                    break;
        		                default:
        		                    System.out.println("Invalid choice. Please enter a valid option.");
        		            }
        		        } while (choice != 7);
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
	
