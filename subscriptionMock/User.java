package subscriptionMock;
import java.util.LinkedList;
public class User {
	//Defines private strings that can't be changed directly from tester by user
	//Can only be modified by its methods
	private String username, password, firstName, lastName; 
	private double monthlySubscriptionTotal, yearlySubscriptionTotal;
	private LinkedList subscriptionsList ;
	
	//Creates the user object and all of its attributes
	// They will need actual number values to compute dates
	public User(String username, String password, String firstName, String lastName, 
	double monthlySubscriptionTotal, double yearlySubscriptionTotal, LinkedList subscriptionList ){
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySubscriptionTotal = monthlySubscriptionTotal;
		this.yearlySubscriptionTotal = yearlySubscriptionTotal;
		this.subscriptionsList = null; 
		
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMonthlySubscriptionTotal() {
		return monthlySubscriptionTotal;
	}

	public void setMonthlySubscriptionTotal(double monthlySubscriptionTotal) {
		this.monthlySubscriptionTotal = monthlySubscriptionTotal;
	}

	public double getYearlySubscriptionTotal() {
		return yearlySubscriptionTotal;
	}

	public void setYearlySubscriptionTotal(double yearlySubscriptionTotal) {
		this.yearlySubscriptionTotal = yearlySubscriptionTotal;
	}

	public LinkedList getSubscriptionsList() {
		if(subscriptionsList == null) {
			subscriptionsList = new LinkedList();
		}
		return subscriptionsList;
	}

	public void setSubscriptionsList(LinkedList subscriptionsList) {
		this.subscriptionsList = subscriptionsList;
	}
	

}
