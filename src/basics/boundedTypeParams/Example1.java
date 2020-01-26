package basics.boundedTypeParams;

/**
 * 
 * @author Rahul
 *
 *Bounded type parameters are useful when we want to restrict the user from passing any Type parameter to a certain set of
 *parameters . For ex- anything that implements Comparable.
 *
 *we can check for multiple types of bounds i.e. type parameters can have multiple bounds.
 * for ex - <T extends B1 & B2 & B3>
 */

public class Example1 {
	public static void main(String[] args) {
		System.out.println(calculateMin(2,1));
		System.out.println(calculateMin('a','v'));
		System.out.println(calculateMin("q","w"));
		System.out.println(calculateMin(new Person(),new Person()));
	}
	
	public static <T extends Comparable<T>> T calculateMin(T t1, T t2){
		if(t1.compareTo(t2)<0)
			return t1;
		
		return t2;
	}
}

class Person implements Comparable<Person>{

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}