package bestFit_firstFit;

import java.util.ArrayList;

public class Best_Fit {

	ArrayList<Integer> ms;
	ArrayList<Integer> ps;
	
	Best_Fit(ArrayList<Integer> memory_slots, ArrayList<Integer> processes_size) {
		this.ms = memory_slots;
		this.ps = processes_size;
		
		operate();
	}
	
	public void operate(){
		ms.sort(null);
		for (int i = 0; i < ps.size() ; i++) {
			outerloop:
			for (int j = 0; j < ms.size(); j++) {
				if (ps.get(i) <= ms.get(j)) {
					System.out.println("Process of size"+ps.get(i)+" is mapped into memory block of size "+ms.get(j));
					ms.remove(j);
					break outerloop;
				}	
			}
		}
	}
}
