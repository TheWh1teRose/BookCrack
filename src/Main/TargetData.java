package Main;

public class TargetData {
	private String data;
	private String shortcut;
	
	TargetData(String data, String shortcut){
		this.data = data;
		this.shortcut = shortcut;
	}
	
	public String getData(){
		return data;
	}
	
	public String getShortcut(){
		return shortcut;
	}
}
