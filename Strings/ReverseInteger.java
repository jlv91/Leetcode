package Strings;

public class ReverseInteger {
     public static int reverse(int x) {
        boolean neg = x < 0;
        x  = Math.abs(x);
        int result = 0;
        int r = x % 10;
        
        while (x>0) {
            if (result > Integer.MAX_VALUE / 10)
                return 0;
            result = result * 10 + r;
            x = x / 10;
            r = x % 10;
        }
        if (neg)
            result = -result;
        return result;
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println(reverse(1534236469));
        System.out.println(reverse(321));
        System.out.println(reverse(-321));

    }
}
