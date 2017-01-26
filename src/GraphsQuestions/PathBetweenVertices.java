package GraphsQuestions;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by vikram on 26/1/17.
 *
 * Find if there is a path between two vertices in a directed graph
 Given a Directed Graph and two vertices in it, check whether there is a path from the first given vertex to second. For example, in the following graph, there is a path from vertex 1 to 3.

 As another example, there is no path from 3 to 0.
 */
public class PathBetweenVertices {


    public static void main(String[] args) {
        Graphs graphs = new Graphs();
        graphs.addEdge(0);//0
        graphs.addEdge(1);//1
        graphs.addEdge(2);//2
        graphs.addEdge(3);//3

        graphs.addVertex(0,1);
        graphs.addVertex(0,2);

        graphs.addVertex(2,0);
        graphs.addVertex(2,3);

        graphs.addVertex(3,3);


     PathBetweenVertices pathBetweenVertices= new PathBetweenVertices();
      boolean value=  pathBetweenVertices.connectivityBetweenVertices(graphs.graphNodesList.get(3),graphs.graphNodesList.get(0),graphs);
        System.out.println(value);
    }


    public boolean connectivityBetweenVertices(Node a, Node b,Graphs graph)
    {
       //Dfs to see what all is reachable

        Stack<Node> stack= new Stack<>();
        stack.push(a);
        a.isVisted=true;

        while (!stack.isEmpty()) {
            Node nodeVisited= stack.pop();

            ArrayList<Node> neighbors= graph.getNeighbors(nodeVisited.value);

            for (int i=0;i<neighbors.size();i++)
            {
                if (neighbors.get(i).value==  b.value)
                    return true;
                if (!neighbors.get(i).isVisted){
                    neighbors.get(i).isVisted=true;
                    stack.push(neighbors.get(i));
                }


            }



        }


        return false;





    }
}
