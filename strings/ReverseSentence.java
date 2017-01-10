import java.util.*;
public class ReverseSentence {
	
	public static void main(String[] args) {

		System.out.println(ReverseSentence.reverseSentence("I love you"));

	}

	public static String reverseSentence(String s) {
		if (s==null || s.length()==0) {
			return "Empty";
		}

		StringBuilder stringBuilder = new StringBuilder();
		String[] a = s.split("\\b");
		for(int i =a.length-1; i>=0;i--) {
			stringBuilder.append(a[i]);
		}

		return stringBuilder.toString();
	}
}