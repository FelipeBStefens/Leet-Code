package Easy;

public class LengthOfLastWorld {
    
    public int lengthOfLastWord(String s) {
     
        s = s.strip();
        int length = 0;

        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) != ' ') {
            
            length++;
            i--;
        }        

        return length; 
    }
}