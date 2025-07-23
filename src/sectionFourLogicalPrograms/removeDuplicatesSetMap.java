package sectionFourLogicalPrograms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class removeDuplicatesSetMap {
	
	public static List<String> usingMap(List<String> list) {
		Map<String, Boolean> uniqueItems = new HashMap<>();
		List<String> sortList = new ArrayList<>();
		
		for(String word : list) {
			if(!uniqueItems.containsKey(word)) {
				uniqueItems.put(word, true);
				sortList.add(word);
			}
		}
		
		return sortList;
		
	}
	
	public static List<String> usingSet(List<String> list) {
		Set<String> set  = new HashSet<>();
		set.addAll(list);
		List<String> unqueList = new ArrayList<>();
		unqueList.addAll(set);
		return unqueList;
		
	}

	
	public static void main(String[] args) {
		System.out.println(usingMap(Arrays.asList("mango", "mango", "orange", "orange")));
		System.out.println(usingSet(Arrays.asList("mango", "mango", "orange", "orange")));
	}
}
