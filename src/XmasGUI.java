import java.awt.GridLayout;
import javax.swing.*;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class XmasGUI extends JFrame{


	private static JTextArea status;

	
	public XmasGUI(){
		final int FRAME_WIDTH = 700;
		final int FRAME_HIGHT = 400;
		
		JFrame frame = new JFrame();
	//	frame.setResizable(false);
		status = new JTextArea(Santa.getWorkshop().toString());
		status.setLineWrap(true);
		status.setWrapStyleWord(true);
		GridLayout grid = new GridLayout(7, 0);
		
		JButton toyMaker = new JButton("Create toy maker");
		JButton wrapper = new JButton("Create present wrapper");
		JButton feeder = new JButton("Create reindeer feeder");
		JButton reindeer = new JButton("Create hungry reindeer");
		JButton work = new JButton("Work");
		JButton deliver = new JButton("Deliver presents");
		
		
		toyMaker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event){
				Santa.getWorkshop().createToyMaker();
				updateStatus();
			}
			
		});
		
		wrapper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event){
				Santa.getWorkshop().createPresentWrapper();
				updateStatus();
			}
			
		});
		
		feeder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event){
				Santa.getWorkshop().createReindeerFeeder();
				updateStatus();
			}
			
		});
		
		reindeer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event){
				Santa.getWorkshop().createHungryReindeer();
				updateStatus();
			}
			
		});
		
		work.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event){
				Santa.getWorkshop().work();
				updateStatus();
			}
			
		});
		
		deliver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event){
				Santa.deliverPresents();
				updateStatus();
			}
			
		});
		
		JPanel panel = new JPanel();
		panel.add(status);
		panel.add(toyMaker);
		panel.add(wrapper);
		panel.add(feeder);
		panel.add(reindeer);
		panel.add(work);
		panel.add(deliver);
		panel.setLayout(grid);
		
		frame.add(panel);
		frame.setSize(FRAME_WIDTH, FRAME_HIGHT);
		frame.setTitle("Santa's Workshop");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);

	}
		
		
	private static void updateStatus(){
		status.setText(Santa.getWorkshop().toString());
	}
		
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		XmasGUI GUI = new XmasGUI();

	  
	}
}
