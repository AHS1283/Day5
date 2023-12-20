package oopsconcept;

public class Stopwatch {

        private long startTime;


        public void start() {
            startTime = System.currentTimeMillis();
            System.out.println("Stopwatch started...");
        }


        public void stop() {
            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;
            System.out.println("Stopwatch stopped.");
            System.out.println("Elapsed Time: " + elapsedTime + " milliseconds");
        }

        public static void main(String[] args) {
            Stopwatch stopwatch1 = new Stopwatch();


            stopwatch1.start();


            simulateActivity();

            stopwatch1.stop();
        }

        private static void simulateActivity() {
            try {

                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


