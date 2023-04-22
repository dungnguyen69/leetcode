package groupAnagrams;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
	public static String sortString(String inputString) {
		char[] tempArray = inputString.toCharArray();
		Arrays.sort(tempArray);
		return new String(tempArray);
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			String unsortedString = strs[i];
			String sortString = sortString(unsortedString); // key
			if (map.get(sortString) != null) { // if key is existent
				List<String> valueList = map.get(sortString); // value in hash-map
				valueList.add(unsortedString); // add unsortedString to list
				map.put(sortString, valueList); // replace
			} else {
				List<String> valueList = new ArrayList<>(); // initialize a new list as value
				valueList.add(unsortedString); // add unsortedString to list
				map.put(sortString, valueList); // add new key-value pair whose key is a sorted string and value is a
												// list
												// of string
			}
		}
		List<List<String>> values = map.values().stream().collect(Collectors.toList());
		return values;
	}
}
