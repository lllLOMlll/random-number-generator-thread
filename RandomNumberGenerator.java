package lab4_1;

import java.util.Random;

class RandomNumberGenerator implements Runnable { // Implementing Runnable
    private int sum = 0;
    private Random random;

    public RandomNumberGenerator() {
        random = new Random();
    }

    @Override
    public void run() {
        int number;
        for (int i = 0; i < 1000; i++) {
        	/* random.nextInt(10)
        	 * Generate a random number between 0 and 9
        	 * +1 so it's a number between 1 and 10 (inclusive)
        	 */
            number = random.nextInt(10) + 1;
            /* synchronized
             * Every thread will be executed one at the time
             */
            synchronized (this) {
                sum += number;
            }
            System.out.println("Thread: " + Thread.currentThread().getName() + " random number: " + number);
        }
    }

    /* The synchronized keyword ensures that only one thread 
     * can access the method at a time.
     */
    public synchronized int getSum() {
        return sum;
    }
}