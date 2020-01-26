package basics;


public class GenericExample1 {
	public static void main(String[] args) {
		//below is called raw type...AVOID this
		//if we initialize like this then we have to cast while retrieving data items, which is not recommended
		Store store = new Store();
		store.setItem("ss");
		
		/*
		 * initializing it like this
		 * Store<String> stringStore = new Store<>();
		 * will result in the store class like below after compilation
		 * 
		 * class Store{
				private String item;
			
				public String getItem() {
					return item;
				}
			
				public void setItem(String item) {
					this.item = item;
				}
			}
		ie. all the T's are replaced by String	
			
			the advantage is once we initialize it with any Type...it cannot be casted to incompatible type.
			and the check will be performed at the compile only..
			like below is not allowed.
			Store<String> stringStore = new Store<>();
			Integer i = (Integer)stringStore.getItem();//compile time issue
		 */
		
		Store<String> stringStore = new Store<>(); //<> is called diamond operator
		stringStore.setItem("bread");
		//Integer i = (Integer)stringStore.getItem();
	}
	
}

//capital 'T' indicates Type
class Store<T>{
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}