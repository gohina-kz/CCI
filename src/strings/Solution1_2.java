package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution1_2 {

    static boolean isPermutated(String str1, String str2) {

        if (str1.length() == str2.length()) {
            HashMap<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < str1.length(); i++) {

                if (!map.containsKey(str1.charAt(i))) {
                    map.put(str1.charAt(i), 1);
                } else {
                    int val = map.get(str1.charAt(i));
                    map.put(str1.charAt(i), ++val);
                }
            }

            for (int j = 0; j < str2.length(); j++) {
                if (!map.containsKey(str2.charAt(j))) {
                    return false;
                } else {
                    int val = map.get(str2.charAt(j));
                    map.put(str2.charAt(j), --val);
                }
            }

            for (Map.Entry<Character, Integer> pair : map.entrySet()) {
                if (pair.getValue() != 0) {
                    return false;
                }
            }

        }

        return true;

    }


    static String sort(String str) {
        char[] content = str.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    static boolean isPermutated_(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        return sort(str1).equals(sort(str2));
    }


    public static void main(String[] args) {
        System.out.println(isPermutated("BAC", "ABC"));
        System.out.println(isPermutated("BAC", "CAB"));
        System.out.println(isPermutated("BAC", "AAA"));
    }
}
