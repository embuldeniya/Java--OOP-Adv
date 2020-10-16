package twentyOne;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileOutput {

	public static void main(String[] args) {

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("d://serial.txt");
			oos = new ObjectOutputStream(fos);
			Employee emp = new Employee(1, "Sachin", 9999.99);
			oos.writeObject(emp);
			System.out.println("Object been saved ");
		
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {

			try {
				oos.close();
				fos.close();
				
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}
}
