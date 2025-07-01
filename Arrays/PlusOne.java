package Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int [] tmp = new int[digits.length+1];
        int r = 0;
        int i = 0;
        for (;i < digits.length; i++) {
            int d = digits[digits.length - 1 - i];
            if (i == 0) {
                d = d+1;
            }
            d = d + r;
            if (d > 9) {
                r = 1;
                d = 0;
            }
            else {
                r = 0;
            }
               
            tmp[i] = d;
        }
        if (r == 1) {
            tmp[i] = r;
        }
        else 
            i--;

        int [] res = new int[i+1];
        for (int j = i; j>=0; j--) {
            res[i-j] = tmp[j];
        }
        return res;
    }
    // tellement plus simple!
    public static int[] plusOne2(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
    public static void main(String[] args) {
        int[] digits = {9,9,9,9};
        System.out.println();
        for (int d : plusOne2(digits)) {
            System.out.println(d);
        }
    }
}
