package subscriptionMock;
import java.util.LinkedList;
import java.util.Scanner;
public class mockInterface {


	public static void main(String[] args) {
		//Declares a subscription list for RemanoCampbell object attribute
		LinkedList<Subscription> subscriptionList = new LinkedList();
		
		
		//Initializes Shirley's example subscription
		Subscription shirleySubscription = new Subscription("Crunchyroll", "2024-09-09", "N/A", "N/A", "Monthly", 7.99 );
		
		//Declares a subscription list for ShirleyTemple object attribute
		LinkedList<Subscription> subscriptionList2 = new LinkedList();
		//Adds Shirley's Subscription to her list
		subscriptionList2.add(shirleySubscription);
		
		//Declares list for all users to be stored
		LinkedList<User>usersList = new LinkedList();
		
		//Declares an int that will be used for user's choice in the application
		int option;
		
		//tier is "yearly" or "monthly"
		
		//Declares some of the attributes for manipulation
		String subscriptionName, tier, choice, startDate = "N/A", endDate = "N/A", currentSub, userName, password;
		double subscriptionPrice, monthlyTotal = 0, yearlyTotal = 0;
		
		
		//Declares variable to determine the current user using the application
		User currentUser = null; 
		
		//Declares subscription object for when a user wants to add a new subscription
		Subscription newSubscription;
		
		//Initalizes two users for testing cases
		User ShirleyTemple = new User("Shirley99", "ZigglyBop", "Shirley", "Temple", 0, 0, subscriptionList2 );
		User RemanoCampbell = new User("Ray_6", "Dextro9*", "Remano", "Campbell", 0, 0 , subscriptionList = null );
		
		//Adds users to the user list to use their information in the application
		usersList.add(RemanoCampbell);
		usersList.add(ShirleyTemple);
		
		
		//Mock User interface with choices 
		System.out.println("Welcome to your subscription tracker!\nPlease log in with your user info"
				+ "\nUser name:");
		Scanner scanner = new Scanner(System.in);
		userName = scanner.nextLine();
		System.out.println("Please enter your password:");
		password = scanner.nextLine();
		
		//Searches for user based on log in criteria
		//if they aren't in the database, the program will go back to/stay at log in screen and say "Incorrect Username or password"
		for(User User: usersList) {
			System.out.println(User.getUsername() + " " + User.getPassword());
			if(User.getUsername().equals(userName) && (User.getPassword().equals(password))) {
				currentUser =  User;
			}

		}
		if(currentUser== null) {
			System.out.println("Username or password incorrect");
			main(args);
		}
		//Asks user what they would like to do with their info
		System.out.println("What would you like to do today?"
				+"\nCancel a subscription(1)" + "\nAdd a new subscription(2)"
				+ "\nSee my next payment(3)"
				+"\nSee my monthly total(4)" + "\nSee my yearly total(5)"
				+ "\nChange tier(6)" + "\nLog out(7)" + "\n\nEnter your option number"
				);
		option = scanner.nextInt();
		switch(option) {
		
		//Cancel Subscription
		//Tests against Shirley who has a subscription
		case 1:

			
				if(subscriptionList2!=null) {
					//Ask which subscription to cancel and shows a list of current subscriptions
					System.out.println("Which subscription would you like to cancel?"
							+"\n");
					for(Subscription Subscription: subscriptionList2) {
						System.out.println(Subscription.getName()+ ":" + Subscription.getTier() + ":" + "$" + Subscription.getPrice());
					}
					//Makes the input the subscription to delete
					currentSub = scanner.next();
					
					//Removes the Subscription
					for(Subscription Subscription: subscriptionList2) {
						if(Subscription.getName().equals(currentSub)) {subscriptionList2.remove(Subscription);}
						
					}
				}
				
                //If no subscription found, message will print
				else {
					System.out.println("There are no current subscriptions");
				}
		    break;
		    
		//Add subscription
		//Tests against Remano0
		case 2:
			//Retrieves the info to make a subscription object to add th the user's subscription list
			
			//Retrieves name
			System.out.println("What is the name of the subscription you would like to add?");
			subscriptionName = scanner.next();
			
			//Retrieves price
			System.out.println("What is the price?");
		    subscriptionPrice = scanner.nextDouble();
			
		    //Retrieves start date
			System.out.println("Did you start this subscription today?");
			choice = scanner.next();
			if(choice.equals("Yes")) {
				//generate startdate
				//set start date
				
			}
			if(choice.equals("No")) {
				System.out.println("please enter the start date in yyyy-MM-DD format");
				startDate = scanner.next();
				
			}
			
			//Retrieves Term
			System.out.println("Is this a monthly or yearly subscription?");
			tier = scanner.next();
			
			//Cretaes the subscription object with the give info
			newSubscription = new Subscription(subscriptionName, startDate, endDate , "N/A", tier, subscriptionPrice);
			
			//Makes global LinkedList variable(subscriptionList) equal to user's list if initially null
			subscriptionList = RemanoCampbell.getSubscriptionsList();
			//Adds the new subscription to the list
			subscriptionList.add(newSubscription);
			
			
			//Test case to see if Subscription added properly
			for(Subscription Subscription: subscriptionList) {
				System.out.println(Subscription.getName()+ ":" + tier + ":" + "$" + subscriptionPrice);
			}
			
			
			break;
			
			//Generate next payment term using today's date + year or month days with the current day - start day
			// may need abs val for day 
			// if res is neg add abs val of that to current day
			
        //Next term payment calculation				
//		case 3:
//			System.out.println("Next Term Payments:");
//			for(Subscription Subscription: subscriptionList) {
//				
//				
//			}
//			
//		//Current Month subscription total calculation		
//		case 4:
			//Has to see whether subscription's tier is monthly and if the month = current month
//			for(Subscription Subscription: subscriptionList) {
//				monthlyTotal += Subscription.getPrice();
//				
//			}
//		//yearly subscription total		
		case 5:
			for(Subscription Subscription: subscriptionList) {
				yearlyTotal += Subscription.getPrice();
				
			}
			
		//Change tier	
		case 6:
			System.out.println("Which subscription would you like to change the tier for?");
			for(Subscription Subscription: subscriptionList2) {
				System.out.println(Subscription.getName()+ ":" + Subscription.getTier() + ":" + "$" + Subscription.getPrice());
			}
			
			//Makes input the subscription to update tier
			currentSub = scanner.next();
			
			//Searches for subscription
			for(Subscription Subscription: subscriptionList2) {
				if(Subscription.getName().equals(currentSub)){
					System.out.println("Change to monthly or yearly?");
					tier = scanner.next();
					//Sets the tier to the new input
					Subscription.setTier(tier);
					System.out.println("What is the new price?");
					subscriptionPrice = scanner.nextDouble();
					//Sets price for new tier
					Subscription.setPrice(subscriptionPrice);
					break;
				}
				
				
			}
			//Prints the updated subscriptions(Test)
			for(Subscription Subscription: subscriptionList2) {
				System.out.println(Subscription.getName()+ ":" + Subscription.getTier() + ":" + "$" + Subscription.getPrice());
			}
			break;
		
		//Log out - Exits Program
		case 7: 
			System.exit(0);
			
				
				
				
			}



		}
		}
		
	
	

			
		
		
