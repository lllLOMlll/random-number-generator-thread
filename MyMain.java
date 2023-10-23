package lab4_1;

public class MyMain {
    public static void main(String[] args) throws InterruptedException {
        int totalSum = 0;
        /* 
         * Creates an instance of the "RandomNumberGenerator" class 
         * and assigns it to the variable "randomNumberGenerator".
         */
        RandomNumberGenerator randomNumberGenerator1 = new RandomNumberGenerator();
        RandomNumberGenerator randomNumberGenerator2 = new RandomNumberGenerator();
        RandomNumberGenerator randomNumberGenerator3 = new RandomNumberGenerator();
        RandomNumberGenerator randomNumberGenerator4 = new RandomNumberGenerator();
        RandomNumberGenerator randomNumberGenerator5 = new RandomNumberGenerator();

       
        // Creates a new Thread object and assigns it to the variable thread....
        Thread thread1 = new Thread(randomNumberGenerator1);
        Thread thread2 = new Thread(randomNumberGenerator2);
        Thread thread3 = new Thread(randomNumberGenerator3);
        Thread thread4 = new Thread(randomNumberGenerator4);
        Thread thread5 = new Thread(randomNumberGenerator5);

       // Starting my threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        // The join() method is used to wait for a thread to finish its execution.
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();

        // Sum of each thread
        System.out.println();
        System.out.println("SUM OF EACH THREAD");
        System.out.println("Thread: " + thread1.getName() + " sum: " + randomNumberGenerator1.getSum());
        System.out.println("Thread: " + thread2.getName() + " sum: " + randomNumberGenerator2.getSum());
        System.out.println("Thread: " + thread3.getName() + " sum: " + randomNumberGenerator3.getSum());
        System.out.println("Thread: " + thread4.getName() + " sum: " + randomNumberGenerator4.getSum());
        System.out.println("Thread: " + thread5.getName() + " sum: " + randomNumberGenerator5.getSum());
        
        // Total sum
        totalSum = randomNumberGenerator1.getSum() + randomNumberGenerator2.getSum() + randomNumberGenerator3.getSum() +
            randomNumberGenerator4.getSum() + randomNumberGenerator5.getSum();

        System.out.println();
        System.out.println("TOTAL SUM");
        System.out.println("Total sum of 5 threads: " + totalSum);
    }
}
