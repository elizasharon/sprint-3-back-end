import java.io.Serializable;

public class Person implements Serializable{
	String name;
	transient int age;
}