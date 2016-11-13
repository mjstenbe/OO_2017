/*
 * This is a simple program to demonstrate some topics discussed in class: Variables, Data types, String concatenation
 */
public class Variables {
	public static void main(String[] args) {
		int yearOfBirth;
		int currentYear;
		int age;
		
		String firstName;
		String lastName;
		
		yearOfBirth = 1983;
		currentYear = 2016;
		
		firstName = "Robert";
		lastName = "Smith";
		
		age = currentYear - yearOfBirth;
		
		System.out.println(currentYear);  //output 1
		System.out.println(currentYear - yearOfBirth); //output 2
		System.out.println(firstName); //output 3
		System.out.println(firstName + " " + lastName + " is " + age + " years old"); //output 4
	}

}
