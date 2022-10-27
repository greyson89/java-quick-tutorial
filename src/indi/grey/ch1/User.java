package indi.grey.ch1;

public class User {

	// vo = value object , view object
	// po = persist object
	// dto = data trasfer object

	private String name;
	private String id;
	private int age;
	public String address;


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "User [address=" + address + ", age=" + age + ", id=" + id + ", name=" + name + "]";
	}



	

	



	
}
