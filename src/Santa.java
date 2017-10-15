import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;



public class Santa {
	
	private static Workshop SantasWorkshop = new Workshop();
	public Santa(){
		
	}
	
	public static Workshop getWorkshop(){
		return SantasWorkshop;
	}
	
	public static void deliverPresents(){
		
		int rideable = 0;
		int wrappedPresents = getWorkshop().getPresents().size() - getWorkshop().getUnwrappedPresents().size();
		
		for (Reindeer deer : getWorkshop().getReindeer()){
			if (deer.getHunger() <= 50) rideable++;
			
		}
		
		if (getWorkshop().getReindeer() != null && rideable >= 2 && wrappedPresents != 0){
			
			for (Reindeer deer : getWorkshop().getReindeer()){
				if (deer.getHunger() <= 50) deer.ride();
				
			}
			Set<Present> tempPresents = new HashSet<Present>();
			for (Present gift : getWorkshop().getUnwrappedPresents()){
				tempPresents.add(gift);
			}
			getWorkshop().getPresents().clear();
			
			for (Present unwrapped : tempPresents){
				getWorkshop().getPresents().add(unwrapped);
			}
		}
		
		if (rideable < 2) JOptionPane.showMessageDialog(null, "Santa needs at least 2 healthy reindeer to fly!");
		else if (wrappedPresents == 0) JOptionPane.showMessageDialog(null, "There are no wrapped presents in the workshop!");
		else  JOptionPane.showMessageDialog(null, "HO HO HO! Merry Christmas!\n" + wrappedPresents + " presents delivered");
		
	}
}
