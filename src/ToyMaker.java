
public class ToyMaker extends Elf{

	
	public ToyMaker(Workshop workshop){
		super(workshop);
		
		
	}
	
	public void work(){
			
		Present aPresent = new Present();
		workshop.addPresent(aPresent);
	}
}
