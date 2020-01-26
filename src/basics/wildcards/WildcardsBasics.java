package basics.wildcards;
/*
 * Wildcards is trying to solve below problem
 * Collection<String> c1 = new ArrayList<>();
 * Collection<Object> c2 = c1; //this is not valid
 * 
 * String is an object but the Collection<String> is not Collection<Object>
 * 
 * so what this means is 
 * printCollection(Collection(Object) c)
 * for(object i in c)
 * 	sysout(i)
 * 
 * this method is not generic in the sense that we cannot print a collection of String or Integers or custom object using it.
 * 
 * COLLECTION OF OBJECT IS NOT SUPERTYPE OF ALL KINDS OF COLLECTIONS !!!
 * THE SUPERTYPE OF ALL KINDS OF COLLECTION IS -> WILDCARD
 	printCollection(Collection(?) c)
 *   for(object i in c)
 *  	sysout(i) //we can use this to print the elements,but we cannot use this to insert any thing in the collection.
 *  				//because we don't the kind of element that collection supports.
 *	
 *	c.add(new Object())//this will cause compile time error
 *  
 *  
 *  
 */
public class WildcardsBasics {

}
