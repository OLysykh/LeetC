package T013_Roman_To_Integer;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }

    public static int romanToInt(String s) {
        //a less quick solution
//        Map<Character, Integer> map = new HashMap<>();
//        map.put('I', 1);
//        map.put('V', 5);
//        map.put('X', 10);
//        map.put('L', 50);
//        map.put('C', 100);
//        map.put('D', 500);
//        map.put('M', 1000);
//
//        int result = 0;
//         for (int i = 0; i < s.length(); i++) {
//             int currentElement = map.get(s.charAt(i));
//             if (i < s.length()-1 &&  currentElement < map.get(s.charAt(i + 1))) {
//                 result -= currentElement;
//             }else {
//                 result += currentElement;
//         }
//            }
//         return result;


        //quicker solution
        int result = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int current = romanValue(s.charAt(i));
            if (current < prev) {
                result -= current;
            } else {
                result += current;
            }
            prev = current;

        }
        return result;
    }

    private static int romanValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }

    }
}