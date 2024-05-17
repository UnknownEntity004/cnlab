# TCP Socket Communication

This Java program demonstrates a simple TCP socket communication where a client and server exchange "Hello" messages.

## Files

- `TCPServer.java`: The server program that listens for incoming client connections and responds with a "Hello" message.
- `TCPClient.java`: The client program that connects to the server, sends a "Hello" message, and receives a response.

## Instructions

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

3. The client will connect to the server, send a "Hello" message, and receive a "Hello" response from the server.

### Example Output

#### Server
```
Server waiting for client connection...
Client: Hello from Client!
```

#### Client
```
Server: Hello from Server!
```