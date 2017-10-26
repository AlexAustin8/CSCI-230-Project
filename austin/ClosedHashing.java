import java.io.FileReader;
import java.util.Scanner;
/**
 * 
 * @author Alexander Austin
 * This class creates a closed hashing table to be used for strings. It supports two different
 * hashing algorithms 
 */

public class ClosedHashing {
	public String[] hashTable = new String[1009];
	private int load;
	
	
	//Getter for the current load of the hashTable
		public int getLoad(){
			return load;
		}
		//Increases Load by one
		public void loadIncrement(){
			load++;
		}
		//Returns the the length of the table
		public int tableSize(){
			return hashTable.length;
		}
	    //Prints every space in the array, even if null
		public void print(){
			for(int i = 0; i< hashTable.length; i++){
				System.out.println("Index " + i + ": '"+ hashTable[i]+ " ' ");
			}
		}
	//Hash Functions to Be tested
		
		
	private int hashFunctionOne(String s){
		//H declared as long to avoid int overflow
		long h = 0;
		for(int i = 0; i < s.length(); i++){
			h += ((int)(s.charAt(i)) * 17) * ((int)(s.charAt(i)-13)*7);
			h++;
		}
		h = h % 1009;
		//Since max value of h is 1009 , converted back to int
		int k = (int)h;
		return k;
		
	}
	//Taken From Supplement
	private int hashFunctionTwo(String s){
		int h = 0;
		for(int i = 0; i < s.length(); i++){
			h +=((h * 131 + (int)s.charAt(i)) % 1009);
		}
		h = h % 1009;
		return h;
	}
	
	/**
	 * 
	 * @param  String str to be inserted into the hashTable
	 * @return index where str was placed, or returns -1 if element already exists in hashTable
	 */
	public int insertOne(String str){
		int index = 0;
		int key = hashFunctionOne(str);
		for(int i = 0; i < hashTable.length; i++){
			index = ((key + (i * i)) % hashTable.length);
			if(hashTable[index] == null){
				hashTable[index] = new String(str);
				loadIncrement();
				return index;
			}
			if(hashTable[index].compareTo(str) == 0){
				return -1;
			}
			
			
		}
		
		return index;

		
	}
	public int searchOne(String str){
		int numProbes = 0;
		int index;
		int key = hashFunctionOne(str);
		for(int i = 0; i < hashTable.length; i++){
			numProbes++;
			index = ((key + (i*i)) % hashTable.length);
			if(hashTable[index] == null){
				return numProbes;
			}if(hashTable[index].compareTo(str) == 0){
				return numProbes;
			
			}
		}
		return numProbes;
	
	 		
			
		}
	
	//Here are the search/insert functions that are reliant upon the second hash function
	
	public int insertTwo(String str){
		int index = 0;
		int key = hashFunctionTwo(str);
		for(int i = 0; i < hashTable.length; i++){
			index = ((key + (i * i)) % hashTable.length);
			if(hashTable[index] == null){
				hashTable[index] = new String(str);
				loadIncrement();
				return index;
			}
			if(hashTable[index].compareTo(str) == 0){
				return -1;
			}
			
			
		}
		return index;

		
	}
	public int searchTwo(String str){
		int numProbes = 0;
		int index;
		int key = hashFunctionTwo(str);
		for(int i = 0; i < hashTable.length; i++){
			numProbes++;
			index = ((key + (i * i)) % hashTable.length);
		    if(hashTable[index] == null){
			   return numProbes;
		    }
		    if(hashTable[index].compareTo(str) == 0){
		    	return numProbes;
		    }
			
		}
		return numProbes;
	
	 		
			
		}

	
			
			
	

}
