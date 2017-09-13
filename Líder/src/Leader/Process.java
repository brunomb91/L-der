package Leader;
import Communication.Chat;

//Retirado e adaptado de https://www.tutorialspoint.com/java/java_thread_communication.htm

public class Process extends Thread {
	private int id;
	Chat m;
	private boolean leader;
	
	public Process(Chat m, boolean leader) {
		this.m = m;
		this.leader = leader;
	}
	
	@Override
	public void run() {
		if(leader==true) {
			m.question("election");
		}
		else {
			System.out.println((m.answer(getId())));
		}
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
}
