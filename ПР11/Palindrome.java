public class Palindrome {

    public static boolean isPal(String s, int l, int r) {
        if (l >= r) return true;
        if (s.charAt(l) != s.charAt(r)) return false;
        return isPal(s, l + 1, r - 1);
    }

    public static void main(String[] args) {
        System.out.println(isPal("radar", 0, 4) ? "YES" : "NO");
    }
}
