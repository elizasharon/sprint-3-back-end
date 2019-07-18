import java.io.*;

public class IODemo2 {
	public static void main(String[] args) {
		try {
			RandomAccessFile rAccessFile = new RandomAccessFile("abc.txt", "rw");
			rAccessFile.seek(rAccessFile.length());
			rAccessFile.writeBytes("SHELDON COOPER");
			rAccessFile.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}