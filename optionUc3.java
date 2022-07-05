package javapratice;

public class optionUc3 {
	public static void main(String[] args) {
		System.out.println("Welcome to Snake &Ladder Game ");
		// Variable declaring starting position
		int position = 0 ;
		int rollDice =(int)Math.floor(Math.random()*10 %6+1);
		System.out.println("Dice value  : " +rollDice);
		int option  =(int)Math.floor(Math.random()*10 %3+1);
		System.out.println("option : " +option);
		int Ladder = 1;
		int Snake =2;
		//int noplay =3;
		// loop condition 
		if (option==Ladder) {
			position =  position +  rollDice;			
		}
		else if (option==Snake) {
			 position =  position - rollDice;	
		} 
		else {
			position =  position +0;
		}
		System.out.println("The Current Position of the player : "  +position);
	}
}

	
