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

    public static void main(String[] args) {
        System.out.println(isUnique("adeff"));
    }

}
