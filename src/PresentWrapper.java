
public class PresentWrapper extends Elf {

	public PresentWrapper(Workshop workshop){
		super(workshop);
	}
	
	public void work(){
		if (getNextUnwrappedPresent() != null) getNextUnwrappedPresent().setWrapped(true);
	}
	
	private Present getNextUnwrappedPresent(){
			
		if (workshop.getUnwrappedPresents().size() == 0) return null; 
			return workshop.getUnwrappedPresents().get(0);
		

	}
}
