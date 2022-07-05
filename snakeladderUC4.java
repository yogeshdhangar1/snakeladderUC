package snakeladder;

public class snakeladderUC4 {
	public static void main(String[] args) {
		System.out.println("Welcome to Snake & Ladder Game");
		//Variable declaring position of player
		int position = 0;
		int Ladder = 1;
		int Snake =2;
		//int noplay =3;
		int WinPosition = 100;
		int currentPosition = 0;
		System.out.println("initial position of the player :-"   +position);
		while (position<WinPosition) {
			int rollDice = (int)Math.floor(Math.random()*10 %6+1);
			int option = (int)Math.floor(Math.random()* 10 %3)+1;
			System.out.println("Dice Value : "    +rollDice);
			System.out.println("Your option is : " +option);
			if (option==Ladder) {
				position =  position +  rollDice;			
			}
			else if (option==Snake) {
				if(position-rollDice<0) {
					System.out.println("The current Position of the player = " +position);
					continue;
					}
				 position =  position - rollDice;	
			} 
			else {
				position =  position +0;
			}
			
			System.out.println("The current Position of the player = " +position);
		}
	}
}     
