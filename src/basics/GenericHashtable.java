package basics;

public class GenericHashtable {

	public static void main(String[] args) {
		TestHashTable<String,String> ht1 = new TestHashTable<>("a","b");
		TestHashTable<String,Integer> ht2 = new TestHashTable<>("a",1);
		System.out.println(ht1);
		System.out.println(ht2);
	}
	
}
/*
 * multiple parameters
 */
class TestHashTable<K,V>{
	private K key;
	private V value;
	
	public TestHashTable(K key,V value) {
		this.key = key;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return key.toString()+" : "+value.toString();
	}
	
}
