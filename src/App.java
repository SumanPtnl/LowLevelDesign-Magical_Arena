import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int health,strength,attack;
		System.out.println("Enter Health Strength Attack values of Player 1");
		health=sc.nextInt();
		strength=sc.nextInt();
		attack=sc.nextInt();
		Player p1 = new Player(health,strength,attack);
		
		System.out.println("Enter Health Strength Attack values of Player 2");
		health=sc.nextInt();
		strength=sc.nextInt();
		attack=sc.nextInt();
		Player p2 = new Player(health,strength,attack);
		Game g= new Game(p1,p2);
		Player winner= g.startGame();
		if(winner==p1)
			System.out.println("Winner P1");
		else 
			System.out.println("Winner P2");
		sc.close();

	}

	

}
