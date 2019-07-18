interface I{
	public void abc();
}
interface J{
	public void xyz(String msg);
}
interface k{
	public int add(int a, int b);
}

public class LambdaDemo{
	public static void main(String[] args) {
		I i1 = ()-> System.out.println("From lambda function");
		i1.abc();
		
		J j1 = (msg)-> System.out.println("Got message "+ msg);
		j1.xyz("Bazingaa");
		
		k k1 = (a,b)->a+b;
		System.out.println(k1.add(10, 20));
	}
}