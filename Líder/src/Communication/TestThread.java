package Communication;

//Retirado de https://www.tutorialspoint.com/java/java_thread_communication.htm

public class TestThread {
	public static void main(String[] args) {
	      Chat m = new Chat();
	      new T1(m);
	      new T2(m);
	   }
}
