class MultiThread extends Thread {
    public void run() {
        System.out.println("\nRunning Thread Name: " + Thread.currentThread().getName());
        System.out.println("\nRunning Thread Priority: " + Thread.currentThread().getPriority());
    }
}

class multithreading {
    public static void main(String[] args) {
        try {
            MultiThread multiThread1 = new MultiThread();
            multiThread1.setName("First Thread");
            multiThread1.setPriority(Thread.MIN_PRIORITY);
            MultiThread multiThread2 = new MultiThread();
            multiThread2.setName("Second Thread");
            multiThread2.setPriority(Thread.MAX_PRIORITY);
            MultiThread multiThread3 = new MultiThread();
            multiThread3.setName("Third Thread");
            multiThread1.start();
            multiThread2.start();
            multiThread3.start();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception caught\n");
        }
    }
}