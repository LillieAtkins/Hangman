//I have neither give nor received any unauthorized aid on this assignment. --Lillie Atkins

import java.util.Scanner;

public class HangmanDriver2 {
	
	public static Hangman game1 = new Hangman();
	public static Scanner scan = new Scanner(System.in);
	public static String choice, guess, play = "y", word;
	public static char g;
	public static char[] incorrect_letters = new char[22];
	public static int incorrect_guesses, last_incorrect = 0, correct_guesses = 0;
/*
 * This code runs a game of hangman.
 */
	public static void main(String[] args) {
		while(play.equals("y") || play.equals("Y")) {
			GameSetUp();
			while(incorrect_guesses<10) {
				getChoice();
				if(choice.equals("L") || choice.equals("l")) {
					LetterGuess();
					if(incorrect_guesses!= 11) //in case the user has guessed all of the correct letters
						feedbackforGuess();
				}
				else if(choice.equals("W") || choice.equals("w")) 
					WordGuess();	
			}
			if(incorrect_guesses == 10)
				System.out.println("You lose!\n" + word.toUpperCase());
			System.out.println("Play again: Yes (Y) or No (N)?");
			play = scan.nextLine();
			if(play.equals("y") || play.equals("Y")) {
				resetGame();
			}	
				
		}
		System.out.print("Goodbye!");
		scan.close();
	}

	/*
	 * This sets up a name game by calling the default array of words, calling the function to pick a random game word, 
	 * and setting up the display of the word and hangman that the user will see.
	 */
	public static void GameSetUp() {
		System.out.println("Welcome to Hangman!");
		System.out.println("Generating a secret word...");
		game1.setDefaultWords();  
		word = game1.selectGameWord();
		System.out.println("Here is your word: ");
		System.out.println(game1.getdispArr());
		game1.showMan(game1.getNumIncorrectGuesses()); 
		System.out.println("Incorrect Guesses:" + new String(incorrect_letters));
	}
	
	/*
	 * This method takes in nothing and returns nothing, but calls the function to get the letter from the user 
	 * and sees if that is correct or incorrect. If the number of correct guesses are equal to the word this method 
	 * ends the game.
	 */
	public static void LetterGuess() {
		g = getGuessL(); 
		game1.getCurrentWord(g);
		incorrect_letters = game1.getIncorrectGuesses(g);
		if(last_incorrect == game1.getNumIncorrectGuesses()) { //explained in read me document
			System.out.println("Correct!");
			int count = 0; //this count is explained in the next comment
			for(int i = 0; i < word.length(); i++) {
				if(Character.toLowerCase(g)==word.charAt(i))
					count++;
			}
			correct_guesses+=count; //set it up with count like this for double letters like in garbage so when you get a need to get correct + 2
			if(correct_guesses == word.length()) {
				System.out.println("You win!\n" + word.toUpperCase());
				incorrect_guesses = 11; //in order to end the game
			}	
		}
		else {
			System.out.println("Incorrect!");
			last_incorrect+=1;
			incorrect_guesses+=1; //the drivers internal count of incorrect guesses
		}
	}
	
	/*
	 * This method takes in nothing and returns nothing, but calls the functions that show the word in its current state,
	 * the man and that display the letters that have been incorrectly guessed.
	 */
	public static void feedbackforGuess() {
		System.out.println(game1.getdispArr());
		game1.showMan(game1.getNumIncorrectGuesses()); 
		System.out.println("Incorrect Guesses:" + new String(incorrect_letters));
	}
	
	/*
	 * This takes in nothing and returns nothing, but calls the function that gets the word guess from the user 
	 * and checks whether that word is right or wrong. 
	 */
	public static void WordGuess() {
		guess = getGuessW();
		if(guess.equals(word)) {
			System.out.println("Correct!\nYou win!\n" + word.toUpperCase());
			incorrect_guesses=11; //to end the game
		}
		else {
			System.out.println("Incorrect!\nYou lose!\n" + word.toUpperCase());
			incorrect_guesses = 11; //to end the game
		}
	}
	
	/*
	 * This function takes in nothing and returns nothing, but resets all of the values in both the driver 
	 * and the hangman class in order for the user to be able to play a new game.
	 */
	public static void resetGame() {
		incorrect_guesses = 0;
		correct_guesses = 0;
		last_incorrect = 0;
		game1.setNumIncorrectGuesses(0);
		char[] dispArr_reset = {'-','-','-','-','-','-','-'};
		game1.setDispArr(dispArr_reset);
		char[] incorrect_reset = new char[22];
		game1.setIncorrectGuesses(incorrect_reset);
		incorrect_letters = game1.getIncorrectGuesses();
	}
	
	/*
	 * This method takes in nothing and returns nothing, but asks the user whether they would like to input a word
	 * or a letter as a guess.
	 */
	public static void getChoice() {
		System.out.println("Type L to guess a letter or W to guess a word: ");
		choice = scan.nextLine();
	}
	
	/*
	 * This method takes in nothing, but asks the user to input their letter guess and returns this as a character.
	 */
	public static char getGuessL() {
		System.out.println("Enter your guess (as a single letter): ");
		String guess = scan.nextLine();
		return guess.charAt(0);
	}
	
	/*
	 * This method takes in nothing, but asks the user to input their word guess and returns this as a string.
	 */
	public static String getGuessW() {
		System.out.println("Enter your guess (as a word): ");
		String guess = scan.nextLine();
		return guess;
	}
	

}
