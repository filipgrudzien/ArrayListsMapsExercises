package logicAndUtility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayDuplicates {

	public static int[] convertIntoArray(List<Integer> results) {

		int[] arr = new int[results.size()];

		for (int i = 0; i < results.size(); i++) {
			arr[i] = results.get(i);
		}

		return arr;
	}

	public static int[] findDuplicates(int[] arr) {
		
		if (arr.length <= 1) {
			return arr;
		}

		HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
		List<Integer> results = new ArrayList<Integer>();

		for (int i : arr) {
			if (counts.containsKey(i)) {
				counts.put(i, (counts.get(i) + 1));
			} else {
				counts.put(i, 1);
			}
		}

		Map<Integer, Integer> mappedCounts = counts;

		for (Map.Entry<Integer, Integer> map : mappedCounts.entrySet()) {
			if (map.getValue() > 1) {
				results.add(map.getKey());
			}
		}

		return convertIntoArray(results);
	}
	
	public static int removeDuplicates(int[] arr) {
		
		if( arr.length <= 1 ) {
			return arr.length;
		}
		
		Set<Integer> uniqueValues = new HashSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			uniqueValues.add(arr[i]);
		}

		return uniqueValues.size();
	}
}
