package Graph;// Name: Yuxin Wu (Peter Wu)

import java.util.*;
public class Bipartite {
    public static void main(String[] args) {
        Bipartite test = new Bipartite();
        List<GraphNode> graph = new ArrayList<>();
        GraphNode node1 = new GraphNode(0);
        GraphNode node2 = new GraphNode(0);
        GraphNode node3 = new GraphNode(0);
        GraphNode node4 = new GraphNode(0);

//        graph.add(node1);
//        graph.get(0).neighbors.add(node2);
//        graph.get(0).neighbors.add(node3);
//        node2.neighbors.add(node3);

        graph.add(node1);
        graph.add(node2);
        graph.add(node3);
        graph.add(node4);

        node1.neighbors.add(node3);
        node2.neighbors.add(node4);
        node3.neighbors.add(node1);
        node4.neighbors.add(node2);

        System.out.print(test.isBipartite(graph));
    }

    public boolean isBipartite(List<GraphNode> graph) {
        HashMap<GraphNode, Integer> visited = new HashMap<GraphNode, Integer>();
        for(GraphNode node : graph) {
            if (! BFS(node, visited)) {
                return false;
            }
        }
        return true;
    }

    private boolean BFS(GraphNode node, HashMap<GraphNode, Integer> visited) {
        if (visited.containsKey(node)) {
            return true;
        }

        Queue<GraphNode> queue = new ArrayDeque<GraphNode>();
        queue.offer(node);
        visited.put(node, 0);
        while (!queue.isEmpty()) {
            GraphNode cur = queue.poll();
            int curGroup = visited.get(cur);
            int otherGroup = curGroup == 0 ? 1 : 0;

            for (GraphNode neiNode : cur.neighbors) {
                if (!visited.containsKey(neiNode)) {
                    visited.put(neiNode,otherGroup);
                    queue.offer(neiNode);
                } else if (visited.get(neiNode) != otherGroup) {
                    return false;
                }
             }
        }
        return true;
    }

}
