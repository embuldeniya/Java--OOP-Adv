package twentyOne;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileInput {

	public static void main(String[] args) {

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("d://serial.txt");
			ois = new ObjectInputStream(fis);
			
			System.out.println((Employee)ois.readObject());
	
		
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {

			try {
				ois.close();
				fis.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}
}
