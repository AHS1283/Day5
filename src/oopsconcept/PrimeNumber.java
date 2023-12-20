package oopsconcept;

public class PrimeNumber {

        public static void main(String[] args) {

            int number = 13;


            if (isPrimeNumber(number)) {
                System.out.println(number + " is a Prime Number.");
            } else {
                System.out.println(number + " is not a Prime Number.");
            }
        }


        public static boolean isPrimeNumber(int number) {
            if (number <= 1) {
                return false;
            }

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }

            return true;
        }
    }


