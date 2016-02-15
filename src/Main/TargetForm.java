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
	JLabel yearOfBirthLable;
	JTextField yearOfBirthInput;
	JLabel monthOfBirthLable;
	JTextField monthOfBirthInput;
	JLabel dayOfBirthLable;
	JTextField dayOfBirthInput;
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
			
			yearOfBirthLable = new JLabel("Year of birth");
			yearOfBirthLable.setBounds(20, 80, 70, 20);
			jf.add(yearOfBirthLable);
			
			yearOfBirthInput = new JTextField();
			yearOfBirthInput.setBounds(120, 80, 100, 20);
			jf.add(yearOfBirthInput);
			
			monthOfBirthLable = new JLabel("Month of birth");
			monthOfBirthLable.setBounds(20, 110, 100, 20);
			jf.add(monthOfBirthLable);
			
			monthOfBirthInput = new JTextField();
			monthOfBirthInput.setBounds(120, 110, 100, 20);
			jf.add(monthOfBirthInput);
			
			dayOfBirthLable = new JLabel("Day of birth");
			dayOfBirthLable.setBounds(20, 140, 100, 20);
			jf.add(dayOfBirthLable);
			
			dayOfBirthInput = new JTextField();
			dayOfBirthInput.setBounds(120, 140, 100, 20);
			jf.add(dayOfBirthInput);
			
			safe = new JButton("SAFE");
			safe.setBounds(700, 500, 80, 30);
			safe.addActionListener(new FormSafeListener(this, dataList));
			jf.add(safe);
			
			jf.repaint();
	}
}
