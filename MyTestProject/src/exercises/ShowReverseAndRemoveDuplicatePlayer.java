package exercises;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public  class ShowReverseAndRemoveDuplicatePlayer implements Comparable<ShowReverseAndRemoveDuplicatePlayer> {

	
	
	long id;
	String name;
	
	public ShowReverseAndRemoveDuplicatePlayer(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static Collection<ShowReverseAndRemoveDuplicatePlayer> doOperation (List<ShowReverseAndRemoveDuplicatePlayer> list){
		
		Collections.sort(list);
		Collections.reverse(list);
		
		Set<ShowReverseAndRemoveDuplicatePlayer> set = new LinkedHashSet<ShowReverseAndRemoveDuplicatePlayer>();
		
		set.addAll(list);
		
		list.clear();
		
		list.addAll(set);
		
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<ShowReverseAndRemoveDuplicatePlayer> players = new ArrayList<ShowReverseAndRemoveDuplicatePlayer>();

			
		players.add(new ShowReverseAndRemoveDuplicatePlayer(2,"A"));
		players.add(new ShowReverseAndRemoveDuplicatePlayer(1,"A"));
		players.add(new ShowReverseAndRemoveDuplicatePlayer(5,"A"));
		players.add(new ShowReverseAndRemoveDuplicatePlayer(4,"A"));
		players.add(new ShowReverseAndRemoveDuplicatePlayer(3,"B"));
		
		
		ShowReverseAndRemoveDuplicatePlayer.doOperation(players);
		
		for (ShowReverseAndRemoveDuplicatePlayer player : players) {
			System.out.println("id: " + player.id + " name: " + player.name);
		}
		

	}

	@Override
	public int compareTo(ShowReverseAndRemoveDuplicatePlayer o) {
		// TODO Auto-generated method stub
		/*
		int result = -1;
		if(o != null && o instanceof Player){
			if (this.id > o.id) {
				result = 1;
				
			} else if (this.id == o.id) {
				result = 0;
			}
			else if (this.id < o.id) {
				result = -1;
			}
		}
		
		return result;
		*/
		
		if(o != null && o instanceof ShowReverseAndRemoveDuplicatePlayer){
			Long idLong = new Long(id);
			Long idOLong = new Long(o.id);
			return idLong.compareTo(idOLong);
		}
		
		return -1;
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		
		if (arg0 != null && arg0 instanceof ShowReverseAndRemoveDuplicatePlayer) {
			return this.name.equals(((ShowReverseAndRemoveDuplicatePlayer)arg0).name);
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.name.hashCode();
	}
}
