package SetsMaps;

import java.util.*;
/*
Test the execution time of
1. testing whether an element is in a hash set, linked hash set, tree set, array list, linked list
2. removing elements from a hash set, linked hash set, tree set, array list, linked list
 */
public class SetList1 {
	static final int N = 50000;
	
	public static void main(String[] args) {
		//add the order, using a list and order it
		
		//add numbers 0, 1, 2, ... N-1 to the array list
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			list.add(i);
		}	
		Collections.shuffle(list); //shuffle the array list
		
		//create a hash set, and test its performance
		Collection<Integer> set1 = new HashSet<>(list);
		long hashSetTest = getTestTime(set1);
		System.out.println(hashSetTest);
		long hashSetRemove = getRemoveTime(set1);
		System.out.println(hashSetRemove);
		Data hashSet = new Data("HashSet", hashSetTest, hashSetRemove);
		
		//create a linked hash set, and test its performance
		Collection<Integer> set2 = new LinkedHashSet<>(list);
		long linkedSetTest = getTestTime(set2);
		System.out.println(linkedSetTest);
		long linkedSetRemove = getRemoveTime(set2);
		System.out.println(linkedSetRemove);
		Data linkedSet = new Data("LinkedHashSet", linkedSetTest, linkedSetRemove);
		
		//create a tree set, and test its performance
		Collection<Integer> set3 = new TreeSet<>(list);
		long treeSetTest = getTestTime(set3);
		System.out.println(treeSetTest);
		long treeSetRemove = getRemoveTime(set3);
		System.out.println(treeSetRemove);
		Data treeSet = new Data("TreeSet", treeSetTest, treeSetRemove);
		
		//create an array list, test its performance
		Collection<Integer> list1 = new ArrayList<>(list);
		long ArrayListTest = getTestTime(list1);
		System.out.println(ArrayListTest);
		long ArrayListRemove = getRemoveTime(list1);
		System.out.println(ArrayListRemove);
		Data ArrayList = new Data("ArrayList", ArrayListTest, ArrayListRemove);
		
		//create a linked list, test its performance
		Collection<Integer> list2 = new LinkedList<>(list);
		long linkedListTest = getTestTime(list2);
		System.out.println(linkedListTest);
		long linkedListRemove = getRemoveTime(list2);
		System.out.println(linkedListRemove);
		Data LinkedList = new Data("LinkedList", linkedListTest, linkedListRemove);
		
		//order them with test time
		List<Data> set = Arrays.asList(hashSet, linkedSet, treeSet, ArrayList, LinkedList);
		Collections.sort(set, Comparator.comparing(Data::getTest));
		Iterator<Data> iterator = set.iterator();
		System.out.println("Test time (slowest to fastest): ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
		
		//order them with remove time
		System.out.println("Remove time (slowest to fastest): ");
		Collections.sort(set, Comparator.comparing(Data::getRemove));
		iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getName());
		}
		
		
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

	//class with remove time and test time and name
	static class Data implements Comparator<Data>{
		//data field
		private String name;
		private long test;
		private long remove;
		
		public Data(String name, long test, long remove) {
			this.name = name;
			this.test = test;
			this.remove = remove;
		}
		
		public String getName() {
			return name;
		}
		
		public long getTest() {
			return test;
		}
		
		public long getRemove() {
			return remove;
		}
		
		@Override
		public int compare(Data d1, Data d2) {
			if (d1.getTest() < d2.getTest()) {
				return -1;
			}else if (d1.getTest() > d2.getTest()) {
				return 1;
			}else {
				return 0;
			}
		}
	
	}
	
}
