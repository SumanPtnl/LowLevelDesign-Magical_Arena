import java.util.Scanner;

public class Game {
	Player p1,p2;
	Game(Player p1,Player p2){
		this.p1=p1;
		this.p2=p2;
	}
	public Player startGame() {
		Player currentPlayer = getCurrentPlayer(p1,p2);
		Scanner sc = new Scanner(System.in);
		String a;
		do {
			if(currentPlayer==p1) {
				System.out.println("Player 1 ATTACKS---- Player 2 defends");
				System.out.println("Player 1 press enter to attack");
				a=sc.nextLine();
				int healthLoss= p1.attacking()-p2.defending();
				if(healthLoss>0)p2.setHealth(p2.getHealth()-healthLoss);
				currentPlayer=changeCurrentPlayer(p1);
			}
			else {
				System.out.println("Player 2 ATTACKS---- Player 1 defends");	
				System.out.println("Player 2 press enter to attack");
				a=sc.nextLine();
				int healthLoss= p2.attacking()-p1.defending();
				if(healthLoss>0)p1.setHealth(p1.getHealth()-healthLoss);
				currentPlayer=changeCurrentPlayer(p2);
			}
			System.out.println();
			System.out.println("Player 1 Health-"+p1.getHealth()+"     Player 2 Health-"+p2.getHealth());
			System.out.println();
			System.out.println();
		}while(p1.getHealth()>0 && p2.getHealth()>0);
		sc.close();
		if(p1.getHealth()==0) {
			return p2;
		}
		else 
			return p1;
	}
	private Player changeCurrentPlayer(Player p) {
		if(p == p1) return p2;
		else return p1;
	}
	private static Player  getCurrentPlayer(Player p1, Player p2) {
		if(p1.getHealth()<=p2.getHealth()) {
			return p1;
		}
		else return p2;
	}	
}
