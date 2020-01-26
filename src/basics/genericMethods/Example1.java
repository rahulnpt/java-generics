package basics.genericMethods;

import java.util.stream.IntStream;

public class Example1 {
	public static void main(String[] args) {
		GenericMethod genericMethod = new GenericMethod();
//the same method can work for all possible types
		genericMethod.showItem("aa");
		genericMethod.showItem('H');
		genericMethod.showItem(12);
		genericMethod.showItem(1.2);
		
		String stringVal = genericMethod.returnExample("String");
		Integer integerVal = genericMethod.returnExample(11);
		System.out.println(stringVal+" "+integerVal);
		
		Integer[] intArray = {1,2,3,4,5,6};
		
		Double[] doubleArray = {23.1,6.3};
		
		String[] stringArray = {"a","b"};
		
		genericMethod.printArray(intArray);
		genericMethod.printArray(doubleArray);
		genericMethod.printArray(stringArray);
	}
}

class GenericMethod{
	//we need to specify the generic type before return type in the method signature. 
	public <T> void showItem(T t) {
		System.out.println("the item is "+t.toString());
	}
	
	public <T> T returnExample(T t) {
		System.out.println("the item is "+t.toString());
		return t;
	}
	
	public <T> void printArray(T[] t) {
		for(T item : t)
			System.out.println(item.toString());
	}
}