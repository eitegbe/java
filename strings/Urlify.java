public class Urlify {
	

	public static void main(String[] args) {

		System.out.println(Urlify.urlify("Mr John Smith    ", 13));

	}

	public static String urlify(String s, int length) {
	   // if s.length() != length() {
	   // 	thrown new Error("Cc");
	   // }

	    s = s.trim();
	   char[] a = s.toCharArray();

	   StringBuilder sb = new StringBuilder();
	   for (char i: a) {
	   		if (i == ' ' ) {
	   			sb.append("%20");
	   		}
	   		else {
	   			sb.append(i);
	   		}
	   }
	   return sb.toString();
	}
}