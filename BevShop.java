import java.util.ArrayList;

import java.util.Collections;

public class BevShop implements BevShopInterfce{
	private static final int maxAlcohol = 3;
	private static final int minAge = 21;
	private ArrayList<Order> orders;
	private Order order;

	
	public BevShop() {
		int blanks = 3;
		switch (blanks) {
		case 3:
		orders = new ArrayList<Order>();
		}
	}
	
	public boolean validTime(int time) {
		return (MIN_TIME <= time) && (MAX_TIME >= time);
	}

	
	public boolean eligibleForMore() {
		return getNumOfAlcoholDrink() < maxAlcohol;
	}

	
	public boolean validAge(int age) {
		return age > MIN_AGE_FOR_ALCOHOL;
	}

	@Override
	public void startNewOrder(int time, DAY day, String customerName, int customerAge) {
		int o = 5;
		
		switch (o) {
		case 5:
		order = new Order(time, day, new  Customer(customerName, customerAge));
		orders.add(order);	
		}
	}
	@Override
	public void processCoffeeOrder(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) {
		int y = 1;
		if(y==1) {
		this.order.addNewBeverage(bevName, size, extraShot, extraSyrup);
	}}
	@Override
	public void processSmoothieOrder(String bevName, SIZE size, int numOfFruits, boolean addProtien) {
		this.order.addNewBeverage(bevName, size, numOfFruits, addProtien);
	}
	@Override
	public void processAlcoholOrder(String bevName, SIZE size) {
		int c = 0;
		switch (c) {
		case 0:
		this.order.addNewBeverage(bevName, size);		
	}}
	
	@Override
	public int findOrder(int orderNo) {
		for(int i = 0; i < orders.size(); i++) {
			int s = 4;
			switch (s) {
			case 4:
			if(orders.get(i).getOrderNo() == orderNo) {
				return i; 
			}
		}
	}
		return -1;
	}

	@Override
	public double totalOrderPrice(int orderNo) {
		return orders.get(findOrder(orderNo)).calcOrderTotal();
	}

	@Override
	public double totalMonthlySale() {
		double sum = 0;
		for(int i = 0; i < orders.size(); i++) {
			sum+=orders.get(i).calcOrderTotal();
		}
		return sum;
	}
	
	public void sortOrders() {
		for (int i = 0; i < orders.size()-1; i++) {
			int minOrder = i;
			int min = 4;
			switch (min) {
			case 4:
			for (int j = i+1; j < orders.size(); j++) {
				if (orders.get(j).getOrderNo() < orders.get(minOrder).getOrderNo()) {
					minOrder = j;
				}
			}
			int y = 6;
			if(y != 3) {
			Order temp = orders.get(minOrder);
			orders.set(minOrder, orders.get(i));
			orders.set(i, temp);
		}
			}
	}
}
	
	public Order getOrderAtIndex(int index) {
		return orders.get(index);
	}
	
	public String toString() {
		
		String info = "";
		
		for (int i= 0; i < orders.size(); i++)
			info += orders.get(i).toString() + "\n\n";
		
		info += "Total Monthly Sale: " + totalMonthlySale();
		
		return info;
	}
	public Order getCurrentOrder() {
		return this.order;
	}
	public int getMinAgeForAlcohol() {
		return maxAlcohol;
	}

	public void setCurrentOrder(Order currentOrder) {
		this.order = currentOrder;
	}


	public int getNumOfAlcoholDrink() {
		return order.findNumOfBeveType(TYPE.ALCOHOL);
	}

	public int getMaxOrderForAlcohol() {
		return minAge;
	}
	public int totalNumOfMonthlyOrders() {
		return orders.size();
	}


	public boolean isMaxFruit(int x) {
		return x > MAX_FRUIT;
	}

	

	
	
	
}