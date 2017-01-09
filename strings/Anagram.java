import java.util.*;
public class Anagram {
	
	public static void main(String[] args) {
		String s1 = "btou";
		String s2 = "tobu";
		System.out.println(Anagram.anagram(s1, s2));
	}

	public static boolean anagram(String s1, String s2) {
		if(s1.length() == 0 && s2.length()==0) {
			return true;
		}

		else if(s1.length() != s2.length()) {
			return false;
		}

		else {
				Map<Character, Integer> maps = new HashMap<>();


				for(int i=0; i<s1.length();i++) {
					int count = 1;
					if(maps.containsKey(s1.charAt(i))) {
						count += maps.get(s1.charAt(i));
						maps.put(s1.charAt(i), count);
					}
					maps.put(s1.charAt(i), count);
				}
				System.out.println("Maps: "+maps);

				for(int i=0; i<s2.length();i++) {
					if(maps.containsKey(s2.charAt(i))) {
						int count = maps.get(s2.charAt(i)) -1;
						maps.put(s2.charAt(i), count);
					}
				}

				for(int value: maps.values()) {
					if(value != 0) {
						return false;
					}
				}
				return true;
		}
	}
}