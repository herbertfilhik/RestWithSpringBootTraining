package br.com.herbies;

public class Greeting {
	private final long id;
	private final String content;
	private final String animal;
	
	public Greeting(long id, String content, String animal) {
		this.id = id;
		this.content = content;
		this.animal = animal;
	}
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
	public String getAnimal() {
		return animal;
	}
}