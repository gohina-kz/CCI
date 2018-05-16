package strings;

import com.sun.deploy.util.ArrayUtil;
import com.sun.tools.javac.util.ArrayUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution1_3 {

    static String URLify(String str) {

        ArrayList<Character> arr = new ArrayList<>();
        char[] charArr = str.toCharArray();



        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == 32) {
                arr.add('%');
                arr.add('2');
                arr.add('0');
            } else {
                arr.add(charArr[i]);
            }
        }

        char[] modif_arr = new char[arr.size()];
        for (int j = 0; j < arr.size(); j++) {
            modif_arr[j] = arr.get(j);
        }

        return new String(modif_arr);
    }

    static String URLify_(String str) {
        int spaceCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int index = str.length() + spaceCount * 2;
        char[] arr = new char[index];
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {

                arr[index - 1] = '0';
                arr[index - 2] = '2';
                arr[index - 3] = '%';
                index -= 3;

            } else {
                arr[index - 1] = str.charAt(i);
                index--;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(URLify("Mr John Smith"));
        System.out.println(URLify_("Mr John Smith"));
    }

}
