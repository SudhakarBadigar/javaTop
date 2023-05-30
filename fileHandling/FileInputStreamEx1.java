package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx1 {

	public static void main(String[] args) throws IOException {
		File f = new File("./sample.txt");
		f.createNewFile();
		
		FileInputStream fis = new FileInputStream(f);
		int asciicode;
		while((asciicode=fis.read()) != -1) {
			System.out.print((char)asciicode);
		}
		
		
		
		
//		for(int i=0;i<f.length();i++) {
//			System.out.print((char)fis.read());
//			}	
		fis.close();	
	}
	
}
