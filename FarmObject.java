//contains ints for x and y coordinates on the farm
//contains an abstract method doStuffForAnHour(int hour)
//contains method for removing object from the farm
public interface FarmObject {

  private Farm farm = null;
  private int x;
  private int y;

  public FarmObject() { //initial coordinates
    x = -1;
    y = -1;
  }
  
  public int getX() {
    return x;
  }
  
  public int getY() {
    return y;
  }
  
  public void doStuffForAnHour(int hour); //abstract method for actions every hour
  public void remove(Farm farm) { //remove from farm
    farm.remove(x, y);
    x = -1;
    y = -1;
  }

}
