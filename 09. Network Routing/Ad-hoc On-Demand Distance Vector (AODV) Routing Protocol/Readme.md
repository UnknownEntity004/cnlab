# AODV Routing Protocol Simulation

This Java program simulates a basic version of the Ad-hoc On-Demand Distance Vector (AODV) routing protocol. It finds the shortest path between a source node and a destination node in an ad-hoc network.

## Files

- `AODV.java`: Contains the implementation of a simplified AODV routing protocol.

## Instructions

### Compile

1. Open a terminal or command prompt.
2. Navigate to the directory containing `AODV.java`.
3. Compile the Java file:
   ```sh
   javac AODV.java
   ```

### Run

1. Run the compiled Java program:
   ```sh
   java AODV
   ```

### Example Output

```
Route: 
0 2 4 5 
```

### Description

- The program initializes an ad-hoc network with nodes and edges (bidirectional links with weights).
- It simulates route discovery by finding the shortest path from a specified source node (node 0) to a destination node (node 5).
- The output displays the sequence of nodes representing the route from the source to the destination.

### Customization

- Add or remove nodes and edges in the `main` method to represent different network topologies.
- Change the source and destination nodes by modifying the arguments in the `findRoute` method call.