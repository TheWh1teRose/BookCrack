package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PassWriter {
	
	FileWriter writer;
	
	PassWriter(File file){
		try {
			writer = new FileWriter(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void writePass(String password){
		try {
			writer.write(password);
			writer.write(System.getProperty("line.separator"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void importMainPass(){
		try {
			FileReader fr = new FileReader("C:/Users/felix/Desktop/most500Passwords.txt");
			BufferedReader br = new BufferedReader(fr);
			int lol = 0;
		    while(true){
		    	String line = br.readLine();
		    	lol++;
		    	if(line == null){
		    		break;
		    	}else{
		    		writePass(line);
		    	}
		    }

		    br.close();
		} catch (FileNotFoundException e) {e.printStackTrace();} catch (IOException e) {e.printStackTrace();}
	}
	
	public void closeWriter(){
		try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
