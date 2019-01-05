package logicAndUtility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinAndMax {
	
	public static boolean compareArrays(int[] arr1, int[] arr2) {
		
		if(arr1.length != arr2.length) {
			return false;
		}
		
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static int[] findOutliers(int[] arr) {
		
		if( arr.length <= 1 ) {
			return arr;
		}
		
		List<Integer> convertedArray = new ArrayList<Integer>();
		
		for (int i : arr) {
			convertedArray.add(i);
		}
		
		int minValue = convertedArray.indexOf(Collections.min(convertedArray));
		int maxValue = convertedArray.indexOf(Collections.max(convertedArray));
		
		if (minValue == maxValue) {
			int result[] = {convertedArray.get(minValue)};
			return result;
		}else {
			int result[] = {convertedArray.get(minValue), convertedArray.get(maxValue)};
			return result;
		}
		
		
	}
}
