public class PalindromeOrNot {
    public static void main(String[] args) {
        int num = 121, revInteger = 0, rem, origInteger;
        origInteger = num;
        while( num != 0 )
        {
            rem = num % 10;
            revInteger = revInteger * 10 + rem;
            num  /= 10;
        }

        if (origInteger == revInteger)
            System.out.println(origInteger + " is a palindrome.");
        else
            System.out.println(origInteger + " is not a palindrome.");
    }
}