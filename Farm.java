//contains a 2D array of FarmObject objects representing the coordinate grid of the farm (empty squares represented by a null object)
//contains an array of FarmObject objects representing all the existing FarmObject objects
public class Farm {

  private FarmObject[][] mGrid = null;
  private FarmObject[] mListOfObjects = null;
  private int mMaxObjects; //max objects you want
  private int mNumObjects; //current number of objects
  private int mGridSize; //side length of square 2D array
  
  public Farm(int gridSize, int maxObjects) { //creates a new Farm in the world
    mGridSize = gridSize;
    mNumObjects = 0;
    mMaxObjects = maxObjects;
    listOfObjects = new FarmObject[mMaxObjects]; //1D array
    grid = new FarmObject[mGridSize][mGridSize]; //2D array of FarmObjects
  }

  public boolean addObject(FarmObject object, int x, int y) { //method to add an object to the farm at given coordinates
    if (mNumObjects > mMaxObjects) { //number of objects cannot exceed capacity of farm
      System.out.println("Farm is full");
      return false;
    }
    if (mGrid[x][y] != null) { //cannot put two objects in same location
      System.out.println("Object exists here");
      return false;
    }
    mListOfObjects[mNumObjects] = object; //successfully add object
    mNumObjects += 1;
    return true;
  }

  public void remove(int x, int y) { //method to remove an object
    mGrid[x][y] = null;
  }
  
}
