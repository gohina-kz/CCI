package strings;

public class Solution1_5 {

    static boolean equaLength(String str1, String str2) {
        int counter = 0;

        for (int i = 0; i < str1.length(); i++) {

            if (str1.charAt(i) != str2.charAt(i)) {
                counter++;

                if (counter > 1) {
                    return false;
                }
            }

        }

        return true;
    }

    static boolean diffLength(String str1, String str2) {

        int p1 = 0;
        int p2 = 0;
        int counter = 0;

        while (p1 < str1.length() && p2 < str2.length()) {
            if (str1.charAt(p1) == str2.charAt(p2)) {
                p1++;
                p2++;
            } else {
                p1++;
                counter++;

                if (counter > 1) {
                    return false;
                }

            }


        }

        return true;
    }

    static boolean one_away(String str1, String str2) {
        if (str1.length() == str2.length()) {

            return equaLength(str1, str2);

        } else if (str1.length() - str2.length() == -1 || str1.length() - str2.length() == 1) {

            return diffLength(str1, str2);

        }

        return diffLength(str2, str1);
    }

    public static void main(String[] args) {
        System.out.println(one_away("pale", "ple"));
        System.out.println(one_away("pales", "pale"));
        System.out.println(one_away("pale", "bale"));
        System.out.println(one_away("pale", "bake"));
    }

}
