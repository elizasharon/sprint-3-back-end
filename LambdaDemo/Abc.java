public class Abc {
	public static void main(String [] args) throws Exception {
		Class c1 = Class.forName("LambdaDemo$1");
		Object obj = c1.newInstance();
		System.out.println(obj);
	}
}