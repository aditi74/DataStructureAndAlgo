package GraphsQuestions;

import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.util.ArrayList;

/**
 * Created by vikram on 25/1/17.
 */

class Node{
    int value;
    boolean isVisted;
    Node(int value)
    {
        this.value=value;
        this.isVisted=false;
    }

}
public class Graphs {
    ArrayList<Node> graphNodesList;
    int[][] adjMatrix;
    public int maxVertices=20;
    public int vertexCount;

    public Graphs()
    {

        adjMatrix= new int[maxVertices][maxVertices];
        vertexCount=0;
        for (int i=0;i<maxVertices;i++)
        {
            for (int j=0;j<maxVertices;j++)
            {
                adjMatrix[i][j]=0;
            }
        }
        graphNodesList=new ArrayList<>();

    }

    public void addEdge(int value)
    {
        //graphNodesList
        Node node= new Node(value);
        graphNodesList.add(node);
    }


    public void addVertex(int valA,int valB)
    {
           int start=0;int end=0;

        for (int i=0;i<graphNodesList.size();i++)
        {
            if (graphNodesList.get(i).value==valA)
            {
                start=i;
                break;
            }
        }

        for (int j=0;j<graphNodesList.size();j++)

        {
            if (graphNodesList.get(j).value==valB)
            {
                end=j;
                break;
            }
        }
        adjMatrix[start][end]=1;
    }

    public ArrayList<Node> getNeighbors(int val)
    {
        ArrayList<Node> neighbors= new ArrayList<>();
        int row=0;
        for (int i=0;i<graphNodesList.size();i++)
        {
            if (graphNodesList.get(i).value==val)
            {
                row=i;
                break;
            }
        }

        for (int j=0;j<adjMatrix.length;j++)
        {
            if (adjMatrix[row][j]==1)
            {
                neighbors.add(graphNodesList.get(j));

            }
        }
        return neighbors;
    }


}
