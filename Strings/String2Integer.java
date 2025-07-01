package Strings;

public class String2Integer {
     public static int myAtoi(String s) {
        s = s.stripLeading(); // ignore leading
        char[] chars = s.toCharArray();
        if (chars.length == 0)
            return 0;

        int i = 0;
        boolean neg = chars[i] == '-';
        if (chars[i] == '-' || chars[i] == '+') // consume -+
            i++;
        while (i < chars.length && chars[i] == '0') // consume 0
            i++; 

        int result = 0;
        while (i < chars.length) {
            int digit =  Character.getNumericValue(chars[i++]);
            if (digit > 9 || digit < 0) {
                if (neg) return -result;
                else return result;
            }
            
            if (neg == false && Integer.MAX_VALUE - result*10 < digit)
                    return Integer.MAX_VALUE;
            if (neg  && -(Integer.MIN_VALUE - result*10) < digit)
                    return Integer.MIN_VALUE;
             result = 10 * result + digit;
        }
        
        if (neg)
            result = -result;
        return result;

    }
    
        public static void main(String[] args) {
        System.out.println();
        System.out.println(myAtoi("-91283472332"));        
         System.out.println(myAtoi("2147483648"));        
       System.out.println(myAtoi("2147483646"));
         System.out.println(myAtoi("1337c0d3"));       
         System.out.println(myAtoi("  -042"));
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("w111"));
        }
    }
