
public class ReindeerFeeder extends Elf{

	public ReindeerFeeder(Workshop workshop){
		super(workshop);
	}
	
	public void work(){
		
		for(int i = 0; i < 3; i++){
			if(findHungriest() != null && !findHungriest().isFull()) findHungriest().feed();
		}
	}
	
	private Reindeer findHungriest(){
		
		if (workshop.getReindeer().size() == 0) return null;
		boolean firstDeer = true;
		Reindeer hungriest = null;
		for (Reindeer deer : workshop.getReindeer()){
			if (firstDeer){
				hungriest = deer;
				firstDeer = false;
			}
			if (deer.getHunger() > hungriest.getHunger()){
				hungriest = deer;
				
			}
		}
		
		return hungriest;
		
	}
}
