public class Consumer implements Runnable {

    PingPong pingPong;

    public Consumer(PingPong pingPong) {
        this.pingPong = pingPong;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            pingPong.ping();
        }
    }
}
