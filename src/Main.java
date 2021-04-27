public class Main {
    public static void main(String[] args) {

        PingPong pingPong = new PingPong();

        Consumer consumer = new Consumer(pingPong);
        Producer producer = new Producer(pingPong);

        Thread threadC = new Thread(consumer);
        Thread threadP = new Thread(producer);

        threadC.start();
        threadP.start();
    }
}
