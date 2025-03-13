# Proof of Concept:

Here I implemented a simple subscription mock application, where a user can hold a database of many
entertainment subscriptions. They can also keep track of their upcoming payments, and remove
subscriptions that they no longer have.
Each subscription has a start date where if a user enters subscriptions initially, they will 
add the start date as well. If the user adds any more subscripions moving forward, 
The program will compute the start date. 
An option to cancel a subscription is available, which creates an end date.


# Database Simulation:

A simple linked list was used to store a user obect which contains their name and login credentials,
as a string, and the subscription linkedlist which stores the subscription name, start date, and billing period, as a string, and it stores the price as a double.

# Application Simulation:

The use of a main function, along with initailizing two different types of user objects, giving user choices for navigation, and optional printing of results, showcase how this could be used in a real world setting. In a real world setting, more robust
implementations would be used for storing data such as hashmaps for log in credentials and o(1) access, decreyption for hiding password information, languages such as SQL for database storage, and/or searching algorithims to limit functionality overhead.

- Different parts of the code are commented out for testing purposes.
