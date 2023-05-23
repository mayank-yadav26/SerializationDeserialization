package SerializationDeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserial {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("obj.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student student = (Student)ois.readObject();
			System.out.println(student.getName());
		}catch(Exception exp) {
			System.out.println(exp.getStackTrace());
		}
	}
}
