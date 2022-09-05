import java.util.Random;

public class Animal extends Thread implements Runnable {
	String name;
	int position;
	int speed;
	int max_rest;
	private Food food;
	private static boolean winnerWinner = false;
	Random rn_val = new Random();
	
	public Animal(String name,int position,int speed, int max_rest,Food food) {
		this.name = name;
		this.position = position;
		this.speed = speed; 
		this.max_rest = max_rest; 
		this.food = food; 
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getMax_Rest() {
		return max_rest;
	}

	public void setRestMax(int max_rest) {
		this.max_rest = max_rest;
	}
	
public static void main(String[] args) {
		Food afood= new Food();
	
		Animal rabbit = new Animal("Mr.Rabbit", 0,5,150,afood);
		Animal turtle= new Animal("Mr.Turtle", 0,3,100,afood);
		
		rabbit.setDaemon(false);
		turtle.setDaemon(false);
		
		rabbit.start();
		turtle.start();
	}

	@Override
	public void run() {
		while (this.position <= 100 && !winnerWinner) {
			try {
				long randomRestT = rn_val.nextInt(max_rest);
				Animal.sleep(randomRestT);
				food.eat(name);
				position += speed;
				System.out.println( this.name + "'s Current Position:" + this.position);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
			if (position >= 100) {
				winnerWinner = true;
				System.out.println("The Race is OVER!!!");
				System.out.println("1st place Winner: " + this.name);
			}
		}
	}


}
