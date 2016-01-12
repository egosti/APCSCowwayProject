public class FlyingCow extends Cow {
	
  //constructs a flying cow with given name and coordinates
  public FlyingCow(String name, int x, int y) {
  	super(name, x, y);
  }
  
  //method for moving flying cow
  public static void move(){
  	if(time > 6 && time < 18){
		this.x = Math.rand(coordinates.length);
		this.y = Math.rand(coordinates.length);
	}
   }

}
