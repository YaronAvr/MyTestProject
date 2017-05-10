package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ScorePerSubjectByLowId {

	
	public static List<String> list;
	public static List<Item> itemList;
	public static Map<String, Integer> map;
	
	 class Item implements Comparable<Item> {
		
		Long id;
		String subject;
		Integer score;
		
		Item(Long id,String subject,Integer score){
			
			this.id = id;
			this.subject = subject;
			this.score = score;
		}

		@Override
		public int compareTo(Item o) {
			// TODO Auto-generated method stub
			return this.id.compareTo(o.id);
		}
	}
	
	
	public ScorePerSubjectByLowId() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		initial();
		createItemList();

		Collections.sort(itemList);
		
		insertToMap();
		
		printMap();

	}

	private static void printMap() {
		// TODO Auto-generated method stub
		Iterator<String> iterator = map.keySet().iterator();
		
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			
			System.out.println(key + ": " + map.get(key));
		}
	}

	private static void createItemList() {
		// TODO Auto-generated method stub
		
		itemList = new ArrayList<Item>();
		String [] arr;
		Long id;
		String subject;
		Integer score;
		
		
		for (String str : list) {
			
			arr = str.split("\\|");
			/*
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			*/
			id = Long.valueOf(arr[0]);
			subject = String.valueOf(arr[1]);
			score = Integer.valueOf(arr[2]);
			
			
			Item item = new ScorePerSubjectByLowId().new Item(id, subject, score);
			
			itemList.add(item);
			
		}
	}

	private static void initial() {
		// TODO Auto-generated method stub
		
		ScorePerSubjectByLowId.list = new ArrayList<String>();
		
		list.add("5|english|78");
		list.add("3|data struncture|32");
		list.add("10|english|76");
		list.add("8|english|50");
		list.add("5|data struncture|37");
		list.add("3|english|82");
		list.add("45|english|99");
		list.add("2|data struncture|100");
	}

	private static Map<String, Integer> insertToMap() {
		// TODO Auto-generated method stu
		
		map = new HashMap<String, Integer>();
		
		for (Item item : itemList) {
			
			Integer val = map.get(item.subject);
			if (val == null) {
				map.put(item.subject, item.score);
			}
		}
		
		
		return null;
	}
	

}
