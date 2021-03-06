package day15_04_05_2022;

public class P02_SumOfDigits {
    public static void main(String[] args) {
        /*
        Task 1 : Please implement this method to return the sum of all integers found in the parameter String.

                    String s="jav45ai1000sgre1at82"
                     result: 45+1000+1+82 ----> 1128
         */

        String s = "jav45ai1000sgre1at82";

        //           45 + 1000 + 1 + 82 --> 1128

        /*

            for (){

                if(isDigit){

                digits+=each;

                }
                else
                {
                    sum= convert this digits to Int
                    reset the digits variable
                }

            }

            System.out.println(sum);

         */


        System.out.println(sumOfDigits(s));

    }

    public static int sumOfDigits(String str) {

        String digits = "0";
        //String s = "jav45ai1000sgre1at82";

        /*
        Why we used 0 into digits ?
         if we dont have any number in String , it will give us NumberFormatException
         Since 0 has no effect to result  addition (+) operater, we used it to prevent Errors

         */

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {

                digits += str.charAt(i);

            } else {
                sum+= Integer.parseInt(digits);
                digits = "0";
            }
        }

        return sum+Integer.parseInt(digits);

    }


}
