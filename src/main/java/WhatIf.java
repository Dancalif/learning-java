public class WhatIf {
	public static void main(String[] args) {
		
		//Declare variables
		int people = 20;
		int cats = 20;
		int dogs = 15;
		
		//Scenario when number of cats is more than people.
		if (people < cats) {
			//Return message.
			System.out.println("Too many cats! The world is doomed!");
		}
		//Scenario when number of people is more than cats.
		if (people > cats) {
			//Return message.
			System.out.println("Not many cats! The world is saved!");
		}
		//Scenario when number of people is less then dogs.
		if (people < dogs) {
			//Return message.
			System.out.println("The world is drooled on!");
		}
		//Scenario when number of people is more than dogs.
		if (people > dogs) {
			//Return message.
			System.out.println("The world is dry!");
		}
		//If number of people is less then dogs then no message and number of dogs should be increased by 5.
		dogs += 5;
		//Scenario when number of people is more then dogs.
		if (people >= dogs) {
			//Return message.
			System.out.println("People are greater or equal to dogs");
		}
		//Scenario when people less or equal to dogs.
		if (people <= dogs) {
			//Return message.
			System.out.println("People are less than or equal to dogs");
		}
		//Scenario when numbers of people and dogs are the equal.
		if (people == dogs) {
			//Return message.
			System.out.println("People are dogs.");
		}
	}
}