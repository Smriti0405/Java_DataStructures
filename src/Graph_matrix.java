import java.util.Scanner;

public class Graph_matrix {
    private int adjMatrix[][];
    private int vertices;

    Graph_matrix(int vertices){
        this.vertices = vertices;
        adjMatrix= new int[vertices][vertices];
    }

    public void addEdge(int i, int j){
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1;
    }

    public void removeEdge(int i, int j){
        adjMatrix[i][j] = 0;
        adjMatrix[j][i] = 0;
    }
    public void print(){
        for (int i =0; i< vertices; i++){
            for (int j =0; j< vertices; j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Graph_matrix obj = new Graph_matrix(4);
        obj.addEdge(0, 1);
        obj.addEdge(0, 2);
        obj.addEdge(1, 2);
        obj.addEdge(2, 3);
        obj.print();
    }
}
