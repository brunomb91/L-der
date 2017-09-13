package Leader;
import java.util.ArrayList;
import Communication.Chat;

public class Process extends Thread {
	private int id;
	Chat m;
	private boolean leader;
	// private ArrayList<Integer> ids = new ArrayList<Integer>();
	
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
			//ids.add((int) (m.answer(getId())));
			System.out.println(m.answer(getId()));
		}
	}
	
	/*
	public ArrayList<Integer> listIds() {
		if(leader==true) {
			return ids;
		}
		return null;
	}
	*/
	
	public long getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
}
