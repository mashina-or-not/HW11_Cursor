public class Producer implements Runnable{

    PingPong pingPong;

    public Producer(PingPong pingPong) {
        this.pingPong = pingPong;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            pingPong.pong();
        }
    }
}
