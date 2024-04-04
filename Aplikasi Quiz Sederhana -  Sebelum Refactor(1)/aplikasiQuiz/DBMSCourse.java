package aplikasiQuiz;

public class DBMSCourse extends Courses {
	
	public DBMSCourse() {
        super("Database Management System");
        initializeQuestions();
    }

    private void initializeQuestions() {
        addQuestion(new Courses(61, "What is SQL?"
        		+ "\n A. Structured Language"
        		+ "\n B. Simple Query Language"
        		+ "\n C. Structured Query Language"
        		+ "\n D. Sequential Query Language", "C"));
        addQuestion(new Courses(62, "Relational Model is a type of database model. (true/false)", "true"));
        addQuestion(new Courses(63, "Which syntax is to specify conditions of doing something?", "WHERE"));
        addQuestion(new Courses(64, "What is the syntax 'SELECT' for?"
        		+ "\n A. Update data"
        		+ "\n B. Insert Data"
        		+ "\n C. Delete data"
        		+ "\n D. Retrieve data", "D"));
        addQuestion(new Courses(65, "What is Foreign Key for?"
        		+ "\n A. To encrypt something"
        		+ "\n B. To uniquely identify each record"
        		+ "\n C. To refer to the primary key in another table"
        		+ "\n D. To sort records", "C"));
        addQuestion(new Courses(66, "Which normalization step deals with partial dependencies?"
        		+ "\n A. First Normal Form (1NF)"
        		+ "\n B. Second Normal Form (2NF)"
        		+ "\n C. Third Normal Form (3NF)"
        		+ "\n D. Boyce-Codd Normal Form (BCNF)", "C"));
        addQuestion(new Courses(67, "What is GROUP BY for?"
        		+ "\n A. To filter data based on conditions"
        		+ "\n B. To sort data in descending order"
        		+ "\n C. To group rows that have same values in specified columns"
        		+ "\n D. To perform Mathematical operations", "C"));
        addQuestion(new Courses(68, "What type of JOIN returns records when there is a match in either left/right table?"
        		+ "\n A. INNER JOIN"
        		+ "\n B. LEFT JOIN"
        		+ "\n C. RIGHT JOIN"
        		+ "\n D. FULL JOIN", "D"));
        addQuestion(new Courses(69, "What is COMMIT for in database transaction?"
        		+ "\n A. Save changes during transaction"
        		+ "\n B. Undo changes during transaction"
        		+ "\n C. Start new transaction"
        		+ "\n D. Rollback transaction", "A"));
        addQuestion(new Courses(70, "The purpose of JOIN is to combine records from two or more tables. (true/false)", "true"));
        addQuestion(new Courses(71, "PRIMARY KEY is to ensure that values in each column is unique. (true/false)", "true"));
        addQuestion(new Courses(72, "DROP is to remove all rows from a table in SQL. (true/false)", "false"));
        addQuestion(new Courses(73, "COUNT is to count the number of rows in a table that satisfy its condition. (true/false)", "true"));
        addQuestion(new Courses(74, "CREATE is an example of Data Definition Language. (true/false)", "true"));
        addQuestion(new Courses(75, "Atomicity is an ACID property that ensures transactions are fully completed/not. (true/false)", "true"));
        addQuestion(new Courses(76, "How do you delete a table in mySql?", "DROP TABLE"));
        addQuestion(new Courses(77, "What syntax is used to limit the number of rows returned by a query?", "LIMIT"));
        addQuestion(new Courses(78, "What syntax is used to combine two strings?", "CONCAT"));
        addQuestion(new Courses(79, "What syntax is used to retrieve all data from a table?", "SELECT *"));
        addQuestion(new Courses(80, "What syntax is used to retrieve the month of a date?", "MONTH"));
    }
	
}
