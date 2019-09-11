package ncs.test8;

public class User implements Cloneable{
	//field
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;
	
	//constructor
	public User() {
		
	}
	public User(String id, String password, String name, int age, char gender, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
	public User(User u) {
		this.id = u.id;
		this.password = u.password;
		this.name = u.name;
		this.age = u.age;
		this.gender = u.gender;
		this.phone = u.phone;
	}
	
	//getter & setter
	//getter
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getPhone() {
		return phone;
	}
	//setter
	public void setId(String id) {
		this.id = id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//method
	@Override
	public String toString() {
		return id+"\t"+password+"\t"+name+"\t"+age+"\t"+gender+"\t"+phone;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof User)){
			return false;
		}
		User user = (User)obj;
		
		if(!(id.equals(user.id))) {
			return false;
		}
		else if(!(password.equals(user.password))) {
			return false;
		}
		else if(!(name.equals(user.name))) {
			return false;
		}
		else if(age != user.age) {
			return false;
		}
		else if(gender != user.gender) {
			return false;
		}
		else if(!(phone.equals(user.phone))) {
			return false;
		}
		else {
			return true;
		}
	}
	
	/*
	 * 공변반환타입
	 * 오버라이딩은 부모 메서드의 시그니쳐와 완벽하게 동일해야한다.
	 * 리턴타입에 있어 같거나 자식타입으로 재작성 할 수 있다.
	 * 
	 * Object타입의 후손들이 들어갈 수 있다.
	 * Object -> User가능
	 */
	@Override
	public Object clone() throws CloneNotSupportedException{
//		User user = (User)super.clone();
		User user = new User(id,password,name,age,gender,phone);
		return user;
	}
	
	
}
