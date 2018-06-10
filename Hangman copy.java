//I have neither give nor received any unauthorized aid on this assignment. --Lillie Atkins

import java.util.Random;

public class Hangman {

	private int numwords = 10, incorrect_guess_num = 0;
	private String[] words = new String[numwords];
	private String gameWord;
	private char[] dispArr = {'-','-','-','-','-','-','-'}; char[] incorrect_guess = new char[22];
	

	
	/*Method to display the hangman given the number of body parts to show
	 * Player gets at most 10 turns. */
	public void showMan(int numParts)
	{

		if (numParts == 0){	
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
		}
		if (numParts == 1){	
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
		}
		if (numParts == 2){	
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|        |");
			System.out.println("|        |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
		}

		if (numParts == 3){	
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|      __|");
			System.out.println("|        |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
		}
		if (numParts == 4){	
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|     o__|");
			System.out.println("|     	 |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
			}
		if (numParts == 5){
			
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|     o__|__");
			System.out.println("|     	 |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
			}
		if (numParts == 6){
			
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|     o__|__o");
			System.out.println("|     	 |");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
			}
		if (numParts == 7){
			
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|     o__|__o");
			System.out.println("|     	 |");
			System.out.println("|       /");
			System.out.println("|      /  ");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
			}
			
		if (numParts == 8){
			
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|     o__|__o");
			System.out.println("|     	 |");
			System.out.println("|       / \\");
			System.out.println("|      /   \\");
			System.out.println("|");
			System.out.println("|");
			System.out.println("____");
			}
			
		if (numParts == 9){
				
			System.out.println("________");
			System.out.println("|       |");
			System.out.println("|      ____");
			System.out.println("|     / .. \\");
			System.out.println("|    <   .  >");
			System.out.println("|     \\__^_/");
			System.out.println("|        |");
			System.out.println("|     o__|__o");
			System.out.println("|     	 |");
			System.out.println("|       / \\");
			System.out.println("|      /   \\");
			System.out.println("|    O/    ");
			System.out.println("|");
			System.out.println("____");
		
		}
		if (numParts == 10){
			
		System.out.println("________");
		System.out.println("|       |");
		System.out.println("|      ____");
		System.out.println("|     / .. \\");
		System.out.println("|    <   .  >");
		System.out.println("|     \\__^_/");
		System.out.println("|        |");
		System.out.println("|     o__|__o");
		System.out.println("|     	 |");
		System.out.println("|       / \\");
		System.out.println("|      /   \\");
		System.out.println("|    O/     \\O");
		System.out.println("|");
		System.out.println("____");
		}
		
	}
	
	/**
	  Sets the list of candidate words for the player to guess
	**/
	public void setDefaultWords()
	{
		
		this.words[0] = "notions";
		this.words[1] = "measure";
		this.words[2] = "product";
		this.words[3] = "foliage";
		this.words[4] = "garbage";
		this.words[5] = "minutes";
		this.words[6] = "chowder";
		this.words[7] = "recital";
		this.words[8] = "concoct";
		this.words[9] = "brownie";		
	}
	
	
	/*********************************************************
	 * Below are the setter and getter methods for this class. 
	 * You may not need to use methods but they are included
	 * since it is good practice to have them.
	 *********************************************************/

	/*
	 * Sets the number of words
	 */
	public void setNumWords(int num)
	{
		this.numwords = num;
	}
	
	
	/*
	 * Returns the number of words
	 */
	public int getNumWords()
	{
		return this.numwords;
	}
	

	/*
	 * Sets words array
	 */
	public void setWords(String[] w)
	{
		this.words = w;
	}
	
	
	/*
	 * Returns the array of words
	 */
	public String[] getWords()
	{
		return this.words;
	}

	
	/*
	 * Sets the game word
	 */
	public void setGameWord(String w)
	{
		this.gameWord = w;
	}
	
	
	/*
	 * Returns the game word
	 */
	public String getWord()
	{
		return this.gameWord;
	}


	/*
	 * Sets dispArr
	 */
	public void setDispArr(char[] dA)
	{
		this.dispArr = dA;
	}
	
	
	/*
	 * Returns dispArr
	 */
	public char[] getdispArr()
	{
		return this.dispArr;
	}


	/*
	 * This method takes nothing in, but returns the randomly selected words from the default words in array format.
	 */
	public String selectGameWord() {
		Random rando = new Random();
		setGameWord(this.words[rando.nextInt(9)]);
		return getWord();
	}
	
	/*
	 * This method updates and returns the current state of the word (as the player guesses).
	 */
	public void getCurrentWord(char g) {
		for(int i = 0; i<this.gameWord.length(); i++) {
			if(this.gameWord.charAt(i)==Character.toLowerCase(g))
				this.dispArr[i] = Character.toUpperCase(g);
		}
	}
		
	/*
	 * This method takes in the character guess and returns the letters have been incorrectly guessed.
	 */
	public char[] getIncorrectGuesses(char g) {
		int counter = 0;
		for(int i = 0; i<this.gameWord.length(); i++) {
			if(this.gameWord.charAt(i)!=Character.toLowerCase(g))
				counter+=1;
		}
		if(counter == gameWord.length()) {
			this.incorrect_guess_num+=2; //I add two every time because then I can subtract 1 off this number to put spaces between the incorrect letter guesses
			this.incorrect_guess[incorrect_guess_num-1] = ' '; //adds a space
			this.incorrect_guess[incorrect_guess_num]=Character.toUpperCase(g); //adds the letter
		}
		return this.incorrect_guess;
	}
	
	/*
	 * This method takes in nothing and returns the array incorrect_guesses, which has the letters that have been incorrectly guessed.
	 */
	public char[] getIncorrectGuesses() {
		return this.incorrect_guess;
	}
	
	/*
	 * This method takes in a character array and sets the array incorrect_guesses equal to it.
	 */
	public void setIncorrectGuesses(char[] n) {
		this.incorrect_guess = n;
	}
	
	/*
	 * This method takes in nothing and returns the integer counting the number of incorrect guesses.
	 */
	public int getNumIncorrectGuesses() {
		return this.incorrect_guess_num/2; //have divided by two because I am adding by two for every incorrect guess
	}
	
	/*
	 * This method takes in an integer, which the incorrect guesses number is set equal to and returns nothing.
	 */
	public void setNumIncorrectGuesses(int num) {
		this.incorrect_guess_num = num;
	}

}
	