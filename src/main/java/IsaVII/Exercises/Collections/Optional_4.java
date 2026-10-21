package IsaVII.Exercises.Collections;

import java.util.HashMap;
import java.util.List;

public class Optional_4 extends Exercise {
    /*
    Represent an undirected graph using a HashMap<String, List<String>>.
    
    Add at least 5 nodes and 6 edges
    Write a method that takes a node name and prints all its neighbours
    Write a second method that checks whether two nodes are directly connected
     */

    @Override
    public void run() {
        exerciseNumber = 21;
        super.run();

        HashMap<String, List<String>> graph = new HashMap<>();
        
        graph.put("A", List.of("B", "C"));
        graph.put("B", List.of("A", "D", "E"));
        graph.put("C", List.of("A", "F"));
        graph.put("D", List.of("B"));
        graph.put("E", List.of("B", "F"));
        graph.put("F", List.of("C", "E"));
        
        printNeighbours(graph, "B");
        IO.println("Are A and B connected? " + areConnected(graph, "A", "B"));
        IO.println("Are A and D connected? " + areConnected(graph, "A", "D"));
        
 
    }
    
    private static void printNeighbours(HashMap<String, List<String>> graph, String node) {
        List<String> neighbours = graph.get(node);
        if (neighbours != null) {
            IO.println("Neighbours of " + node + ": " + neighbours);
        } else {
            IO.println("Node " + node + " not found in the graph.");
        }
    }
    
    private static boolean areConnected(HashMap<String, List<String>> graph, String node1, String node2) {
        List<String> neighbours = graph.get(node1);
        return neighbours != null && neighbours.contains(node2);
    }
}
