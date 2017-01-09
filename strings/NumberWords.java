public class NumberWords {
	public static void main(String[] args) {
		int count = NumberWords.numberOfWords("        A     the house.");
		System.out.println("Number of words: "+count);
	}
	public static int numberOfWords(String s) {

		if(s.length()==0 || s==null) {
			return 0;
		}
		char prev = ' ';
		int count = 0;

		for(int i=0;i<s.length();i++) {
			char a = s.charAt(i);
			System.out.println(a);
			if(a != prev && prev == ' ') {
				count++;
			}
			prev = a;
		}
		return count;
	}
}