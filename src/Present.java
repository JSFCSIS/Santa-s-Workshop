
public class Present {

	private boolean wrapped;
	
	public Present(){
		wrapped = false;
	}
	
	public boolean isWrapped(){
		
		if (wrapped) return true;
		else return false;
	}
	
	public void setWrapped(boolean b){
		wrapped = b;
	}
}
