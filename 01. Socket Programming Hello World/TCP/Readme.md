# TCP Socket Programming in Java

This project demonstrates a simple TCP socket communication between a client and a server. The server sends a "Hello" message to any client that connects.

## Prerequisites

- Java Development Kit (JDK) installed on your machine.

## Files

- `Server.java`: The server application that listens on a specific port and sends a "Hello" message to the client.
- `Client.java`: The client application that connects to the server and prints the received message.

## Steps to Run the Programs

### 1. Compile the Programs

First, you need to compile the Java source files. Open a terminal or command prompt, navigate to the directory containing the source files, and run:

```sh
javac Server.java Client.java
```

### 2. Run the Server

Start the server by running:

```sh
java Server
```

The server will start and listen on port `1234`.

### 3. Run the Client

In a new terminal or command prompt window, run the client:

```sh
java Client
```

The client will connect to the server, receive the "Hello" message, and print it out.

## How It Works

- **Server.java**
  - Creates a `ServerSocket` bound to port 1234.
  - Waits for a client to connect.
  - Sends a "Hello" message to the connected client.
  - Closes the connection to the client.

- **Client.java**
  - Connects to the server on `localhost` and port 1234.
  - Reads the message from the server.
  - Prints the received message to the console.

## Example Output

When you run the server and then the client, you should see the following output:

### Server Output

```
Server is listening on port 1234
New client connected
```

### Client Output

```
Message from server: Hello
```

## Notes

- Ensure that the server is running before you start the client.
- You can run multiple clients to see the server respond to each one individually.
- Modify the `port` variable in both `Server.java` and `Client.java` if you need to use a different port.

## Troubleshooting

- If the client cannot connect to the server, ensure that the server is running and listening on the correct port.
- Make sure no other application is using the specified port.

## License

This project is open-source and available under the MIT License.