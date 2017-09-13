package Communication;

//Retirado e adaptado de https://www.tutorialspoint.com/java/java_thread_communication.htm

public class Chat {
	 boolean flag = false;

	   public synchronized void question(String msg) {
	      if (flag) {
	         try {
	            wait();
	         }catch (InterruptedException e) {
	            e.printStackTrace();
	         }
	      }
	      System.out.println(msg);
	      flag = true;
	      notify();
	   }

	   public synchronized void answer(String msg) {
	      if (!flag) {
	         try {
	            wait();
	         }catch (InterruptedException e) {
	            e.printStackTrace();
	         }
	      }

	      System.out.println(msg);
	      flag = false;
	      notify();
	   }

	   public synchronized long answer(long id) {
		      if (!flag) {
		         try {
		            wait();
		         }catch (InterruptedException e) {
		            e.printStackTrace();
		         }
		      }
		      notify();
		      return id;
		   }

}
