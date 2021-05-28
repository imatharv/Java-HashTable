package hashTable;

import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTable {
	public static void wordFrequency(Hashtable<String, Integer> hashtable, String string) {
		String array[] = string.split(" ");
		for(int i=0; i<array.length; i++) {
			if(hashtable.containsKey(array[i]))
				hashtable.put(array[i], hashtable.get(array[i])+1);
			else
				hashtable.put(array[i], 1);
		}
		for(Entry<String, Integer> entry : hashtable.entrySet()) {
			System.out.println(entry.getKey()+" :: "+entry.getValue());
		} 
	}

	public static void main(String[] args) {
		Hashtable<String, Integer> hashtable = new Hashtable<>();
		
		System.out.println("Frequency count for the sentance,");
		System.out.println("to be or not to be, is: ");
		String string1 = "to be or not to be";
		wordFrequency(hashtable,string1);
		
		System.out.println();
		
		System.out.println("Frequency count for the paragraph,");
		System.out.println("Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations");
	    String string2 = "Paranoids are not paranoid because they are paranoid but because they keep "
	    		+ "putting themselves deliberately into paranoid avoidable situations";
	    wordFrequency(hashtable,string2);
	    
	    System.out.println();
	    
	    System.out.println("Value for that word which is removed: " + hashtable.remove("avoidable"));
	    System.out.println(hashtable);
	}
}