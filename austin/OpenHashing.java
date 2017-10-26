//Alexander Austin
//CSCI 230
//Dr. Leclerc
//The goal of OpenHashing class is to create a hashing function
//that works in a chain.
import java.util.*;
/**
 * 
 * @author Alexander Austin
 * This class creates a open hashing table to be used for strings. It supports two different
 * hashing algorithms 
 */

import java.io.FileReader;
public class OpenHashing {
	private SinglyLinkedList[] hashTable = new SinglyLinkedList[1009];
	private int load;
	
	//Getter for the current load of the hashTable
	public int getLoad(){
		return load;
	}
	//Increases Load by one
	public void loadIncrement(){
		load++;
	}
	
	public int tableSize(){
		return hashTable.length;
	}
	public String get(int index){
		String output= "";
		if(hashTable[index] == null){
		   return null;
		}else{
			SinglyLinkedList<String> list = hashTable[index];
			for(int i = 0; i < list.size(); i++){
				output += (list.get(i) +", ");
				
			}
		}
		return output;
	}
	

	
	private int hashFunctionOne(String s){
		//H declared as long to avoid int overflow
		long h = 0;
		for(int i = 0; i < s.length(); i++){
			h += ((int)(s.charAt(i)) * 17) * ((int)(s.charAt(i)-13)*7);
			h++;
		}
		h = h % 1009;
		//Since max value of h is 997 , converted back to int
		int k = (int)h;
		return k;
	}
	
	private int hashFunctionTwo(String s){
		int h = 0;
		
		for(int i = 0; i < s.length(); i++){
			h += (h * 131 + (int)s.charAt(i)) % 1009;
			h = h % 1009;
		}
		return h;
	}
	//Accepts a string as a parameter, and places it at the index determined
	//By hashFunctionOne. Returns this index as well
	public int insertOne(String str){
		int index = hashFunctionOne(str);	
		if (hashTable[index] != null){
			SinglyLinkedList<String> indexList = hashTable[index];
			for(int i = 0; i < indexList.size(); i++){
				if((indexList.get(i)).compareTo(str) == 0){
					return -1;
				}
			}
			indexList.add(str);
			loadIncrement();
			return index;
			
		}else if(hashTable[index] == null){
				SinglyLinkedList<String> newSLL = new SinglyLinkedList<String>();
				newSLL.add(str);
				hashTable[index] = newSLL;
				return index;
		}
		return index;
	}
		/**
		 * 
		 * @param str
		 * @return number of probes taken to reach desired object, returns -1 if not found
		 */
		public int searchOne(String str){
			int index = hashFunctionOne(str);
			int numProbes = 0;
			if(hashTable[index] != null){
				
			SinglyLinkedList<String> searchSLL = hashTable[index];
			for(int i = 0; i< searchSLL.size(); i++){
				numProbes++;
				if(searchSLL.get(i).compareTo(str) == 0){
					return numProbes;
				}
			   }
			}
			return numProbes;
		}
		
		public int insertTwo(String str){
			int index = hashFunctionTwo(str);		
			if (hashTable[index] != null){
				SinglyLinkedList<String> indexList = hashTable[index];
				for(int i = 0; i < indexList.size(); i++){
					if((indexList.get(i)).compareTo(str) == 0){
						return -1;
					}
				}
				indexList.add(str);
				loadIncrement();
				return index;
			}else if(hashTable[index] == null){
					SinglyLinkedList<String> newSLL = new SinglyLinkedList<String>();
					newSLL.add(str);
					hashTable[index] = newSLL;
					return index;
			}
			return index;
		}
			
		public int searchTwo(String str){
			int index = hashFunctionTwo(str);
			int numProbes = 0;
			if(hashTable[index] != null){
				
			SinglyLinkedList<String> searchSLL = hashTable[index];
			for(int i = 0; i< searchSLL.size(); i++){
				numProbes++;
				if(searchSLL.get(i).compareTo(str) == 0 ){
					return numProbes;
				}
			   }
			}
			return numProbes;
		}
		
	

}


		
		
		
			
	
				
			
		
	
					
		
		
		
	


