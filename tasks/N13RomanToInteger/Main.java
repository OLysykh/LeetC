package tasks.N13RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }


    public static int romanToInt(String s) {
        Map<Character, Integer> romanToIntMap = new HashMap<>();
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);


        int result = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int current = romanToIntMap.get(s.charAt(i));

            if(current < prev){
                result -= current;
            }else{
                result += current;
            }
            prev = current;
        }
        System.out.println("yoyoy");
        return result;

    }
}
