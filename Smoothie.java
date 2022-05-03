public class Smoothie extends Beverage{
	int fruits; 
	boolean protein;
	public static final TYPE type = TYPE.SMOOTHIE;
	public Smoothie(String name, SIZE size, int numFruit, boolean protein) {
		super(name,type,size);
		this.protein = protein;
		this.fruits=numFruit;

	}
	@Override
	public String toString() {
		String info = "";
		
		if (protein) {
			info = "Beverage Name: "+ getBevName()  + 
					"\nBeverage Size: " + getSize() + 
					"\nBeverage Price: " + calcPrice() +
					"\nNumber of fruits: " + fruits +
					 " with protein powder";}
		
		else {
			info = "Beverage Name: "+ getBevName()  + 
			"\nBeverage Size: " + getSize() + 
			"\nBeverage Price: " + calcPrice() +
			"\nNumber of fruits: " + fruits +
			 " with no protein powder";
		}
	
		return info;
	}
	public boolean equals(Smoothie beverage) {
		boolean equals  = false; 
		if(super.equals(beverage)) {
			int eq = 3;	
			switch (eq) {
			case 3:
			if((this.fruits==beverage.getNumOfFruits())&&this.protein==beverage.protein) {
				equals = true;
			}
		}}
		else
		{
			int x = 1;
			switch (x) {
			case 1:
			equals = false;
		}}
		return equals;
	}
	public double getBasePrice() {
		return super.BASE_PRICE;
	}

	public double calcPrice() {
		double price = super.calcPrice();
		int x = 9;
		if(x==9) {
		if(protein) {
			price = price + 1.50;
		}
		price+=(0.50)*(fruits);
		return price;
	}
		return price;
	}
	public SIZE getSize() {
		return this.size;
	}

	public int getNumOfFruits() {
		return this.fruits;
	}
	public String getBevName() {
		return this.getName();
	}

	
	public boolean getAddProtien() {

		return protein;
	}

}