//The amount of poisoned grass increases by 2 every hour instead of 1.
//If a cow eats poisoned grass, it becomes sick, with sickness level equal to the amount of poisoned grass eaten.

public class PoisonedGrass extends Grass {

  public PoisonedGrass(int amount) {
    this.amount = amount;
  }

  public void doStuffForAnHour(int hour) {
    this.amount += 2;
  }

  public int getEaten(int amountEaten) {
    if (amountEaten > this.amount) { //cannot eat more than amount of grass
      this.amount = 0;
    } else {
      this.amount -= amountEaten; //subtracts amount eaten from total grass
    }
  }

}
