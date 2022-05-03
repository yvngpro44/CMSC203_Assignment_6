public class Coffee extends Beverage{
	boolean extraShot; 
	boolean extraSyrup; 
	String name; 
	SIZE size;
	TYPE type = TYPE.COFFEE;

	public Coffee(String name, SIZE size, boolean extra_shot, boolean extra_syrup) {
		super(name, TYPE.COFFEE, size);
		this.extraShot = extra_shot;
		this.extraSyrup = extra_syrup; 
		this.name = name;
		this.size = size; 

	}
	
	
	public double getBasePrice() {
		return super.BASE_PRICE;
	}
	
	@Override
	public String toString() {
		String info = "";
		
		if (extraShot) {
			info = "Beverage Name: "+ getBevName()  + 
					"\nBeverage Size: " + getSize() + 
					"\nBeverage Price: " + calcPrice() +
					 " with extra shot";}
		
		else if (extraSyrup) {
			info = "Beverage Name: "+ getBevName()  + 
				"\nBeverage Size: " + getSize() + 
				"\nBeverage Price: " + calcPrice() +
				" with extra syrup";}
		
		else if (extraSyrup && extraShot ) {
			info = "Beverage Name: "+ getBevName()  + 
				"\nBeverage Size: " + getSize() + 
				"\nBeverage Price: " + calcPrice() +
				" with extra syrup and extra shot";}
		else 
			info = "Beverage Name: "+ getBevName()  + 
			"\nBeverage Size: " + getSize() + 
			"\nBeverage Price: " + calcPrice();
	
		return info;
		
	}
	@Override
	public double calcPrice(){
		double p = super.calcPrice();
		int amount = 0; 
		if(extraSyrup) {
			amount++; 
		}if(extraShot) {
			amount++;
		}
		return p+((0.50)*amount);
	}
	public String getBevName() {
		int num = 5;
		if(num==5) {
			return this.name;
		}
		return this.name;
	}

	public SIZE getSize() {

		return this.size;
	}

	public TYPE getType() {

		return this.type;
	}


	public boolean getExtraShot() {


		return extraShot;
	}


	public boolean getExtraSyrup() {

		return extraSyrup;
	}



	

}