package co.grandcircus.labeight;

import java.util.Scanner;
import java.util.Arrays;

public class LabEight {

	private static Scanner scnr = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Welcome to our Java class. ");
		System.out.println("Which student would you like to learn more about? Enter a number from the list below. ");
		System.out.println("");
	
		
		String[] students = new String[10];
		for (int i = 0; i < students.length; i++) {
			System.out.println((i + 1) + ". " + students[i]);		
			
			students [0] = "Shirley";
			students [1] = "Elvis";
			students [2] = "Brad";
			students [3] = "Gwenyth";
			students [4] = "Mozart";
			students [5] = "Conor";
			students [6] = "Ruth";
			students [7] = "Barack";
			students [8] = "George";
			students [9] = "Stevie";
		}
		
		int userInput = scnr.nextInt();
		int index = userInput - 1;
		String userChoice = (students[index]);
		
		System.out.println("Student " + userInput + " is " + userChoice + ". " +
							"What would you like to know about " + userChoice + "? (Enter 'favorite hobby' or 'hometown'.)");
		String userPicks = scnr.nextLine();
		
		if (userPicks.equals("favorite hobby")) {
				String hobbyChoice;
				hobbies(hobbyChoice, userChoice);
				
		} else if (userPicks.equals("hometown")) {
				String homeTAssign;
				hometowns(userChoice, homeTAssign);
		} 
	}
		
	private static String hobbies(String hobbyChoice, String userChoice) {
				String[] favoriteHobby = new String[10];
						
						favoriteHobby [0] = "acting";
						favoriteHobby [1] = "singing";
						favoriteHobby [2] = "acting";
						favoriteHobby [3] = "acting";
						favoriteHobby [4] = "composing music";
						favoriteHobby [5] = "mixed martial arts";
						favoriteHobby [6] = "participating in social justice movements";
						favoriteHobby [7] = "public speaking";
						favoriteHobby [8] = "acting";
						favoriteHobby [9] = "performing music";
						
				int userInput = scnr.nextInt();
				int indexH = userInput - 1;
				hobbyChoice = (favoriteHobby[indexH]);
				System.out.println("In their spare time, " + userChoice + " likes " + hobbyChoice + ". " +
									"Would you like to know more? (y/n)");
				String userPicks = scnr.nextLine();
				
		if (userPicks.equals("y")) {
				String homeTAssign;
				hometowns(userChoice, homeTAssign);
		} else if (userPicks.equals("n")) {
				System.out.println("Goodbye. ");
				
				scnr.close();
		}
	}
				
	private static String hometowns(String userChoice, String homeTAssign) {
			
			String[] hometown = new String[10];
			
			hometown [1] = "Santa Monica, CA";
			hometown [2] = "Tupelo, MS";
			hometown [3] = "Shawnee, OK";
			hometown [4] = "Los Angeles, CA";				
			hometown [5] = "Salzburg, Austria";
			hometown [6] = "Dublin, Ireland";
			hometown [7] = "Brooklyn, New York";
			hometown [8] = "Honolulu, Hawaii";
			hometown [9] = "Lexington, KY";
			hometown [10] = "Saginaw, MI";
			
			int userInput = scnr.nextInt();
			int indexT = userInput - 1;
			homeTAssign = (hometown[indexT]);
			System.out.println(userChoice + " is originally from " + homeTAssign + ". " +
					"Would you like to know more? (y/n)");
						
			if (userPicks.equals("y")) {
				String homeTAssign;
				hometowns(userChoice, homeTAssign);
		} else if (userPicks.equals("n")) {
				System.out.println("Goodbye. ");
				
				scnr.close();
			
		} 
			
		/*if (input.equals("y")) {
		
		System.out.println("Enter 'hometown'. ");
		String homeTownInput = scnr.next();
		
	} else if (input.equals("n")) {
		System.out.println("Ok, goodbye! ");
	}*/
		
		
	}
	
	
		
		
	}	
	

