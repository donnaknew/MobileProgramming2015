package kc.ac.kookmin.exception.intro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AAA {
	public void readFile(){
		BufferedReader inputStream = null;
		String s="";
		try{
			String path = AAA.class.getResource("").getPath();
			System.out.println(path);
			
			inputStream = new BufferedReader(new FileReader(path+"a.txt"));
			
			while((s=inputStream.readLine()) != null){
				System.out.println(s);
			}
		}catch(IOException e){
			System.out.println(e);
		}finally {
			fileClose(inputStream);
		}
	}
	public void fileClose(BufferedReader inputStream){
		try{
			inputStream.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}
}
