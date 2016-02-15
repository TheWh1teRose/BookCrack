package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;

public class FormSafeListener implements ActionListener{

	TargetForm tf;
	ArrayList<TargetData> dataList;
	
	FormSafeListener(TargetForm tf, ArrayList<TargetData> dataList){
		this.tf = tf;
		this.dataList = dataList;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(tf.forenameInput.getText() != null){
			TargetData FN = new TargetData(tf.forenameInput.getText(), "FN");
			dataList.add(FN);
			System.out.println("lol");
		}
		
		if(tf.nameInput.getText() != null){
			TargetData NA = new TargetData(tf.nameInput.getText(), "NA");
			dataList.add(NA);
			System.out.println(dataList.get(dataList.indexOf(NA)).getData());
		}
		
		
		
	}

}
