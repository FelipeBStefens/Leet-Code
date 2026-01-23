package Easy;

public class RomanToInteger {
    
    public int romanToInt(String s) {
        
        int number = 0;

        int i = 0;
        while (i < s.length()) {

            switch (s.charAt(i)) {
                case 'I' -> {
                    
                    if (i + 1 < s.length() && s.charAt(i + 1) == 'V') {
                        number += 4;
                        i += 2;
                    }
                    else if (i + 1 < s.length() && s.charAt(i + 1) == 'X') {
                        number += 9;
                        i += 2;
                    }
                    else {
                        number++;
                        i++;
                    }
                }
                case 'V' -> {
                    number += 5;
                    i++;
                }
                case 'X' -> {

                    if (i + 1 < s.length() && s.charAt(i + 1) == 'L') {
                        number += 40;
                        i += 2;
                    }
                    else if (i + 1 < s.length() && s.charAt(i + 1) == 'C') {
                        number += 90;
                        i += 2;
                    }
                    else {
                        number += 10;
                        i++;
                    }
                }
                case 'L' -> {
                    number += 50;
                    i++;
                }
                case 'C' -> {

                    if (i + 1 < s.length() && s.charAt(i + 1) == 'D') {
                        number += 400;
                        i += 2;
                    }
                    else if (i + 1 < s.length() && s.charAt(i + 1) == 'M') {
                        number += 900;
                        i += 2;
                    }
                    else {
                        number += 100;
                        i++;
                    }
                }
                case 'D' -> {
                    number += 500;
                    i++;
                }
                case 'M' -> {
                    number += 1000;
                    i++;
                }
            }
        }

        return number;
    }
}
