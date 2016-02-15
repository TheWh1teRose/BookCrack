package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JTextField;

public class Tier1ButtonListener implements ActionListener{

	JTextField path;
	
	Tier1ButtonListener(JTextField path){
		this.path = path;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		PassWriter writer = new PassWriter(new File(path.getText()));
		System.out.println(path.getText());
		writer.importMainPass();
		writer.closeWriter();
	}
}
