package fr.epita.quiz.services.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.epita.quiz.datamodel.Question;

public class QuestionDAO {
	
	public void create(Question question) {
		
	}
	
	//question.setQuestion("*; DROP TABLE QUESTION;SELECT * from QUESTION WHERE 1=1";
	public List<Question> search(Question questionExample) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/2020s1-quiz-database", "postgres", "");
		System.out.println(connection.getSchema());
		String query = "SELECT question,difficulty FROM \"QUESTIONS\" WHERE "
				+ "(? is null or question LIKE ?)"
				+ "and (? =-1 or difficulty = ?)";	
		
		
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		prepareStatement.setString(1, questionExample.getQuestion() + "%");
		prepareStatement.setString(2, questionExample.getQuestion() + "%");
		prepareStatement.setInt(3, questionExample.getDifficulty());
		prepareStatement.setInt(4, questionExample.getDifficulty());
		ResultSet results = prepareStatement.executeQuery();
		
		List<Question> questions = new ArrayList<Question>();
		while (results.next()) {
			String questionTitle = results.getString("question");
			int difficulty = results.getInt("difficulty");
			Question question = new Question();
			question.setQuestion(questionTitle);
			question.setDifficulty(difficulty);
			questions.add(question);
			System.out.println("question : " + question + " with difficulty :" + difficulty);
		}
		
		connection.close();
		
		return questions; 
		
	}

}
