package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TargetFormListener implements ActionListener{

	ArrayList<TargetData> dataList;
	
	TargetFormListener(ArrayList<TargetData> dataList){
		this.dataList = dataList;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		TargetForm tf = new TargetForm(dataList);
	}

}
