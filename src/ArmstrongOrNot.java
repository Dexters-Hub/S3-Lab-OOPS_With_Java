public class ArmstrongOrNot {
    public static void main(String[] args) {
        int num = 371, origNumber, rem, result = 0;

        origNumber = num;

        while (origNumber != 0)
        {
            rem = origNumber % 10;
            result += Math.pow(rem, 3);
            origNumber /= 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}