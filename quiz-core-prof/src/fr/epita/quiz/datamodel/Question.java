package fr.epita.quiz.datamodel;

public class Question {
	private int id;
	private String question;
	private Integer difficulty;
	
	public Question() {
	
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public int getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	public Question(int id, String question, int difficulty) {
		super();
		this.id = id;
		this.question = question;
		this.difficulty = difficulty;
	}
	
	

}
