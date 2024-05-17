# Shortest Path Routing using Dijkstra's Algorithm

This Java program demonstrates the implementation of the Shortest Path Routing using Dijkstra's algorithm. It finds the shortest paths from a starting vertex to all other vertices in a weighted graph.

## Files

- `ShortestPathRouting.java`: Contains the implementation of the shortest path routing algorithm using Dijkstra's method.

## Instructions

### Compile

1. Open a terminal or command prompt.
2. Navigate to the directory containing `ShortestPathRouting.java`.
3. Compile the Java file:
   ```sh
   javac ShortestPathRouting.java
   ```

### Run

1. Run the compiled Java program:
   ```sh
   java ShortestPathRouting
   ```

### Example Output

```
Vertex	 Distance	Path
0 -> 1 		 4		0 1 
0 -> 2 		 3		0 2 
0 -> 3 		 6		0 1 3 
0 -> 4 		 8		0 1 3 4 
0 -> 5 		14		0 1 3 4 5 
```

### Description

- The program initializes a graph with a specified number of vertices.
- It adds edges between the vertices with given weights.
- It then runs Dijkstra's algorithm from a specified starting vertex (vertex 0 in this case).
- The output displays the shortest path from the starting vertex to each other vertex along with the total distance.

### Customization

- Modify the number of vertices and edges in the `main` method to suit your needs.
- Change the starting vertex by altering the argument in the `dijkstra` method call.
