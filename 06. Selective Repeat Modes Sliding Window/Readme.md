# Selective Repeat Sliding Window Protocol

PS: Write a program to simulate Selective Repeat Modes Sliding Window Protocol in peer-to-peer mode.

## Files

- `SelectiveRepeat.java`: Contains the implementation of the Selective Repeat Sliding Window Protocol.

## Instructions

### Compile

1. Open a terminal or command prompt.
2. Navigate to the directory containing `SelectiveRepeat.java`.
3. Compile the Java file:
   ```sh
   javac SelectiveRepeat.java
   ```

### Run

1. Run the compiled Java program:
   ```sh
   java SelectiveRepeat
   ```

### Example Interaction

```sh
Enter the total number of frames to be sent: 5
Enter the window size: 3
Sending frame: 0
Sending frame: 1
Sending frame: 2
Enter the acknowledgment received (or -1 if no acknowledgment): 1
Acknowledgment received for frame: 1
Sending frame: 3
Sending frame: 2
Enter the acknowledgment received (or -1 if no acknowledgment): 2
Acknowledgment received for frame: 2
Sending frame: 4
Enter the acknowledgment received (or -1 if no acknowledgment): 0
Acknowledgment received for frame: 0
Sending frame: 4
Enter the acknowledgment received (or -1 if no acknowledgment): 3
Acknowledgment received for frame: 3
Enter the acknowledgment received (or -1 if no acknowledgment): 4
Acknowledgment received for frame: 4
All frames have been sent and acknowledged successfully.
```

### Description

- **Frames and Window:** The program initializes an array of `Frame` objects, each representing a frame to be sent. The window size determines the number of frames that can be sent before waiting for acknowledgments.
- **Sending Frames:** The program simulates sending frames within the current window by printing their frame numbers to the console.
- **Receiving Acknowledgments:** The user is prompted to enter received acknowledgments. Valid acknowledgments mark corresponding frames as received.
- **Sliding Window:** The window slides forward based on received acknowledgments. Frames that have not been acknowledged are retransmitted.

### Customization

- Modify the total number of frames and the window size to fit different scenarios.
- The program can be expanded to simulate network delays and frame losses for a more comprehensive simulation.

### Notes

- This program is a basic simulation and does not include actual network communication.
- The simulation assumes that user input accurately reflects the acknowledgments that would be received in a real network scenario.