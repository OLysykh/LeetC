package T09_PalindromNumber;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        //brute force
//            String s = String.valueOf(x);
//            char[] chars = s.toCharArray();
//            for (int i = 0; i < chars.length / 2; i++) {
//                if (chars[i] != chars[chars.length - 1 - i]) {
//                    return false;
//                }
//            }
//            return true;


        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int halfNumber = 0;
        while (x > halfNumber) {
            halfNumber = (halfNumber * 10) + x % 10;
            x /= 10;
        }
        return x == halfNumber || x == halfNumber / 10;
    }
}

