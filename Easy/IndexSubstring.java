package Easy;

public class IndexSubstring {
    
    public int strStr(String haystack, String needle) {

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {

            boolean isTrue = true;
            for (int j = 0; j < needle.length(); j++) {

                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    isTrue = false;
                    break;
                }
            }

            if (isTrue) {
                return i;
            }
        }

        return -1;
    }
}
