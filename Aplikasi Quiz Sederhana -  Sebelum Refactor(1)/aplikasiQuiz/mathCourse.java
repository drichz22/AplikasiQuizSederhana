package aplikasiQuiz;

public class mathCourse extends Courses{
	
	public mathCourse() {
        super("Mathematics");
        initializeQuestions();
    }

    private void initializeQuestions() {
    	addQuestion(new Courses(21, "The sum of the angles in a triangle is always 180 degrees. (true/false)", "true"));
        addQuestion(new Courses(22, "What is the area of rectangle with length = 12 and width = 15?", "180"));
        addQuestion(new Courses(23, "What is the formula for an area of a triangle?"
        		+ "\n A. 1/2 * base * height"
        		+ "\n B. base * height"
        		+ "\n C. base + height"
        		+ "\n D. (base + height)/2", "A"));
        addQuestion(new Courses(24, "Sin 90 degrees is 0. (true/false)", "false"));
        addQuestion(new Courses(25, "What is the value of sin 30?", "0.5"));
        addQuestion(new Courses(26, "What is the result of 2 + 2?"
        		+ "\n A. 4"
        		+ "\n B. 5"
        		+ "\n C. 6"
        		+ "\n D. All of the Above", "A"));
        addQuestion(new Courses(27, "Substract 4 from 5"
        		+ "\n A. 1"
        		+ "\n B. 2"
        		+ "\n C. 3"
        		+ "\n D. 4", "A"));
        addQuestion(new Courses(28, "Square root of 25"
        		+ "\n A. 4"
        		+ "\n B. 5"
        		+ "\n C. 6"
        		+ "\n D. 7", "B"));
        addQuestion(new Courses(29, "Divide 12 by 4"
        		+ "\n A. 2"
        		+ "\n B. 3"
        		+ "\n C. 6"
        		+ "\n D. 1/3", "B"));
        addQuestion(new Courses(30, "Square root of 16"
        		+ "\n A. 0"
        		+ "\n B. 1"
        		+ "\n C. -1"
        		+ "\n D. 4", "D"));
        addQuestion(new Courses(31, "Divide 20 by 5"
        		+ "\n A. 4"
        		+ "\n B. 2"
        		+ "\n C. 1/4"
        		+ "\n D. 1", "A"));
        addQuestion(new Courses(32, "The sum of angles in a rectangle is 270 degrees. (true/false)", "false"));
        addQuestion(new Courses(33, "The sum of 1 to 100 is 5050. (true/false)", "true"));
        addQuestion(new Courses(34, "The area of trapezoid with a = 5, b = 5, and h = 2 is 10. (true/false)", "true"));
        addQuestion(new Courses(35, "The derivative of x^2 is 2x. (true/false)", "true"));
        addQuestion(new Courses(36, "The integral of x^2 is 1/2 x^3. (true/false)", "false"));
        addQuestion(new Courses(37, "tan (45) is 1. (true/false)", "true"));
        addQuestion(new Courses(38, "What is 3 + 2?", "5"));
        addQuestion(new Courses(39, "What is 2 + 4?", "6"));
        addQuestion(new Courses(40, "What is 12 * 12?", "144"));
    }
	
}
