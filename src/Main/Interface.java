package Main;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interface {

	JLabel header;
	JButton form;
	JTextField fileInput;
	JButton createTier1;
	
	ArrayList<TargetData> dataList;
	
	Interface(ArrayList<TargetData> dataList){
		
		this.dataList = dataList;
		
		JFrame jf = new JFrame("BookCrack");
		jf.setVisible(true);
		jf.setSize(400,550);
		jf.setDefaultCloseOperation(3); //Exit on close == 3
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.setLayout(null);
		
		header = new JLabel("BookCrack");
		header.setBounds(50, 60, 500, 40);
		Font schrift = header.getFont().deriveFont(Font.BOLD, 40);
		header.setFont(schrift);
		jf.add(header);
		
		form = new JButton("Targetform");
		form.setBounds(30, 120, 120, 25);
		form.addActionListener(new TargetFormListener(dataList));
		jf.add(form);
		
		fileInput = new JTextField("C:/Users/felix/Desktop/Tier1PasswordList.txt");
		fileInput.setBounds(30, 150, 250, 25);
		jf.add(fileInput);
		
		createTier1 = new JButton("Tier 1");
		createTier1.setBounds(300, 150, 80, 25);
		createTier1.addActionListener(new Tier1ButtonListener(fileInput));
		jf.add(createTier1);
		
		jf.repaint();
	}
	
}
