# UDP Socket Programming in Java

This project demonstrates a simple UDP socket communication between a client and a server. The server sends a "Hello" message to any client that sends a request.

## Prerequisites

- Java Development Kit (JDK) installed on your machine.

## Files

- `HelloUDPServer.java`: The server application that listens on a specific port and sends a "Hello" message to the client.
- `HelloUDPClient.java`: The client application that sends a request to the server and prints the received message.

## Steps to Run the Programs

### 1. Compile the Programs

First, you need to compile the Java source files. Open a terminal or command prompt, navigate to the directory containing the source files, and run:

```sh
javac HelloUDPServer.java HelloUDPClient.java
```

### 2. Run the Server

Start the server by running:

```sh
java HelloUDPServer
```

The server will start and listen on port `1234`.

### 3. Run the Client

In a new terminal or command prompt window, run the client:

```sh
java HelloUDPClient
```

The client will send a request to the server, receive the "Hello" message, and print it out.

## How It Works

- **HelloUDPServer.java**
  - Creates a `DatagramSocket` bound to port 1234.
  - Waits for a client to send a datagram packet.
  - Sends a "Hello" message back to the client.

- **HelloUDPClient.java**
  - Creates a `DatagramSocket` to send and receive packets.
  - Sends an empty datagram packet to the server.
  - Receives the "Hello" message from the server.
  - Prints the received message to the console.

## Example Output

When you run the server and then the client, you should see the following output:

### Server Output

```
Server is listening on port 1234
```

### Client Output

```
Message from server: Hello
```

## Notes

- Ensure that the server is running before you start the client.
- You can run multiple clients to see the server respond to each one individually.
- Modify the `port` variable in both `HelloUDPServer.java` and `HelloUDPClient.java` if you need to use a different port.

## Troubleshooting

- If the client cannot communicate with the server, ensure that the server is running and listening on the correct port.
- Make sure no other application is using the specified port.

## License

This project is open-source and available under the MIT License.