package peterson;

import java.lang.Thread;

public class Peterson {

    int turn;
    boolean flag[] = new boolean[2];
    int i = 0, j = 1;
    int counter = 0;
    int shared_variable = 0;

    public Peterson() {
        // TODO Auto-generated constructor stub
        Thread I = new i_Thread();
        Thread J = new j_Thread();

        I.start();
        J.start();
    }

    class i_Thread extends Thread {
        public void run() {
            do {
                flag[i] = true;
                turn = j;
                while (flag[j] && turn == j) {
                    // busy waiting
                }
                // go to critical section i.e., access the shared item
                System.out.println("i in critical section");
                shared_variable++;
                System.out.println("Shared Variable ; " + shared_variable);
                counter++;
                System.out.println("Counter : " + counter);

                flag[i] = false;
                // go to remainder section
            } while (shared_variable <= 5);
        }
    }

    class j_Thread extends Thread {
        public void run() {
            do {
                flag[j] = true;
                turn = i;
                while (flag[i] && turn == i) {
                    // busy waiting
                }
                // go to critical section i.e., access the shared item
                System.out.println("j in critical section");
                shared_variable--;
                System.out.println("Shared Variable ; " + shared_variable);
                counter++;
                System.out.println("Counter : " + counter);

                flag[j] = false;
                // go to remainder section
            } while (shared_variable <= 5);
        }
    }

    public static void main(String[] args) {
        new Peterson();
    }
}
