package aplikasiQuiz;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Courses {
	
	private int id;
    private String text;
    private String answer;
	private String courseName;
    private List<Courses> questions = new ArrayList<>();

    public Courses(int id, String text, String answer) {
        this.id = id;
        this.text = text;
        this.answer = answer;
    }
    
    public String getCourseName() {
        return courseName;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getAnswer() {
        return answer;
    }
    
    public List<Courses> getQuestions() {
    	return Collections.unmodifiableList(questions);
    }

    public boolean isCorrect(String response) {
        return response.equalsIgnoreCase(answer);
    }

    public void display() {
        System.out.println(text);
    }
	
    public Courses(String courseName) {
        this.courseName = courseName;
    }
    
    public void addQuestion(Courses question) {
        questions.add(question);
    }
   
}
