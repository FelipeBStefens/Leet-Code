package Easy;

public class LongestCommomPrefix {

    public String longestCommonPrefix(String[] strs) {
        
        StringBuilder prefix = new StringBuilder("");

        int i = 0;
        while (true) { 

            if (i == strs[0].length()) {
                break;
            }

            prefix.append(strs[0].charAt(i));
            boolean hasNext = true; 
            for (int j = 1; j < strs.length; j++) {
                
                if (strs[j].length() <= i || prefix.charAt(i) != strs[j].charAt(i)) {
                    prefix.delete(prefix.length() - 1, prefix.length());
                    hasNext = false;
                    break;
                }
            }

            if (hasNext) {
                i++;
            }
            else {
                break;
            }
        }

        return prefix.toString();
    }
}