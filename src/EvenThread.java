public class EvenThread extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + "\t");
                    Thread.sleep(15);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
