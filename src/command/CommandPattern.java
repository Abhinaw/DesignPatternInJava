package command;

public class CommandPattern {

    public static void main(String[] args) {
        Task t1 = new Task(10, 12);  // encapsulates request
        Task t2 = new Task(11, 13);

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();//invoker
        thread2.start();
    }
}

class Task implements Runnable {
    int num1;
    int num2;

    public Task(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public void run() { // executor
        System.out.println(num1 * num2); // receiver
    }
}