import java.io.*;
public class DeserializeDemo {
	public static void main(String [] args) {
		try {
			
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"));
			Person p1 = (Person)in.readObject();
			in.close();
			System.out.println("Name : "+ p1.name + " Age : "+ p1.age);
			System.out.println("Deserialized Successfully");
			
		} catch (Exception e) {
			System.out.println(e);		
		}
		
	}
}