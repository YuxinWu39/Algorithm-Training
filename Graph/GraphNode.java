package Graph;// Name: Yuxin Wu (Peter Wu)

import java.util.ArrayList;
import java.util.List;

// VUnetID: wuy45
// Email: yuxin.wu@vanderbilt.edu
// Class: CS 1101 - Vanderbilt University
// Section: 02 (TR Singh)
//
// Program description: This program is designed to output the interstate highway numbers.
// Date: 25th Sep
// Honor statement: I have neither given nor received any unauthorized aid on this assignment.
public class GraphNode {
    public int key;
    public List<GraphNode> neighbors;
    public GraphNode(int key) {
        this.key = key;
        this.neighbors = new ArrayList<>();
    }
}
