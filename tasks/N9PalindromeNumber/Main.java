package tasks.N9PalindromeNumber;



public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(0));;
        System.out.println(123 % 10);
    }


    public static boolean isPalindrome(int x) {
        String integerAsAString = String.valueOf(x);
        char[] chars = integerAsAString.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

//    //not converting to String
//    public static boolean isPalindrome(int x) {
//        int originalNumber = x;
//        int reverseNumber = 0;
//        while(originalNumber != 0) {
//            reverseNumber = reverseNumber * 10 + originalNumber % 10;
//        }
//    }
}
