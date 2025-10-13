package functional_interfaces;


public class backgroundJob {
	 public static void main(String[] args) {
	        System.out.println("Main thread started...");

	        Runnable backgroundTask = () -> {
	            System.out.println("Background job started...");
	            try {
	                for (int i = 1; i <= 5; i++) {
	                    System.out.println("Processing task " + i + " in background...");
	                    Thread.sleep(1000); 
	                }
	            } catch (InterruptedException e) {
	                System.out.println("Background job interrupted!");
	            }
	            System.out.println("Background job finished!");
	        };

	 
	        Thread backgroundThread = new Thread(backgroundTask);
	        backgroundThread.start();


	        System.out.println("Main thread continues executing other work...");
	    }
}