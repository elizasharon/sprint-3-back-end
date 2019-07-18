import java.io.*;
public class SerializeDemo {
	public static void main(String [] args) {
		try {
			Person p1 = new Person();
			p1.name = "Sheldon";
			p1.age = 25;
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));
			out.writeObject(p1);
			out.close();
			System.out.println("Serialized Successfully");
			
		} catch (Exception e) {
			System.out.println(e);		
		}
		
	}
}