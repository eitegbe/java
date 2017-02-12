public class RSP{

	/**
		Given a non-empty string check if it can be constructed by taking a substring of it 
		and appending multiple copies of the substring together. You may assume the given string consists of 
		lowercase English letters only and its length will not exceed 10000.
	**/
	public static void main(String[] args) {
		System.out.println(repeatedSubstringPattern("aba"));
	}

	public static boolean repeatedSubstringPattern(String s) {
		if (s == null || s.length() == 0) {
			return false;
		}

		int N = s.length();
		for(int i=(N/2); i>=1; i--) {
			if (N%i== 0) {
				int M = N/i;
				String sub =  s.substring(0, i);
				StringBuilder sb = new StringBuilder();
				for(int j = 0; j<M; j++) {
						sb.append(sub);
				}

				if (sb.toString().equals(s)) {
					return true;
				}
			}
		}

		return false;
	}
}