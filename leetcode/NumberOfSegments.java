public class NumberOfSegments {
    public int countSegments(String s) {
        if (s.length() == 0 || s == null) {
            return 0;
        }
        
        int count = 0;
        char prev = ' ';
        for(int i=0;i<s.length();i++) {
            char a = s.charAt(i);
            if(a!=prev && prev == ' ') {
                count++;
            }
            prev = a;
        }
        return count;
    }
}
