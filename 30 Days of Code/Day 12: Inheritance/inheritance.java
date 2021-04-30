 
import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName
			+ 	"\nID: " + idNumber);
	}

}

class Student extends Person{
    private int[] testScores;

    public Student(String firstName, String lastName, int id, int[] testScores){
        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    public char calculate(){
        OptionalDouble average = Arrays.stream(testScores).average();
        if(average.getAsDouble()<40) return 'T';
        else if (average.getAsDouble()<55) return 'D';
        else if (average.getAsDouble()<70) return 'P';
        else if (average.getAsDouble()<80) return 'A';
        else if (average.getAsDouble()<90) return 'E';
        else return 'O';
    }
}

class Solution {
