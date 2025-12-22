public class ThreadDemo {
    public static void main(String[] args) {
        // 1. Identification of the 'calling thread' (the one running main)
        String callerName = Thread.currentThread().getName();
        System.out.println("Calling Thread: " + callerName);

        // 2. Creating a new thread
        Thread childThread = new Thread(() -> {
            // This code runs in a separate thread
            String currentName = Thread.currentThread().getName();
            System.out.println("Child Thread: " + currentName + " is working...");
        });

        Thread childThread2 = new Thread(() -> {
            String currentName = Thread.currentThread().getName();
            System.out.println("Child Thread: " + currentName + " is working ...");
        });

        // 3. The calling thread triggers the child thread
        childThread.start(); 

        try {
            // The calling thread (main) waits for childThread to finish
            System.out.println(callerName + " is now waiting for child...");
            childThread.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        childThread2.start();

        System.out.println(callerName + " finished waiting.");

        
    }
}
