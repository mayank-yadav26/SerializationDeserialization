package SerializationDeserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serial {

	public static void main(String[] args) {
		try {
			// create object of student
			Student student = new Student("mayank", "mayank@highradius.com", "mahaveer pura", 12);

			// write data to file
			FileOutputStream fos = new FileOutputStream("obj.txt");
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(student);
			oos.close();
			fos.close();
			System.out.println("Object state is transferred to file/Serialization");
			
			
		}
		catch(Exception exp) {
			System.out.println(exp.getStackTrace());
		}
	}

}
