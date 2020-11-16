package fr.epita.dataproject;

public class Person {

	private String name;
	private int age;
	private int weight;
	private int height;
	private String sex;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Person(String name, int age, int weight, int height, String sex) {
	
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", weight=" + weight + ", height=" + height + ", sex=" + sex
				+ "]\n";
	}
	
	
	
}
