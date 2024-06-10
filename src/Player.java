import java.util.*;

public class Player {
	private int health,strength,attack;
	Player(int health,int strength,int attack){
		this.health=health;
		this.strength=strength;
		this.attack=attack;
		}
	
	public int attacking () {
		 Random random = new Random();
	     int randomNumber = random.nextInt(6) + 1;
	     System.out.println("Attacking value ="+randomNumber*attack);
	     return randomNumber*attack;
	}
	
	public int defending() {
		Random random = new Random();
	     int randomNumber = random.nextInt(6) + 1;
	     System.out.println("Defending value ="+randomNumber*strength);
	     return randomNumber*strength;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		if(health<=0) this.health=0;
		else
			
			this.health = health;
	}

	public int getStrength() {
		return strength;
	}

	public int getAttack() {
		return attack;
	}

	
}
