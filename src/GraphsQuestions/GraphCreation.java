package GraphsQuestions;

import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by vikram on 25/1/17.
 */
public class GraphCreation {

    public static void main(String[] args) {
        //Node node0= new Node(0);

        Graphs graph= new Graphs();
        graph.addEdge(0);
        graph.addEdge(1);
        graph.addEdge(2);
        graph.addEdge(3);
        graph.addEdge(4);


        graph.addVertex(0,4);
        graph.addVertex(0,1);

        graph.addVertex(1,0);
        graph.addVertex(1,4);
        graph.addVertex(1,3);
        graph.addVertex(1,2);

        graph.addVertex(2,1);
        graph.addVertex(2,3);

        graph.addVertex(3,1);
        graph.addVertex(3,4);
        graph.addVertex(3,2);

        graph.addVertex(4,0);
        graph.addVertex(4,1);
        graph.addVertex(4,3);

        GraphCreation graphCreation= new GraphCreation();
        System.out.println(graph.graphNodesList.get(0));
        graphCreation.DfsGraphs(graph,graph.graphNodesList.get(0));




    }



    //Use Stack
    public void DfsGraphs(Graphs graphs,Node node)
    {


        Stack<Node>  stack= new Stack<>();

        stack.push(node);

        node.isVisted=true;
        while (!stack.isEmpty())
        {
            Node n= stack.pop();
            System.out.println(n.value);
            ArrayList<Node> neighborsNodes= graphs.getNeighbors(n.value);
            for (int i=0;i<neighborsNodes.size();i++)
            {
                if (!neighborsNodes.get(i).isVisted)
                {
                    stack.push(neighborsNodes.get(i));
                    neighborsNodes.get(i).isVisted=true;
                }

            }


        }


    }





}
