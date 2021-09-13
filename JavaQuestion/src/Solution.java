import java.util.Locale;

public class Solution {

    public static String encryptROT13(String message) {
        StringBuilder sb = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                c += 13;
                if (Character.isLowerCase(c)) {
                    if (c > 122) {
                        c -= 26;
                    }
                } else {
                    if (c > 90) {
                        c -= 26;
                    }
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static long toOctal(long num) {
        return Long.parseLong(Long.toOctalString(num));
    }


    public static void main(String[] args) {
        System.out.println(encryptROT13("aBc123xYz")); // expected: nOp123kfm
        System.out.println(toOctal(15));
    }
}
