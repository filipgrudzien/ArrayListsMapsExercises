package logicAndUtility;

import java.util.HashMap;

public class CheckIfMissing {
	public static int lookForMissingValue(int[] arr1, int[] arr2) {
		
		if (arr1.length == 0 && arr2.length == 0) {
			return -1;
		}
		
		HashMap<Integer, Integer> convertedArray = new HashMap<Integer, Integer>();

		for (int i : arr2) {
			if (convertedArray.containsKey(i)) {
				convertedArray.put(i, (convertedArray.get(i) + 1));
			} else {
				convertedArray.put(i, 1);
			}
		}

		for (int i : arr1) {
			if (!convertedArray.containsKey(i)) {
				return i;
			}
		}
		
		return -1;
	}
}
