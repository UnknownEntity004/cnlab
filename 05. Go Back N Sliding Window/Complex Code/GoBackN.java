import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class GoBackN {

    public static void main(String[] args) {
        int windowSize = 4;
        int totalFrames = 10;

        Sender sender = new Sender(windowSize, totalFrames);
        Receiver receiver = new Receiver();

        sender.setReceiver(receiver);
        receiver.setSender(sender);

        sender.startSending();
    }
}

class Frame {
    int seqNum;

    public Frame(int seqNum) {
        this.seqNum = seqNum;
    }
}

class Sender {
    private int windowSize;
    private int totalFrames;
    private int base;
    private int nextSeqNum;
    private Queue<Frame> window;
    private Receiver receiver;
    private Random random;

    public Sender(int windowSize, int totalFrames) {
        this.windowSize = windowSize;
        this.totalFrames = totalFrames;
        this.base = 0;
        this.nextSeqNum = 0;
        this.window = new LinkedList<>();
        this.random = new Random();
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public void startSending() {
        while (base < totalFrames) {
            while (nextSeqNum < base + windowSize && nextSeqNum < totalFrames) {
                sendFrame(new Frame(nextSeqNum));
                nextSeqNum++;
            }

            waitForAcknowledgment();

            if (!window.isEmpty() && random.nextBoolean()) {
                System.out.println("Sender: Simulating error, retransmitting frames from " + base);
                nextSeqNum = base;
            }
        }
        System.out.println("All frames sent and acknowledged.");
    }

    private void sendFrame(Frame frame) {
        window.add(frame);
        System.out.println("Sender: Sending frame " + frame.seqNum);
        receiver.receiveFrame(frame);
    }

    private void waitForAcknowledgment() {
        try {
            Thread.sleep(1000); // Simulate waiting time for ACK
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (!window.isEmpty()) {
            System.out.println("Sender: Timeout, resending frames from " + window.peek().seqNum);
            nextSeqNum = base;
        }
    }

    public void receiveAcknowledgment(int ackNum) {
        if (ackNum >= base) {
            System.out.println("Sender: Received ACK for frame " + ackNum);
            base = ackNum + 1;
            while (!window.isEmpty() && window.peek().seqNum <= ackNum) {
                window.poll();
            }
        }
    }
}

class Receiver {
    private Sender sender;
    private int expectedSeqNum;

    public Receiver() {
        this.expectedSeqNum = 0;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public void receiveFrame(Frame frame) {
        if (frame.seqNum == expectedSeqNum) {
            System.out.println("Receiver: Received frame " + frame.seqNum);
            expectedSeqNum++;
            sendAcknowledgment(frame.seqNum);
        } else {
            System.out.println("Receiver: Discarded out-of-order frame " + frame.seqNum);
        }
    }

    private void sendAcknowledgment(int seqNum) {
        System.out.println("Receiver: Sending ACK for frame " + seqNum);
        sender.receiveAcknowledgment(seqNum);
    }
}
