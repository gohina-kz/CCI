package strings;

import java.util.HashMap;
import java.util.Map;

public class Solution1_4 {

    static boolean isPalindrome_(String str) {
        char[] charArr = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] != ' ') {
                if (!map.containsKey(charArr[i])) {
                    map.put(charArr[i], 1);
                } else {
                    int val = map.get(charArr[i]);
                    map.put(charArr[i], ++val);
                }
            }
        }

        int counter = 0;
        for (Map.Entry<Character, Integer> pair : map.entrySet()) {
            if (pair.getValue() % 2 != 0) {
                counter++;

                if (counter > 1) {
                    return false;
                }
            }
        }

        return true;

    }
    
    public static void main(String[] args) {
        System.out.println(isPalindrome_("taco cat"));
        System.out.println(isPalindrome_("atco cta"));
        System.out.println(isPalindrome_("tactcoapapa"));
        System.out.println(isPalindrome_("aabbccdef"));
    }
}
