class Student
{
	private int age;
	private String name; ///Data Members//
	private String city; //If data members are made as private then that variables cannot be accessed out 
	                     //side the class	in which it is present.
	//We need to take the input from other class .
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
public class Encap {
	public static void main(String[] args) {
	Student s=new Student();
	s.setAge(10);
	System.out.println(s.getAge());
	
	}
}
 	