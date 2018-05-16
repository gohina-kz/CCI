package strings;

import java.util.HashMap;

public class Solution1_1 {

    static boolean isUnique(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            } else {
                return false;
            }

        }

        return true;
    }


    static boolean isUnique_2(String str) {
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);

            if(char_set[val]) { // if already found
                return false;
            }

            char_set[val] = true;
        }

        return true;

    }

    public static void main(String[] args) {
        System.out.println(isUnique("adeff"));
    }

}
