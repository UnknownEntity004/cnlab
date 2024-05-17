# UDP File Transfer

This Java program demonstrates file transfer using UDP sockets between two machines. The program consists of a server and a client. The client sends a file to the server, which receives and saves it.

## Files

- `UDPServer.java`: The server program that listens for incoming client connections and receives a file.
- `UDPClient.java`: The client program that connects to the server and sends a file.

## Instructions

### Prepare Files to Send

Create the files (`send_file.txt`, `send_file.mp3`, `send_file.mp4`, etc.) in the same directory as your Java files. This example uses `send_file.txt` as the file to be sent.

### Compile

1. Open a terminal or command prompt.
2. Navigate to the directory containing the Java files.
3. Compile the server and client programs:
   ```sh
   javac UDPServer.java
   javac UDPClient.java
   ```

### Run

1. Start the server:
   ```sh
   java UDPServer
   ```
   The server will start and wait for a client connection.

2. Open another terminal or command prompt and start the client:
   ```sh
   java UDPClient
   ```

3. The client will connect to the server and send the specified file.

### Check the Received File

After the file transfer is complete, you should see a file named `received_<original_filename>` in the same directory as your Java files on the server side. This file should be a copy of the file sent by the client.

### Example Output

#### Server
```
Server is waiting for file...
File send_file.txt received.
```

#### Client
```
Connected to server.
File send_file.txt sent.
```

### Notes

- This program uses UDP, which does not guarantee delivery. For large files or critical applications, TCP is recommended.
- Ensure that the file to be sent exists in the specified location before running the client.
- Adjust file names and paths as necessary for different types of files (text, script, audio, video).