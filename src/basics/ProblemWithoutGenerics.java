package basics;

public class ProblemWithoutGenerics {
	public static int add(int a,int b) {
		return a+b;
	}
	
	public static double add(double a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		//cannot call this add(1, 1.1);
		add(1, 11);
	}
}
