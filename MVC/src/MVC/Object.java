package MVC;

public class Object {
	private String name,age,hobby;
	
	Object(String name, String age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAge() {
		return age;
	}
	
	public String getHobby() {
		return hobby;
	}
}
