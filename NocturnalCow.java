//represents nocturnal cow 
public class NocturnalCow extends Cow {

	//method for transporting cow beween 6pm/am
	public static void move(){
  		if(time < 6 || time > 18) {
			this.x = x -1  Math.rand(2);
			this.y = y -1 + Math.rand(2);
		}
 	}
}
