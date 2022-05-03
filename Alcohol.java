public class Alcohol extends Beverage{
	private boolean isServed;
	private static final double fee = 0.6;
	
	public Alcohol(String name, SIZE s, boolean served) {
		super(name, TYPE.ALCOHOL, s);
		this.setServedOnWeekends(served);
	}
	@Override
	public double calcPrice() {
		double price = 0;
		double m = 0;

		price += (isServed) ? fee : m;
		price +=  this.BASE_PRICE + ((SIZE.SMALL == this.getSize()) ? m : (SIZE.MEDIUM == this.getSize()) ? this.SIZE_PRICE: this.SIZE_PRICE*2); 
		
		return price;
	}
	
	public boolean equals(Alcohol alcohol) {
		return (this.getSize() == alcohol.getSize()) && (this.getBevName() == alcohol.getBevName()) 
				&& (this.getBevType() == alcohol.getBevType()) && (this.isServedOnWeekends() == alcohol.isServedOnWeekends());
	}
	
	public void setServedOnWeekends(boolean servedOnWeekends) {
		int x = 3;
		if (x==3) {
		this.isServed = servedOnWeekends;
	}
	}
	public boolean isServedOnWeekends() {
		return isServed;
	}	
	@Override
	public String toString() {
		String info = "";
		
		if (isServed) {
			info = "Beverage Name: "+ getBevName()  + 
					"\nBeverage Size: " + getSize() + 
					"\nBeverage Price: " + calcPrice() +
					 " is offered in the weekend";}
		
		else {
			info = "Beverage Name: "+ getBevName()  + 
			"\nBeverage Size: " + getSize() + 
			"\nBeverage Price: " + calcPrice() +
			 " is not offered in the weekend";
		}
	
		return info;
	}
	



	public double getBasePrice() {
		return super.BASE_PRICE;
	}
}