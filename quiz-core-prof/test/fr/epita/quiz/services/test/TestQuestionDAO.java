package fr.epita.quiz.services.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

import fr.epita.quiz.datamodel.Question;
import fr.epita.quiz.services.data.QuestionDAO;

public class TestQuestionDAO {
	
	public static void main(String[] args) throws Exception {
		//given a context
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/2020s1-quiz-database", "postgres", "");
		PreparedStatement prepareStatement = connection.prepareStatement("INSERT INTO \"QUESTIONS\"(question,difficulty) VALUES ('What is Python?', 5)");
		prepareStatement.execute();
		QuestionDAO dao = new QuestionDAO();
		
		
		
		//when 
		Question question = new Question();
		question.setDifficulty(3);
		question.setQuestion("What is");
		List<Question> list = dao.search(question);
		
		
		
		//then
		//assert that list is of the right size
		int match = list.stream()
				.filter(q -> q.getDifficulty() == 5 && q.getQuestion().equals("What is Python?"))
				.collect(Collectors.toList())
				.size();
		if (match == 0) {
			throw new Exception("the search method did not retrieve any result!");
		}
		
		//clean
		
		
		
	}

}
