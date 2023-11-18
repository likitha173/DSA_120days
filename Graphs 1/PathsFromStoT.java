import java.util.*;

public class PathsFromStoT {
    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        
        graph[0].add(new Edge(0, 3));
        
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void printPaths(ArrayList<Edge> graph[], int src, int tagt, String path){
        if(src == tagt){
            System.out.println(path + tagt);
            return;
        }
        for(int i=0; i<graph[src].size(); i++){
            Edge e = graph[src].get(i);
            printPaths(graph, e.dest, tagt, path+src);
        }
    }
    
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        int src = 5, tagt = 1;
        printPaths(graph, src, tagt, "");
    }
}
