package Main;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TargetForm {
	
	JLabel forenameLable;
	JTextField forenameInput;
	JLabel nameLable;
	JTextField nameInput;
	JButton safe;
	
	ArrayList<TargetData> dataList;
	
	TargetForm(ArrayList<TargetData> dataList){
		
			this.dataList = dataList;
		
			JFrame jf = new JFrame("BookCrack - Targetform");
			jf.setVisible(true);
			jf.setSize(800,600);
			jf.setLocationRelativeTo(null);
			jf.setResizable(false);
			jf.setLayout(null);
			
			forenameLable = new JLabel("Forename");
			forenameLable.setBounds(20, 20, 70, 20);
			jf.add(forenameLable);
			
			forenameInput = new JTextField();
			forenameInput.setBounds(100, 20, 120, 20);
			jf.add(forenameInput);
			
			nameLable = new JLabel("Name");
			nameLable.setBounds(20, 50, 70, 20);
			jf.add(nameLable);
			
			nameInput = new JTextField();
			nameInput.setBounds(100, 50, 120, 20);
			jf.add(nameInput);
			
			safe = new JButton("SAFE");
			safe.setBounds(700, 500, 80, 30);
			safe.addActionListener(new FormSafeListener(this, dataList));
			jf.add(safe);
			
			jf.repaint();
	}
}
