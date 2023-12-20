package oopsconcept;

public class PerfectNumber {


        public static void main(String[] args) {

            int number = 28;


            if (isPerfectNumber(number)) {
                System.out.println(number + " is a Perfect Number.");
            } else {
                System.out.println(number + " is not a Perfect Number.");
            }
        }


        public static boolean isPerfectNumber(int number) {
            if (number <= 0) {
                return false;
            }

            int sum = 0;


            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }

            return sum == number;
        }
    }


