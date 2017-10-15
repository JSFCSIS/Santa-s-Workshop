import java.util.*;



public class Workshop {

	private Set<Elf> Elves;
	private Set<Reindeer> Reindeer;
	private List<Present> Presents;
	

	public Workshop(){
		Elves = new HashSet<Elf>();
		Reindeer = new HashSet<Reindeer>();
		Presents = new ArrayList<Present>();
	}
	
	public void work(){
		for (Elf elf : Elves){
			elf.work();
		}
	}
	
	public List<Present> getUnwrappedPresents(){
		
		ArrayList<Present> unWrapped = new ArrayList<Present>(); 
		
		for (int i = 0; i < Presents.size(); i++){
			if (!Presents.get(i).isWrapped()){
				unWrapped.add(Presents.get(i));
				
			}
		}
		return unWrapped;
		
	}
	
	public String toString(){
		String workforceAndInventory = "Status: Elves: " + Elves.size() + "\npresents: " + Presents.size() + " -- unwrapped: "
									   + getUnwrappedPresents().size() + "\nreindeers: " + Reindeer.toString();  
		return workforceAndInventory;
	}
	
	public void addPresent(Present aPresent){
		Presents.add(aPresent);
		
	}
	
	public List<Present> getPresents(){
		List<Present> thePresents = Presents;
		return thePresents;
	}
	
	public void createToyMaker(){
		Elf toyMaker = new ToyMaker(Santa.getWorkshop());
		Elves.add(toyMaker);
	}
	
	public void createPresentWrapper(){
		Elf presentWrapper = new PresentWrapper(Santa.getWorkshop());
		Elves.add(presentWrapper);
	}
	
	public void createReindeerFeeder(){
		Elf reindeerFeeder = new ReindeerFeeder(Santa.getWorkshop());
		Elves.add(reindeerFeeder);
		
	}
	
	public void createHungryReindeer(){
		Reindeer reindeer = new Reindeer();
		Reindeer.add(reindeer);
	}
	
	public Set<Reindeer> getReindeer(){
		Set<Reindeer> theReindeer = Reindeer;
		return theReindeer;
		
	}	
	
}
