
import java.util.*;

public class DuplicateString{
	
	public static void main(String args[]) {
		String s = "Anagramsn";
		DuplicateString.duplicate(s);
	}

	public static void duplicate(String s) {
		if(s== null || s.length()==0) {
			return;
		}

		/*Map<Character, Integer> maps = new HashMap<>();
		int count = 0;
		char[] a = s.toLowerCase().toCharArray();

		for(int i =0;i<a.length;i++) {

			if(maps.containsKey(a[i])) {

				maps.put(a[i], maps.get(a[i])+1);
			}
			else {
				maps.put(a[i], 1);
			}
		}

		Set<Character> sets = new HashSet<>(maps.keySet());

		for(char c: sets) {
			if(maps.get(c)>1) {
				System.out.println("Values: "+c+" count: "+maps.get(c));
			}
		}*/
        s = s.toLowerCase();
		for (int i = 0; i<s.length();i++) {
			int count = 1;
			for (int j=i+1;j<s.length();j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}

			if(count >1) {
				System.out.println(s.charAt(i)+" count is: "+ count);
			}
		}
	}
}