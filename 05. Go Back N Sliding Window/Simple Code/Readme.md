# Go-Back-N Protocol Simulation

This Java program simulates the Go-Back-N sliding window protocol. The Go-Back-N protocol is a reliable data transfer protocol used in computer networks to ensure the reliable delivery of packets.

## Overview

The program prompts the user to enter the window size, simulates the transmission of frames within the window, and expects the user to input the last received acknowledgment. If an acknowledgment is received, the program adjusts the sequence number of the next frame to be sent accordingly. If the acknowledgment indicates the successful reception of all frames, the simulation ends.

## Running the Program

To run the program, follow these steps:

1. Compile the Java file:
   ```sh
   javac GoBackN.java
   ```

2. Run the compiled program:
   ```sh
   java GoBackN
   ```

3. Follow the on-screen instructions:
   - Enter the window size when prompted.
   - Input the last acknowledgment received after each window of frame transmissions.

## Example Usage

Here's an example interaction with the program:

```
Please enter the Window Size: 
4
Frame 0 has been transmitted.
Frame 1 has been transmitted.
Frame 2 has been transmitted.
Frame 3 has been transmitted.
Please enter the last Acknowledgement received.
2
Frame 2 has been transmitted.
Frame 3 has been transmitted.
Please enter the last Acknowledgement received.
3
Frame 3 has been transmitted.
Please enter the last Acknowledgement received.
4
```

In this example, a window size of 4 is used. Frames are transmitted sequentially, and the last acknowledgment received indicates the successful reception of all frames.

## Notes

- The program assumes reliable transmission within the simulated environment and does not introduce packet loss or errors.
- It provides a basic simulation of the Go-Back-N protocol and can be expanded to include error handling and more complex scenarios.

---