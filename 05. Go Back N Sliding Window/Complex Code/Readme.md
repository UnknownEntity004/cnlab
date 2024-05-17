### Go-Back-N Sliding Window Protocol Simulation

This Java program simulates the Go-Back-N sliding window protocol, a method used for reliable data transmission in computer networks. In this simulation, the sender sends a series of frames to the receiver, and the receiver sends acknowledgments (ACKs) back to the sender.

### How to Run

1. **Compile the Program**:
   ```
   javac GoBackN.java
   ```

2. **Run the Program**:
   ```
   java GoBackN
   ```

### Components

- **Main Class (`GoBackN`)**:
  - Sets up the sender and receiver with specified window size and total frames.
  - Links the sender and receiver to enable communication between them.
  - Initiates the sending process.

- **Sender Class**:
  - Manages the sending of frames, window size, and handling acknowledgments.
  - Simulates frame transmission and acknowledgment reception.
  - May simulate errors and retransmissions.

- **Receiver Class**:
  - Receives frames from the sender.
  - Sends acknowledgments back to the sender.
  - Discards out-of-order frames.

- **Frame Class**:
  - Represents a data frame with a sequence number.

### Behavior

- The sender sends frames in a sliding window fashion.
- Upon receiving an acknowledgment, the sender adjusts its base and removes acknowledged frames from the window.
- In case of a timeout or simulated error, the sender retransmits the frames in the window starting from the base.

### Example Output

```
Sender: Sending frame 0
Receiver: Received frame 0
Receiver: Sending ACK for frame 0
Sender: Received ACK for frame 0
Sender: Sending frame 1
Receiver: Received frame 1
Receiver: Sending ACK for frame 1
Sender: Received ACK for frame 1
Sender: Sending frame 2
Receiver: Received frame 2
Receiver: Sending ACK for frame 2
Sender: Received ACK for frame 2
Sender: Sending frame 3
Receiver: Received frame 3
Receiver: Sending ACK for frame 3
Sender: Received ACK for frame 3
Sender: Simulating error, retransmitting frames from 0
Sender: Sending frame 0
Receiver: Received frame 0
Receiver: Sending ACK for frame 0
Sender: Received ACK for frame 0
...
```

This output demonstrates the transmission of frames and acknowledgments in a Go-Back-N protocol simulation. It includes scenarios where frames are sent, acknowledgments are received, and retransmissions occur due to errors or timeouts.