package aplikasiQuiz;

public class javaCourse extends Courses {
	
	public javaCourse() {
        super("Java Programming");
        initializeQuestions();
    }

    private void initializeQuestions() {
        addQuestion(new Courses(1, "What is Java?"
        		+ "\n A. A type of Coffee"
        		+ "\n B. An island in Indonesia"
        		+ "\n C. A programming language"
        		+ "\n D. All of the Above", "C"));
        addQuestion(new Courses(2, "Java uses automatic garbage collection. (true/false)", "true"));
        addQuestion(new Courses(3, "Which keyword is used to define a constant in Java?", "final"));
        addQuestion(new Courses(4, "What is the main principle of Object - Oriented Programming that Java follows? "
        		+ "\n A. Inheritance"
        		+ "\n B. Encapsulation"
        		+ "\n C. Polymorphism"
        		+ "\n D. All of the Above", "D"));
        addQuestion(new Courses(5, "What does JVM stand for in Java?"
        		+ "\n A. Java Virtual Machine"
        		+ "\n B. Java Visual Machine"
        		+ "\n C. Just Very Modern"
        		+ "\n D. Java Variable Manager", "A"));
        addQuestion(new Courses(6, "How do you declare a variable in Java?"
        		+ "\n A. variable = x"
        		+ "\n B. var x"
        		+ "\n C. x = 5"
        		+ "\n D. int x", "D"));
        addQuestion(new Courses(7, "Which keyword is used to define a method in Java?"
        		+ "\n A. function"
        		+ "\n B. method"
        		+ "\n C. define"
        		+ "\n D. void", "B"));
        addQuestion(new Courses(8, "What is the default value of an uninitialized numeric variable in Java?"
        		+ "\n A. 0"
        		+ "\n B. 1"
        		+ "\n C. -1"
        		+ "\n D. NULL", "A"));
        addQuestion(new Courses(9, "Which loop is used for iterating a block of code a fixed number of times in Java?"
        		+ "\n A. for"
        		+ "\n B. while"
        		+ "\n C. do-while"
        		+ "\n D. loop", "A"));
        addQuestion(new Courses(10, "Data type for storing characters in Java is int. (true/false)", "false"));
        addQuestion(new Courses(11, "'x == y' is how you compare two variables. (true/false)", "true"));
        addQuestion(new Courses(12, "'break' statement terminates the loop. (true/false)", "true"));
        addQuestion(new Courses(13, "'throw' is the keyword for exception handling. (true/false)", "false"));
        addQuestion(new Courses(14, "'static' keyword in a method makes the method static. (true/false)", "false"));
        addQuestion(new Courses(15, "'&' represents the logical AND in Java. (true/false)", "false"));
        addQuestion(new Courses(16, "What is the output of System.out.println(5 + \"Java\")?", "5Java"));
        addQuestion(new Courses(17, "Which class is for reading input in Java?", "Scanner"));
        addQuestion(new Courses(18, "What is the output of System.out.println(5 + \" Java\")?", "5 Java"));
        addQuestion(new Courses(19, "How do you import ArrayList in Java?", "import java.util.ArrayList"));
        addQuestion(new Courses(20, "Which data type is for storing an array of characters?", "String"));
    }
}
