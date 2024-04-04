package aplikasiQuiz;

public class FrontEndCourse extends Courses {
	
	public FrontEndCourse() {
        super("HTML, CSS, and JS");
        initializeQuestions();
    }

    private void initializeQuestions() {
        addQuestion(new Courses(81, "What does HTML stand for?"
        		+ "\n A. High Level Text Machine Language"
        		+ "\n B. Hyper Text Markup Language"
        		+ "\n C. Hyperlink and Text Markup Language"
        		+ "\n D. Hyper Transfer Markup Language", "B"));
        addQuestion(new Courses(82, "<a> is used to create hyperlink in HTML. (true/false)", "true"));
        addQuestion(new Courses(83, "Which syntax is used to provide a document's metadata?", "<meta>"));
        addQuestion(new Courses(84, "What is used to create an unordered list?"
        		+ "\n A. <ul>"
        		+ "\n B. <ol>"
        		+ "\n C. <li>"
        		+ "\n D. <list>", "A"));
        addQuestion(new Courses(85, "What does CSS stand for?"
        		+ "\n A. Counter Style Sheet"
        		+ "\n B. Cascading Style Sheet"
        		+ "\n C. Computer Style Sheet"
        		+ "\n D. Creative Style Sheet", "B"));
        addQuestion(new Courses(86, "What is used to change text color in CSS?"
        		+ "\n A. color"
        		+ "\n B. text-color"
        		+ "\n C. font-color"
        		+ "\n D. style", "A"));
        addQuestion(new Courses(87, "How do you link external CSS file with HTML?"
        		+ "\n A. <style> tag"
        		+ "\n B. <css> tag"
        		+ "\n C. <script> tag"
        		+ "\n D. <link> tag", "D"));
        addQuestion(new Courses(88, "Which CSS element is to control spaces between elements?"
        		+ "\n A. margin"
        		+ "\n B. padding"
        		+ "\n C. spacing"
        		+ "\n D. border", "A"));
        addQuestion(new Courses(89, "How do you declare variable in Javascript?"
        		+ "\n A. int myVar"
        		+ "\n B. v myVar"
        		+ "\n C. var myVar"
        		+ "\n D. declare myVar", "C"));
        addQuestion(new Courses(90, "Javascript is primarily used for styling in web dev. (true/false)", "false"));
        addQuestion(new Courses(91, "addEventListener method is to handle events. (true/false)", "true"));
        addQuestion(new Courses(92, "'===' is for strict equality in JS. (true/false)", "true"));
        addQuestion(new Courses(93, "'throw' is the keyword for exception handling. (true/false)", "false"));
        addQuestion(new Courses(94, "<style> is an example of inline CSS style. (true/false)", "false"));
        addQuestion(new Courses(95, "<script> tag in HTML is to embed JS code. (true/false)", "true"));
        addQuestion(new Courses(96, "What HTML element which usage is to define a HTML document's structure?", "<html>"));
        addQuestion(new Courses(97, "What CSS property hides the element without affecting the layout?", "display:none"));
        addQuestion(new Courses(98, "What JS operator is used to determine the type of a variable?", "typeof"));
        addQuestion(new Courses(99, "How do you include external JS file in an HTML document? (syntax only)", "<script>"));
        addQuestion(new Courses(100, "What CSS property is used to define the order of stacking of positioned elements?", "z-index"));
    }
	
}
