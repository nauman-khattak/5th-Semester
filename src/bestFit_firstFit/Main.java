package bestFit_firstFit;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter total no of memory slots: ");
        int memorySlots = s.nextInt();

        ArrayList<Integer> memory_slots = new ArrayList<>(memorySlots);
        ArrayList<Integer> processes_size = new ArrayList<>(memorySlots);

        System.out.println("Enter size of each memory block");
        for (int i = 0; i < memorySlots; i++) {
            memory_slots.add(s.nextInt());
        }

        System.out.println("Enter size of every incoming process");
        for (int i = 0; i < memorySlots; i++) {
            processes_size.add(s.nextInt());
        }

        do {
            System.out.println("Enter your choice\n1. First Fit\n2. Best Fit\n3. Exit");
            int choice = s.nextInt();

            switch (choice) {

                case 1:
                    new First_Fit(memory_slots, processes_size);
                    break;

                case 2:
                    new Best_Fit(memory_slots, processes_size);
                    break;
                case 3:
                    System.exit(0);
            }
        } while (true);
    }
}
