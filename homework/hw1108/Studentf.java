package homework.hw1108;

public class Studentf{
	
	public String name;
	private String password;
	protected int age;
	String sex;
	
	public Studentf() {
		
	}
	
	public Studentf(String name) {
		this.name = name;
	}
	
	private Studentf(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public void study() {
		System.out.println("------study()-------");
	}
	
	public void study(String message) {
		System.out.println("------study(String)-------");
	}
	
	private void play() {
		System.out.println("-----play()-------");
	}
	
//	protected int eat() {
	private int eat() {
		System.out.println("------eat()-------");
		return 100;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	

}
