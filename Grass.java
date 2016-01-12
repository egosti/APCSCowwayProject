//int for amount of grass
//Every hour, the amount of grass increases by 1.
//Every hour, has a 0.1*(amount of grass)% chance of creating another patch of grass in a random adjacent square that is not occupied by a cow (up/down/left/right).
import java.util.Random;
public class Grass extends FarmObject {

  protected int amount;
  protected int direction;
  
  public Grass(int amount) {
    this.amount = amount;
  }

  public void doStuffForAnHour(int hour) {
    this.amount += 1;
    Random rand = new Random();
    if (rand.nextDouble() < 0.1 * this.amount) {
      direction = rand.nextInt(3) + 1;
      if (direction = 1) {
	farm.addObject(new Grass(1), x, y - 1); //new Grass has amount 1, goes up
      } else if (direction = 2) {
	farm.addObject(new Grass(1), x, y + 1); //down
      } else if (direction = 3) {
	farm.addObject(new Grass(1), x - 1, y); //left
      } else {
	farm.addObject(new Grass(1), x + 1, y); //right
      } //still don't know what happens when object moves off coordinate grid
    }
  }

  
