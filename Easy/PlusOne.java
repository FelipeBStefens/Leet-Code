package Easy;

public class PlusOne {
    
    public int[] plusOne(int[] digits) {
        
        boolean addOne = true;
        for (int i = digits.length - 1; i >= 0; i--) {

            if (addOne) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                }
                else {
                    digits[i]++;
                    addOne = false;
                }
            }
        }

        if (addOne) {

            int[] newNumber = new int[digits.length + 1];
            newNumber[0] = 1;

            for (int i = 1; i < newNumber.length; i++) {
                newNumber[i] = digits[i - 1];
            }

            return newNumber;
        }
        return digits;
    }
}