package shortest_job_first;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class shortest_Job_First {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter total number of processes : ");
		int a = s.nextInt(); //a contains total no of processes

		String[] name = new String[a]; // Array for Process ID's
		int[] Burst_time = new int[a]; // Array for Burst Time
		int[] waitTime = new int[a]; // Array for waiting time
		int total_wait_time = 0;
		int total_turnaround_time = 0;
		
		System.out.println("Enter process ID's");
		for (int i = 0; i < a; i++) {
			name[i] = s.next();
		}
		System.out.println("Enter Processes Burst time");
		for (int i = 0; i < a; i++) {
			Burst_time[i] = s.nextInt();
		}
		
		Integer[] idx = new Integer[a];
		for( int i = 0 ; i < idx.length; i++ ){
			idx[i] = i;              
		}
		Arrays.sort(idx, new Comparator<Integer>() {
		    public int compare(Integer i1, Integer i2) {                        
		        return Double.compare(Burst_time[i1], Burst_time[i2]);
		    }                   
		});
		
		System.out.println("Execution order\t\tProcess ID\tBurst Time\tWaiting Time\tTurn around time");
		
		for (int i = 0; i < a; i++) {
			//calculate waiting time of each process
			if (i == 0) {
				waitTime[i] = 0;
			}
			int b = i;
			while (b > 0) {
				waitTime[i] += Burst_time[idx[--b]];
			}
			
			total_wait_time += waitTime[i];	//calculate average waiting time
			total_turnaround_time += Burst_time[i]+waitTime[i];	//calculate average turnaround time
		}
		
		for (int i = 0; i < a; i++) {
			//Display P_Id, Burst waiting and turn around time
			System.out.println((i+1)+"\t\t\t"+name[idx[i]]+"\t\t"+Burst_time[idx[i]]+"\t\t"+waitTime[i]+"\t\t"+(Burst_time[idx[i]]+waitTime[i]));
			
		}
		System.out.println("Average waiting time = " + total_wait_time/a);
		System.out.println("Average Turn around time = " + total_turnaround_time/a);
	}
}
