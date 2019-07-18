import java.util.*;
import java.io.*;
class A {

	public void abc() throws IOException, NullPointerException, UserException{
		int a = 50;
		for(int i=1;i<=20;i++){
			System.out.println(i);
			int res = a/(a-i);

			if(i == 150)
				throw new NullPointerException();
			if(i == 120)
				throw new IOException();
			if(i == 100)
				return;
			if(i == 80)
				throw new UserException("When i is 8");
			if(i == 6)
				throw new UserException("When i is 6");
			
		}
		
	}

	public void xyz() throws IOException, NullPointerException, UserException {

		abc();

	}

	public void atoz() throws IOException, NullPointerException, UserException {

		xyz();

	}
}

public class ExceptionDemo {

	public static void main(String[] args) {

		try {
			A a1 = new A();
			a1.atoz();
		} catch (IOException e) {
			System.out.println("IO Exception Occured!");
		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception Occured!");
		} catch (UserException e) {
			System.out.println("User Defined Exception Occured!");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Default Exception Occured!");
		} finally {
			System.out.println("BAZINGA");
		}

	}

}

class UserException extends Exception {

	public UserException() {

	}

	public UserException(String msg) {
		super(msg);
	}

	public void display() {
		System.out.println("Testing user defined functions");
	}
}