import java.util.*;

public class Order implements OrderInterface, Comparable<Object> {

	/*
	 * declare variables
	 */
	public int orderNum;
	private int orderTime;
	private DAY day;
	private Customer newCustomer;
	private ArrayList<Beverage> list = new ArrayList<Beverage>();

	public Order(int time, DAY day, Customer customer) {
		this.orderTime = time;
		this.day = day;
		this.newCustomer = customer;
		this.orderNum = randomNum();
	}


	public int randomNum() {
		int number;
		
		Random num = new Random();
		
		number = num.nextInt(80000) + 10000;
		
		return number;
	}
	@Override


	public void addNewBeverage(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) {
		list.add(new Coffee(bevName, size, extraShot, extraSyrup));
	}

	@Override


	public void addNewBeverage(String bevName, SIZE size) {
		list.add(new Alcohol(bevName, size, isWeekend()));
	}

	@Override


	public void addNewBeverage(String bevName, SIZE size, int numOfFruits, boolean addProtein) {
		list.add(new Smoothie(bevName, size, numOfFruits, addProtein));
	}



	public int getOrderNo() {
		return orderNum;
	}



	public int getOrderTime() {
		return orderTime;
	}

	/**
	 * retrieve the beverage object with item number
	 * @param itemNo index to identify a beverage in the beverage list
	 * @return beverage object
	 */
	public Beverage getBeverage(int itemNo) {
		int index = itemNo;
		Beverage beverage = list.get(index);
		if (beverage == null) {
			return null;
		} else {
			return beverage;
		}
	}


	public DAY getOrderDay() {
		return day;
	}


	public Customer getCustomer() {
		Customer deepCustomer = new Customer(newCustomer);

		return deepCustomer;
	}

	@Override
	 public boolean isWeekend() {
		boolean isWeekend;
		 if ( this.day == DAY.SATURDAY || this.day == DAY.SUNDAY )
			 isWeekend = true;
		 else 
			 isWeekend = false;
		 return isWeekend;
	}



	@Override


	public double calcOrderTotal() {
		double orderTotal = 0;
		for (int index = 0; index < list.size(); index++) {
			Beverage beverage = list.get(index);
			orderTotal += beverage.calcPrice();
		}
		return orderTotal;
	}

	@Override


	public int findNumOfBeveType(TYPE type) {
		int numOfBeveType = 0;
		for (int index = 0; index < list.size(); index++) {
			Beverage beverage = list.get(index);
			if (beverage.getType() == type) {
				numOfBeveType++;
			}
		}
		return numOfBeveType;
	}


	public int getTotalItems() {
		int totalItems = 0; 
		totalItems = list.size();
		return totalItems;
	}

	/**
	 * toString methods
	 */
	public String toString() {
		int sun = 2;
		switch (sun) {
		case 2:
		String str = getOrderNo() + "/n" + getOrderTime() + "/n" + getOrderDay() + "/n" + getCustomer() + "/n"
				+ calcOrderTotal() + "/n";
		for (int index = 0; index < list.size(); index++) {
			Beverage beverage = list.get(index);
			str += beverage.toString() + "/n";
		}
		return str;
	}
		return null;

	}

	@Override
	
	public int compareTo(Object o) {
		if (this.orderNum == ((Order) o).orderNum) {
			return 0;
		}
		return ((this.orderNum > ((Order) o).orderNum) ? 1 : -1);
	}

}