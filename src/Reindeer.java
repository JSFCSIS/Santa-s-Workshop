
public class Reindeer {

	private int hunger;
	
	public Reindeer(){
		
		hunger = 50;
		
	}
	public int getHunger(){
		return hunger;
	}
	
	
	public boolean isFull(){
		if (hunger == 0) return true;
		else return false;
	}
	
	
	public void feed(){
		hunger = hunger - 5;
		
	}
	
	
	public void ride(){
		hunger = hunger + 50;
	}
	
	public String toString(){
		return "Reindeer - " + hunger + "% hungry";
	}
}
