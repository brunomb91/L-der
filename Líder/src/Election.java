import java.util.ArrayList;

import Communication.Chat;

public class Election {
	private ArrayList<Process> listProcesses;
	
	public Election() {
		listProcesses = new ArrayList<Process>();
		
	}

	private void addProcesses(Process process) {
		listProcesses.add(process);
	}
	
	private void ringAlgorithm(int leader) {
		for (Process i : listProcesses) {
			System.out.println(i.getId());
		}
		
	}
	
	public static void main (String[] args) {
		Election election = new Election();
		Chat chat = new Chat();
		
		Process process1 = new Process(chat, true);
		Process process2 = new Process(chat, false);
		Process process3 = new Process(chat, false);
		
		process1.setId(1);
		process2.setId(2);
		process3.setId(3);
		
		election.addProcesses(process1);
		election.addProcesses(process2);
		election.addProcesses(process3);
		
		process1.start();
		process2.start();
		process3.start();
		
		election.ringAlgorithm(1);
	}
	
}
