package validAnagram;

import java.util.Arrays;

public class validAnagram {
	
	public static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();
 
        // Sorting temp array using
        Arrays.sort(tempArray);
 
        // Returning new sorted string
        return new String(tempArray);
    }
	public boolean isAnagram(String s, String t) {
		String sortS = sortString(s);
		String sortT = sortString(t);
		if(sortS.equals(sortT)) return true;
		return false;
	}
}
