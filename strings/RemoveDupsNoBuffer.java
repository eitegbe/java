public class RemoveDupsNoBuffer {

	public static void main(String[] args) {
		System.out.println(RemoveDupsNoBuffer.removeDups("aaabgh"));
	}

	public static String removeDups(String s) {
		if (s==null || s.length()==0) {
			return "Empty String";
		}
		int length = s.length();
		StringBuilder newString = new  StringBuilder();
		for(int i=0;i<length;i++) {
			boolean flag = false;
			for (int j = 0; j<i;j++) {
				if(s.charAt(i) == s.charAt(j)) {
					flag = true;
				}
			}
			//System.out.println("flaG: "+(flag));
			if (!flag) {
				//System.out.println(s.charAt(i));
				newString.append(s.charAt(i));
			}
		}
		return newString.toString();
	}
}