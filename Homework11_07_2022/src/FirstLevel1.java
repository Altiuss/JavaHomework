import java.util.Arrays;

//You are given a large integer represented as an integer array digits,
// where each digits[i] is the i-th digit of the integer.
// The digits are ordered from most significant to least significant in left-to-right order.
// The large integer does not contain any leading 0's.
//Increment the large integer by one and return the resulting array of digits.
//Input: digits = [1,2,3]
//        Output: [1,2,4]
//        Explanation: The array represents the integer 123.
//        Incrementing by one gives 123 + 1 = 124.
//        Thus, the result should be [1,2,4].
//Input: digits = [9]
//        Output: [1,0]
//        Explanation: The array represents the integer 9.
//        Incrementing by one gives 9 + 1 = 10.
//        Thus, the result should be [1,0].
public class FirstLevel1 {
    public static void main(String[] args) {
        int[]digits = {1, 2, 3};

        for (int i = digits.length - 1; i >= 0; i--){
            if (digits[i] != 9){
                digits[i] = digits[i] + 1;
                break;
            } else {
                digits[i] = 0;
                int[] array  = new int[digits.length +1];
                array[0] = 1;
                System.out.println(Arrays.toString((array)));

            }

        }
        System.out.println(Arrays.toString(digits));
    }
}

