import java.util.*;

public class p8 {
    public static String encode(String s) {
        StringBuilder out = new StringBuilder();
        Map<Character, Integer> occ = new HashMap<>();
        for (int i = 0; i < s.length(); i++) { // single loop
            char ch = s.charAt(i);            // fast per-char access
            if (ch == ' ') {                  // keep spaces as-is
                out.append(' ');
                continue;
            }
            int k = occ.getOrDefault(ch, 0);  // how many seen so far
            if (k == 0) {
                out.append(ch);               // first time: print the char
            } else {
                out.append(k);                // next times: print its count
            }
            occ.put(ch, k + 1);               // increment for next time
        }
        return out.toString();
    }

    public static void main(String[] args) {
        String in = "hello world";
        System.out.println(encode(in)); // he121 w2r3d
    }
}
