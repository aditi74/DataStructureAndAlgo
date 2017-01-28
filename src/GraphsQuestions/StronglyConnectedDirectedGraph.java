package GraphsQuestions;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by vikram on 26/1/17.
 * Given a directed graph, find out whether the graph is strongly connected or not. A directed graph is strongly connected if there is a path between any two pair of vertices.
 *
 * For example, following is a strongly connected graph.
 *
 */
public class StronglyConnectedDirectedGraph {

    public static void main(String[] args) {
        Graphs graphs= new Graphs();
        graphs.addVertex(0);
        graphs.addVertex(1);
        graphs.addVertex(2);

        graphs.addEdge(0,1);

        graphs.addEdge(1,2);

        StronglyConnectedDirectedGraph strongConnectedDirectedGraph = new StronglyConnectedDirectedGraph();
        System.out.println( strongConnectedDirectedGraph.checkStronglyConnected(graphs));
    }


    public boolean checkStronglyConnected(Graphs graphs)
    {
        if (DfsTraversal(graphs.adjMatrix,graphs,graphs.graphNodesList.get(0)))
        {
            int[][] revMatrix= transpose(graphs);

           return DfsTraversal(revMatrix,graphs,graphs.graphNodesList.get(0));
        }


return false;

    }


    public ArrayList<Node> getNeighbors(int[][] adjMatrix,int val,Graphs graphs)
    {
        int row=0;
        ArrayList<Node> neighbors= new ArrayList<>();

       for(int i=0;i<adjMatrix.length;i++)
       {
           if (graphs.graphNodesList.get(i).value==val)
           {
               row=i;
               break;
           }


       }

       for (int j=0;j<adjMatrix.length;j++)
       {
           if (adjMatrix[row][j]==1)
            {
               neighbors.add(graphs.graphNodesList.get(j));

            }
       }


        return neighbors;

    }
    //Use Stack
    public boolean DfsTraversal(int[][] adjMat,Graphs graphs,Node node)
    {

        int counter=1;

        Stack<Node> stack= new Stack<>();

        stack.push(node);

        node.isVisted=true;
        while (!stack.isEmpty())
        {
            Node n= stack.pop();
            System.out.println(n.value);
            ArrayList<Node> neighborsNodes= getNeighbors(adjMat,n.value,graphs);
            for (int i=0;i<neighborsNodes.size();i++)
            {
                if (!neighborsNodes.get(i).isVisted)
                {
                    stack.push(neighborsNodes.get(i));
                    neighborsNodes.get(i).isVisted=true;

                    counter=counter+1;
                }

            }


        }
        if (counter==graphs.graphNodesList.size())
             return true;
        else
            return false;
    }



    public int[][] transpose(Graphs graphs)
    {
        //reverse  vertex

        int[][] revadjMatrix = new int[graphs.graphNodesList.size()][graphs.graphNodesList.size()];


        int[][] adjMatrix= graphs.adjMatrix;
        for(int i=0; i<revadjMatrix.length;i++)
        {
            for(int j=0;j<revadjMatrix.length;j++)
            {
                if (adjMatrix[i][j]==1)
                {
                    revadjMatrix[j][i]=1;
                }
            }




        }

        return revadjMatrix;





    }

}
