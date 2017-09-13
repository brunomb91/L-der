import Communication.Chat;

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
