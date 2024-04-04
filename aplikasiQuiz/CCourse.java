package aplikasiQuiz;

public class CCourse extends Courses {
	
	public CCourse() {
        super("C Programming");
        initializeQuestions();
    }
	
	private void initializeQuestions() {
        addQuestion(new Courses(41, "What is #include for?"
        		+ "\n A. Include comment"
        		+ "\n B. Include library/file"
        		+ "\n C. Include template"
        		+ "\n D. All of the Above", "B"));
        addQuestion(new Courses(42, "'int' is data type for integer. (true/false)", "true"));
        addQuestion(new Courses(43, "What is the data type for a character?", "char"));
        addQuestion(new Courses(44, "Which declaration of integer is right?"
        		+ "\n A. x = 5"
        		+ "\n B. integer x = 5"
        		+ "\n C. int x = 5"
        		+ "\n D. All of the Above", "C"));
        addQuestion(new Courses(45, "What data-type is for floating-point numbers?"
        		+ "\n A. float"
        		+ "\n B. integer"
        		+ "\n C. double"
        		+ "\n D. char", "A"));
        addQuestion(new Courses(46, "How do you declare a variable in C?"
        		+ "\n A. variable = x"
        		+ "\n B. var x"
        		+ "\n C. x = 5"
        		+ "\n D. int x", "D"));
        addQuestion(new Courses(47, "Which of the following comment is right?"
        		+ "\n A. /* this is a comment"
        		+ "\n B. // this is a comment"
        		+ "\n C. -- this is a comment --"
        		+ "\n D. /* this is a comment*/", "B"));
        addQuestion(new Courses(48, "What is '++' in '++i' called?"
        		+ "\n A. pre-increment"
        		+ "\n B. post-increment"
        		+ "\n C. increment"
        		+ "\n D. plus", "A"));
        addQuestion(new Courses(49, "What is 'sizeof' for in C?"
        		+ "\n A. Returns the size of a datatype/variable"
        		+ "\n B. Returns the value of variable"
        		+ "\n C. Determines the type of variable"
        		+ "\n D. Returns the address of variable", "A"));
        addQuestion(new Courses(50, "Data type for storing characters in C is int. (true/false)", "false"));
        addQuestion(new Courses(51, "'x == y' is how you compare two variables. (true/false)", "true"));
        addQuestion(new Courses(52, "'break' statement terminates the loop. (true/false)", "true"));
        addQuestion(new Courses(53, "the syntax 'malloc' is contained in string library. (true/false)", "false"));
        addQuestion(new Courses(54, "the syntax 'strcpy' is contained in stdlib library. (true/false)", "false"));
        addQuestion(new Courses(55, "'&' represents the logical AND in C. (true/false)", "false"));
        addQuestion(new Courses(56, "What is the output of printf (\"%d\", 2 + 5)", "7"));
        addQuestion(new Courses(57, "Which syntax is for reading input in C?", "scanf"));
        addQuestion(new Courses(58, "What is the syntax to output a string variable?", "%s"));
        addQuestion(new Courses(59, "How do you import stblib library in C?", "#include <stdlib.h>"));
        addQuestion(new Courses(60, "Which data type of decimals contains the biggest storage size?", "double"));
    }
	
}
