import java.io.FileReader;
import java.util.Scanner;
/**
 * 
 * @author Alexander Austin
 * This Class is designed to test open and closed hashing functions on two different algorithms
 * to measure speed and efficiency
 *
 */

public class TestHashing {
		public void OpenHashingFunctOneTest(int load ,String test1,String test2,String test3,String test4, String test5, String test6){
		
		/**
		 * First Tests are of Open Hashing, with hashFunctionOne, and 
		 * increasing load factors of ~25%, ~50%, ~75%, 100%
		 */

		try{
		Scanner one = new Scanner(new FileReader("String_Input.txt"));
		OpenHashing a = new OpenHashing();
		//Inserts objects to get to a ~25% load factor
		while(a.getLoad() <= load){
			String line = one.nextLine();
			String[] split = line.split(" ");
			for(int i = 0; i < split.length; i++){
				   split[i] = split[i].replaceAll("\\s", " ");
				   if(split[i].compareTo("") != 0  && split[i].compareTo(" ") != 0){
				     a.insertOne(split[i]);
				     }
				
			}
		}
		one.close();
			//Test Successful Searches
			int probes = 0;
			long startTime = 0;
			long endTime =  0;
			long duration = 0;
			
			startTime = System.nanoTime();
			probes = a.searchOne(test1);
			endTime = System.nanoTime();
			duration = (endTime - startTime);
			System.out.println("Successful Search 1: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
			
			startTime = System.nanoTime();
			probes = a.searchOne(test2);
			endTime = System.nanoTime();
			duration = (endTime - startTime);
			System.out.println("Successful Search 2: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
			
			startTime = System.nanoTime();
			probes = a.searchOne(test3);
			endTime = System.nanoTime();
			duration = (endTime - startTime);
			System.out.println("Successful Search 3: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
			
			startTime = System.nanoTime();
			probes = a.searchOne(test4);
			endTime = System.nanoTime();
			duration = (endTime - startTime);
			System.out.println("Successful Search 4: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
			
			startTime = System.nanoTime();
			probes = a.searchOne(test5);
			endTime = System.nanoTime();
			duration = (endTime - startTime);
			System.out.println("Successful Search 5: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
			
			startTime = System.nanoTime();
			probes = a.searchOne(test6);
			endTime = System.nanoTime();
			duration = (endTime - startTime);
			System.out.println("Successful Search 6: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
			
			//Test Unsuccessful Searches
			System.out.println("");
			
			startTime = System.nanoTime();
			probes = a.searchOne("z");
			endTime = System.nanoTime();
			duration = (endTime - startTime);
			System.out.println("Unsuccessful Search 1: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
			
			startTime = System.nanoTime();
			probes = a.searchOne("xyl");
			endTime = System.nanoTime();
			duration = (endTime - startTime);
			System.out.println("Unsuccessful Search 2: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
			
			startTime = System.nanoTime();
			probes = a.searchOne("zingarp");
			endTime = System.nanoTime();
			duration = (endTime - startTime);
			System.out.println("Unsuccessful Search 3: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
			
			startTime = System.nanoTime();
			probes = a.searchOne("yin");
			endTime = System.nanoTime();
			duration = (endTime - startTime);
			System.out.println("Unsuccessful Search 4: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
			
			startTime = System.nanoTime();
			probes = a.searchOne("pins");
			endTime = System.nanoTime();
			duration = (endTime - startTime);
			System.out.println("Unsuccessful Search 5: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
			
			startTime = System.nanoTime();
			probes = a.searchOne("yd");
			endTime = System.nanoTime();
			duration = (endTime - startTime);
			System.out.println("Unsuccessful Search 6: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
			
			
			
	
		
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
	}
	
public void OpenHashingFunctTwoTest(int load ,String test1,String test2,String test3,String test4, String test5, String test6){
		
		/**
		 * First Tests are of Open Hashing, with hashFunctionOne, and 
		 * increasing load factors of ~25%, ~50%, ~75%, 100%
		 */

		try{
		Scanner one = new Scanner(new FileReader("String_Input.txt"));
		OpenHashing a = new OpenHashing();
		//Inserts objects to get to a ~25% load factor
		while(a.getLoad() <= load){
			String line = one.nextLine();
			String[] split = line.split(" ");
			for(int i = 0; i < split.length; i++){
				   split[i] = split[i].replaceAll("\\s", " ");
				   if(split[i].compareTo("") != 0  && split[i].compareTo(" ") != 0){
				      a.insertTwo(split[i]);				     
				      }
				
			}
		}
		one.close();

			//Test Successful Searches
			int probes = 0;
			long startTime = 0;
			long endTime =  0;
			long duration = 0;
			
			startTime = System.nanoTime();
			probes = a.searchTwo(test1);
			endTime = System.nanoTime();
			duration = (endTime - startTime);
			System.out.println("Successful Search 1: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
			
			startTime = System.nanoTime();
			probes = a.searchTwo(test2);
			endTime = System.nanoTime();
			duration = (endTime - startTime);
			System.out.println("Successful Search 2: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
			
			startTime = System.nanoTime();
			probes = a.searchTwo(test3);
			endTime = System.nanoTime();
			duration = (endTime - startTime);
			System.out.println("Successful Search 3: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
			
			startTime = System.nanoTime();
			probes = a.searchTwo(test4);
			endTime = System.nanoTime();
			duration = (endTime - startTime);
			System.out.println("Successful Search 4: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
			
			startTime = System.nanoTime();
			probes = a.searchTwo(test5);
			endTime = System.nanoTime();
			duration = (endTime - startTime);
			System.out.println("Successful Search 5: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
			
			startTime = System.nanoTime();
			probes = a.searchTwo(test6);
			endTime = System.nanoTime();
			duration = (endTime - startTime);
			System.out.println("Successful Search 6: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
			
			//Test Unsuccessful Searches
			System.out.println("");
			
			startTime = System.nanoTime();
			probes = a.searchTwo("z");
			endTime = System.nanoTime();
			duration = (endTime - startTime);
			System.out.println("Unsuccessful Search 1: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
			
			startTime = System.nanoTime();
			probes = a.searchTwo("xyl");
			endTime = System.nanoTime();
			duration = (endTime - startTime);
			System.out.println("Unsuccessful Search 2: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
			
			startTime = System.nanoTime();
			probes = a.searchTwo("zingarp");
			endTime = System.nanoTime();
			duration = (endTime - startTime);
			System.out.println("Unsuccessful Search 3: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
			
			startTime = System.nanoTime();
			probes = a.searchTwo("yin");
			endTime = System.nanoTime();
			duration = (endTime - startTime);
			System.out.println("Unsuccessful Search 4: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
			
			startTime = System.nanoTime();
			probes = a.searchTwo("pins");
			endTime = System.nanoTime();
			duration = (endTime - startTime);
			System.out.println("Unsuccessful Search 5: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
			
			startTime = System.nanoTime();
			probes = a.searchTwo("yd");
			endTime = System.nanoTime();
			duration = (endTime - startTime);
			System.out.println("Unsuccessful Search 6: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
			
			
			
	
		
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
	}

public void ClosedHashingFunctOneTest(int load ,String test1,String test2,String test3,String test4, String test5, String test6){
	
	/**
	 * First Tests are of Open Hashing, with hashFunctionOne, and 
	 * increasing load factors of ~25%, ~50%, ~75%, 100%
	 */

	try{
	Scanner one = new Scanner(new FileReader("String_Input.txt"));
	ClosedHashing a = new ClosedHashing();
	
	
	
		//Inserts objects to get to a ~25% load factor
	while(a.getLoad() < load){
		String line = one.nextLine();
		String[] split = line.split(" ");
		for(int i = 0; i < split.length; i++){
			   split[i] = split[i].replaceAll("\\s", " ");
			   if(split[i].compareTo("") != 0  && split[i].compareTo(" ") != 0){
				     a.insertOne(split[i]);
				     }
				
			}
		}
	one.close();

		//Test Successful Searches
	   // a.print();
		int probes = 0;
		long startTime = 0;
		long endTime =  0;
		long duration = 0;
		
		startTime = System.nanoTime();
		probes = a.searchOne(test1);
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("Successful Search 1: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
		
		startTime = System.nanoTime();
		probes = a.searchOne(test2);
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("Successful Search 2: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
		
		startTime = System.nanoTime();
		probes = a.searchOne(test3);
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("Successful Search 3: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
		
		startTime = System.nanoTime();
		probes = a.searchOne(test4);
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("Successful Search 4: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
		
		startTime = System.nanoTime();
		probes = a.searchOne(test5);
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("Successful Search 5: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
		
		startTime = System.nanoTime();
		probes = a.searchOne(test6);
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("Successful Search 6: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
		
		//Test Unsuccessful Searches
		System.out.println("");
		
		startTime = System.nanoTime();
		probes = a.searchOne("z");
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("Unsuccessful Search 1: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
		
		startTime = System.nanoTime();
		probes = a.searchOne("xyl");
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("Unsuccessful Search 2: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
		
		startTime = System.nanoTime();
		probes = a.searchOne("zingarp");
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("Unsuccessful Search 3: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
		
		startTime = System.nanoTime();
		probes = a.searchOne("yin");
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("Unsuccessful Search 4: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
		
		startTime = System.nanoTime();
		probes = a.searchOne("pins");
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("Unsuccessful Search 5: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
		
		startTime = System.nanoTime();
		probes = a.searchOne("yd");
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("Unsuccessful Search 6: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
		
		
		

	
	}catch(Exception e){
		System.out.println(e.getMessage());
	}
	
	
	
	
	
	
	
	
}

public void ClosedHashingFunctTwoTest(int load ,String test1,String test2,String test3,String test4, String test5, String test6){
	
	/**
	 * First Tests are of Open Hashing, with hashFunctionOne, and 
	 * increasing load factors of ~25%, ~50%, ~75%, 100%
	 */

	try{
	Scanner one = new Scanner(new FileReader("String_Input.txt"));
	ClosedHashing a = new ClosedHashing();
	//Inserts objects to get to a ~25% load factor
	while(a.getLoad() < load){
		String line = one.nextLine();
		String[] split = line.split(" ");
		for(int i = 0; i < split.length; i++){
			   split[i] = split[i].replaceAll("\\s", " ");
			   if(split[i].compareTo("") != 0  && split[i].compareTo(" ") != 0){
				      a.insertTwo(split[i]);
				     }
			
		}
	}
	one.close();

		//Test Successful Searches
	   //a.print();
		int probes = 0;
		long startTime = 0;
		long endTime =  0;
		long duration = 0;
		startTime = System.nanoTime();
		probes = a.searchTwo(test1);
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("Successful Search 1: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
		
		startTime = System.nanoTime();
		probes = a.searchTwo(test2);
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("Successful Search 2: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
		
		startTime = System.nanoTime();
		probes = a.searchTwo(test3);
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("Successful Search 3: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
		
		startTime = System.nanoTime();
		probes = a.searchTwo(test4);
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("Successful Search 4: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
		
		startTime = System.nanoTime();
		probes = a.searchTwo(test5);
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("Successful Search 5: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
		
		startTime = System.nanoTime();
		probes = a.searchTwo(test6);
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("Successful Search 6: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
		
		//Test Unsuccessful Searches
		System.out.println("");
		
		startTime = System.nanoTime();
		probes = a.searchTwo("z");
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("Unsuccessful Search 1: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
		
		startTime = System.nanoTime();
		probes = a.searchTwo("xyl");
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("Unsuccessful Search 2: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
		
		startTime = System.nanoTime();
		probes = a.searchTwo("zingarp");
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("Unsuccessful Search 3: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
		
		startTime = System.nanoTime();
		probes = a.searchTwo("yin");
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("Unsuccessful Search 4: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
		
		startTime = System.nanoTime();
		probes = a.searchTwo("pins");
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("Unsuccessful Search 5: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
		
		startTime = System.nanoTime();
		probes = a.searchTwo("yd");
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		System.out.println("Unsuccessful Search 6: Number of Probes: " + probes + " || Time: " + duration + " Nanoseconds");
		
		
		

	
	}catch(Exception e){
		System.out.println(e.getMessage());
	}
	
	
	
	
	
	
	
	
}

	public static void main(String[] args){
		System.out.println("***Test 1 ( ~50% Load Factor, Open Hashing, HashFunction 1)***");
		System.out.println("");
		TestHashing a = new TestHashing();
		a.OpenHashingFunctOneTest(500,"Aalto", "abdomen", "abdicator", "abbacy", "Abbot", "4gl");
		System.out.println("");
		System.out.println("***Test 2 ( 100% Load Factor, Open Hashing, HashFunction 1)***");
		System.out.println("");
		a.OpenHashingFunctOneTest(1009 ,"abduct","abcissa","ablude","aboding","abortus", "aboma" );
		System.out.println("");
		System.out.println("***Test 3 ( 200% Load Factor, Open Hashing, HashFunction 1)***");
		System.out.println("");
		a.OpenHashingFunctOneTest(2018, "saha", "acarids", "acclaim","abigail", "accoll", "aborigine");
		System.out.println("");
		System.out.println("***Test 4 ( 300% Load Factor, Open Hashing, HashFunction 1)***");
		System.out.println("");
		a.OpenHashingFunctOneTest(3027, "achafe","saha","abdomen","acid","abortus", "ackton");
		System.out.println("");
		
		//Begin Open Hash Function 2 test
		
		System.out.println("***Test 5 ( ~50% Load Factor, Open Hashing, HashFunction 2)***");
		System.out.println("");
		a.OpenHashingFunctTwoTest(500,"Aalto", "abdomen", "abdicator", "abbacy", "Abbot", "4gl");
		System.out.println("");
		System.out.println("***Test 6 ( 100% Load Factor, Open Hashing, HashFunction 2)***");
		System.out.println("");
		a.OpenHashingFunctTwoTest(1009 ,"abduct","abcissa","ablude","aboding","abortus", "aboma" );
		System.out.println("");
		System.out.println("***Test 7 ( 200% Load Factor, Open Hashing, HashFunction 2)***");
		System.out.println("");
		a.OpenHashingFunctTwoTest(2018, "saha", "acarids", "acclaim","abigail", "accoll", "aborigine");
		System.out.println("");
		System.out.println("***Test 8 ( 300% Load Factor, Open Hashing, HashFunction 2)***");
		System.out.println("");
		a.OpenHashingFunctTwoTest(3027, "achafe","saha","abdomen","acid","abortus", "ackton");
		System.out.println("");
		
		//Closed Hash Function one test
		
		System.out.println("***Test 9 ( ~25% Load Factor, Closed Hashing, HashFunction 1)***");
		System.out.println("");
		a.ClosedHashingFunctOneTest(250,"aahs", "Aalto", "48-point", "5th", "A.A.A.", "Aachen");
		System.out.println("");
		System.out.println("***Test 10 ( ~50% Load Factor, Closed Hashing, HashFunction 1)***");
		System.out.println("");
		a.ClosedHashingFunctOneTest(500 ,"Aalto", "abdomen", "abdicator", "abbacy", "Abbot" ,"4gl" );
		System.out.println("");
		System.out.println("***Test 11 ( ~75% Load Factor, Closed Hashing, HashFunction 1)***");
		System.out.println("");
		a.ClosedHashingFunctOneTest(750, "saha", "Abeokuta", "Abernon","abigail", "abatis", "abeam");
		System.out.println("");
		System.out.println("***Test 12 ( 100% Load Factor, Closed Hashing, HashFunction 1)***");
		System.out.println("");
		a.ClosedHashingFunctOneTest(1009, "abduct","abcissa","ablude","aboding","abortus", "20-point");
		System.out.println("");
		
		//Begin Open Hash Function 2 test
		
		System.out.println("***Test 13 ( ~25% Load Factor, Closed Hashing, HashFunction 2)***");
		System.out.println("");
		a.ClosedHashingFunctTwoTest(250,"aahs", "Aalto", "48-point", "5th", "A.A.A.", "Aachen");
		System.out.println("");
		System.out.println("***Test 14 ( ~50% Load Factor, Closed Hashing, HashFunction 2)***");
		System.out.println("");
		a.ClosedHashingFunctTwoTest(500 ,"Aalto", "abdomen", "abdicator", "abbacy", "Abbot" ,"4gl" );
		System.out.println("");
		System.out.println("***Test 15 ( ~75% Load Factor, Closed Hashing, HashFunction 2)***");
		System.out.println("");
		a.ClosedHashingFunctTwoTest(750, "saha", "Abeokuta", "Abernon","abigail", "abatis", "abeam");
		System.out.println("");
		System.out.println("***Test 16 ( 100% Load Factor, Closed Hashing, HashFunction 2)***");
		System.out.println("");
		a.ClosedHashingFunctTwoTest(1009, "abduct","abcissa","ablude","aboding","abortus", "20-point");
		System.out.println("");
	}


}
