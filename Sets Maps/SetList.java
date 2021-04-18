package SetsMaps;

import java.util.*;
/*
Test the execution time of
1. testing whether an element is in a hash set, linked hash set, tree set, array list, linked list
2. removing elements from a hash set, linked hash set, tree set, array list, linked list
 */
public class SetList {
	static final int N = 50000;
	
	public static void main(String[] args) {
		//add the order, using a list and order it
		ArrayList<Long> TestData = new ArrayList<>(5);
		ArrayList<Long> RemoveData = new ArrayList<>(5);
		String[][] string = {{"HashSet", "LinkedSet", "TreeSet", "ArrayList", "LinkedList"}, {"", "", "", "", ""}, {"", "", "", "", ""}};
		
		//add numbers 0, 1, 2, ... N-1 to the array list
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(i);
		}	
		Collections.shuffle(list); //shuffle the array list
		
		//create a hash set, and test its performance
		Collection<Integer> set1 = new HashSet<>(list);
		long hashSetTest = getTestTime(set1);
		TestData.add(hashSetTest);
		string[1][0] = hashSetTest + "";
		System.out.println(hashSetTest);
		long hashSetRemove = getRemoveTime(set1);
		RemoveData.add(hashSetRemove);
		string[2][0] = hashSetRemove + "";
		System.out.println(hashSetRemove);
		
		//create a linked hash set, and test its performance
		Collection<Integer> set2 = new LinkedHashSet<>(list);
		long linkedSetTest = getTestTime(set2);
		TestData.add(linkedSetTest);
		string[1][1] = linkedSetTest + "";
		System.out.println(linkedSetTest);
		long linkedSetRemove = getRemoveTime(set2);
		RemoveData.add(linkedSetRemove);
		string[2][1] = linkedSetRemove + "";
		System.out.println(linkedSetRemove);
		
		//create a tree set, and test its performance
		Collection<Integer> set3 = new TreeSet<>(list);
		long treeSetTest = getTestTime(set3);
		TestData.add(treeSetTest);
		string[1][2] = treeSetTest + "";
		System.out.println(treeSetTest);
		long treeSetRemove = getRemoveTime(set3);
		RemoveData.add(treeSetRemove);
		string[2][2] = treeSetRemove + "";
		System.out.println(treeSetRemove);
		
		//create an array list, test its performance
		Collection<Integer> list1 = new ArrayList<>(list);
		long ArrayListTest = getTestTime(list1);
		TestData.add(ArrayListTest);
		string[1][3] = ArrayListTest + "";
		System.out.println(ArrayListTest);
		long ArrayListRemove = getRemoveTime(list1);
		RemoveData.add(ArrayListRemove);
		string[2][3] = ArrayListRemove + "";
		System.out.println(ArrayListRemove);
		
		//create a linked list, test its performance
		Collection<Integer> list2 = new LinkedList<>(list);
		long linkedListTest = getTestTime(list2);
		TestData.add(linkedListTest);
		string[1][4] = linkedListTest + "";
		System.out.println(linkedListTest);
		long linkedListRemove = getRemoveTime(list2);
		RemoveData.add(linkedListRemove);
		string[2][4] = linkedListRemove + "";
		System.out.println(linkedListRemove);
		
		Collections.sort(TestData);
		String[] newTest = new String[5];
		for (int i = 0; i < TestData.size(); i++) {
			for (int j = 0; j < string[1].length; j++) {
				if (string[1][j].equals(TestData.get(i) + "")) {
					newTest[i] = string[0][j];
				}
			}
		}
		
		Collections.sort(RemoveData);
		String[] newRemove = new String[5];
		for (int i = 0; i < RemoveData.size(); i++) {
			for (int j = 0; j < string[2].length; j++) {
				if(string[2][j].equals(RemoveData.get(i)+"")) {
					newRemove[i] = string[0][j];
				}
			}
		}
		
		System.out.println("Testing if an element match: ");
		for (String str : newTest) {
			System.out.print(str + " ");
		}
		/*
		Testing if an element match (fastest to slowest): 
		LinkedSet HashSet TreeSet ArrayList LinkedList 
		 */
		
		System.out.println("\n" + "Removing elements: ");
		for (String str : newRemove) {
			System.out.print(str + " ");
		}
		/*
		Removing elements: 
		HashSet LinkedSet TreeSet ArrayList LinkedList 
		 */
	}
	
	//test time, testing if the number is in the collection
	public static long getTestTime(Collection<Integer> c) {
		long startTime = System.currentTimeMillis();
		//test if a number is in the collection
		for (int i = 0; i < N; i++) {
			c.contains((int)(Math.random() * 2 * N));
		}
		return System.currentTimeMillis() - startTime;
	}
	
	//remove time
	public static long getRemoveTime(Collection<Integer> c) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < N; i++) {
			c.remove(i); //remove from container
		}
		return System.currentTimeMillis() - startTime; //return execution time
	}

}
