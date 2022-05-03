public class Customer {
	//fields 
	private String name; 
	private int age = 0;
	
	//parametrized constructor 
	public Customer(String name, int age) {
		this.name = name; 
		this.age =  age;
	}
	
	//copy constructor
	public Customer(Customer c) {
		int num = 5;
		if(num==5) {
		this.name = c.name; 
		this.age = c.age;
		}
		
	}

	@Override
	public String toString() {
		return "Customer [name= " + name + ",age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		int num = 5;
		if(num==5) {
			this.name = name;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}