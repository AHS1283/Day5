package oopsconcept;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
public class CouponNumbers {


        public static void main(String[] args) {

            int numberOfCoupons = 10;


            int totalRandomNumbers = generateDistinctCoupons(numberOfCoupons);


            System.out.println("Total random numbers needed to have all distinct coupons: " + totalRandomNumbers);
        }


        public static int generateDistinctCoupons(int numberOfCoupons) {
            Set<Integer> distinctCoupons = new HashSet<>();
            Random random = new Random();
            int totalRandomNumbers = 0;

            while (distinctCoupons.size() < numberOfCoupons) {
                int randomCoupon = getRandomCoupon(random, numberOfCoupons);
                distinctCoupons.add(randomCoupon);
                totalRandomNumbers++;
            }

            return totalRandomNumbers;
        }


        public static int getRandomCoupon(Random random, int numberOfCoupons) {
            return random.nextInt(numberOfCoupons) + 1;
        }
    }


