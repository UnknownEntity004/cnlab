# TCP File Transfer

This Java program demonstrates file transfer using TCP sockets over a wired network. The program consists of a server and a client. The client sends a file to the server, which receives and saves it.

## Files

- `TCPServer.java`: The server program that listens for incoming client connections and receives a file.
- `TCPClient.java`: The client program that connects to the server and sends a file.

## Instructions

### Prepare a File to Send

Create a text file named `send_file.txt` in the same directory as your Java files. This file will be sent from the client to the server.

### Compile

1. Open a terminal or command prompt.
2. Navigate to the directory containing the Java files.
3. Compile the server and client programs:
   ```sh
   javac TCPServer.java
   javac TCPClient.java
   ```

### Run

1. Start the server:
   ```sh
   java TCPServer
   ```
   The server will start and wait for a client connection.

2. Open another terminal or command prompt and start the client:
   ```sh
   java TCPClient
   ```

3. The client will connect to the server and send the `send_file.txt` file.

### Check the Received File

After the file transfer is complete, you should see a file named `received_file.txt` in the same directory as your Java files on the server side. This file should be a copy of the `send_file.txt` file.

### Example Output

#### Server
```
Server waiting for client connection...
Client connected.
File received.
```

#### Client
```
Connected to server.
File sent.
```