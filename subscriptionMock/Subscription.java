package subscriptionMock;

public class Subscription {
	
	private String name, startDate, endDate, nextPaymentTerm, tier;
	private double price;
	public Subscription(String name, String startDate, String endDate, String nextPaymentTerm, String tier, double price ) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.nextPaymentTerm = nextPaymentTerm;
		this.tier = tier;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getNextPaymentTerm() {
		return nextPaymentTerm;
	}
	public void setNextPaymentTerm(String nextPaymentTerm) {
		this.nextPaymentTerm = nextPaymentTerm;
	}
	public String getTier() {
		return tier;
	}
	public void setTier(String tier) {
		this.tier = tier;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}

