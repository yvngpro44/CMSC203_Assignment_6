abstract class Beverage{
	String name; 
	TYPE type;
	SIZE size; 
	
	public final static double BASE_PRICE = 2.0; 
	public final static double SIZE_PRICE = 1.0; 

	public Beverage(String name, TYPE type,SIZE size){
		this.name = name;
		this.type = type; 
		this.size = size;
	}
	
	public TYPE getBevType() {
		return this.type;
	}
	public String toString() {
		return this.name+" "+this.size;
	}
	public boolean equals(Beverage beverage) {
		return (beverage.name.equals(this.name) 
				&& beverage.type.equals(this.type)&&beverage.size.equals(this.size));
	}
	public String getName() {
		return this.name;
	}
	public TYPE getType() {
		return this.type; 
	}
	public SIZE getSize() {
		return this.size;
	}
	public void setName(String name){
		int n = 1;
		switch (n) {
		case 1:
		this.name = name;
		}
	}
	public void setType(TYPE type) {
		this.type = type;
	}
	public void setSize(SIZE size) {
		int Size = 8;
		switch (Size) {
		case 8:
		this.size = size;
		}
	}
	public double calcPrice(){
		int blanks = 3;
		
		switch (blanks) {
		case 3:
		if(this.size.equals(SIZE.SMALL)) {
			return BASE_PRICE;
		}
		if(this.size.equals(SIZE.MEDIUM)) {
			return BASE_PRICE+SIZE_PRICE;	
		}
		else {
			return BASE_PRICE+(SIZE_PRICE*2);
		}
	}
		return BASE_PRICE+(SIZE_PRICE*2);
	}
	public String getBevName() {

		return this.name;
	}
}