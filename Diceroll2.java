package Bridgelab.com;

public class Diceroll2 {
	public static void main(String[] args) {
//		System.out.println("Welcome to the  Snake & Ladder Game. ");
		//Variable declaring starting  position 
		int startPosition = 0;
		int rollDice = (int)Math.floor(Math.random()*10 %6+1);
		System.out.println("initial Position of the player :-" +startPosition);
		System.out.println("yay u got the number  :- "+rollDice);
	}

}
