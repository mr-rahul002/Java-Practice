/**
 * rev
 */
public class rev {
    public static void main(String[] args) {
        String s = "Rev";
        String a = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            a += s.charAt(i);

        }
        System.out.println(a);
    }

}