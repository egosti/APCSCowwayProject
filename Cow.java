//represents farm objects
public class Cow extends FarmObject{
	private String name;
	private int hungriness;
	private int age;
	private int sicknessLevel;
	private int x;
	private int y;

	//constructs a cow with the given name and coordinates
	public class Cow(String name, int x, int y){
		this.name = name;
		this.x = x;
		this.y = y;
		hungriness = 0;
		age = 0;
		sickness = 0;
	}

	//method to move the cow 
	public static void move(){
		if(time > 6 && time < 18){ 
			this.x = x -1 + Math.rand(2);
			this.y = y -1 + Math.rand(2);
		}
	}

	//x coordinate
	public static int getX(){
		return this.x;
	}

	//y coordinate
	public static int getY(){
		return this.y;
	}

	//eats grass
	public static eatGrass(grass){
		grass = Math.rand(9) + 1;
		hungriness -= grass; 
	}
	
	//removes cows after they die 
	public static testForDeath() {
		if (hungriness >= 100 || age >= 90001) {
			remove();
		}
		double chance = 0.0001 * age * sicknessLevel;
		if (Math.random() < chance) {
			removeObject();
		}
	}

}
