package GraphsQuestions;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by vikram on 27/1/17.
 */
public class TopologicalSort {

    public static void main(String[] args) {
        Graphs graphs = new Graphs();

        graphs.addVertex(0); //0
        graphs.addVertex(1); //1
        graphs.addVertex(2);  //2
        graphs.addVertex(3);
        graphs.addVertex(4);
       graphs.addVertex(5);
        graphs.addVertex(6);
        graphs.addVertex(7);


        //adding edges

      graphs.addEdge(0,1);
        graphs.addEdge(0,2);
        graphs.addEdge(2,3);
        graphs.addEdge(4,0);
        graphs.addEdge(5,2);
        graphs.addEdge(6,4);
        graphs.addEdge(6,5);
        graphs.addEdge(7,4);

        TopologicalSort sort= new TopologicalSort();
       // sort.DfsGraphs(graphs,graphs.graphNodesList.get(5));

      //  sort.DFSForDisconnected(graphs);
        sort.topologicalSorting(graphs);


    }


    public void DfsGraphs(Graphs graphs,Node node)
    {


        Stack<Node> stack= new Stack<>();
        Stack<Node> reStack= new Stack<>();

        stack.push(node);

        node.isVisted=true;
        while (!stack.isEmpty())
        {
            Node n= stack.pop();
            reStack.push(n);
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

        while (!reStack.isEmpty())
        {
            System.out.println(reStack.pop().value);
        }


    }

    public void DFSForDisconnected(Graphs graphs)
    {
       for (int i=0;i< graphs.graphNodesList.size();i++)
       {
           if(graphs.graphNodesList.get(i).isVisted==false)
               DFSutil(graphs,i);



       }



    }


    //DFS traversal of a disconnected graph
    public void DFSutil(Graphs graphs,int val)
    {

        graphs.graphNodesList.get(val).isVisted=true;
      //  System.out.println(graphs.graphNodesList.get(val).value);

        Stack<Node> stack= new Stack<>();

        stack.push(graphs.graphNodesList.get(val));

        while (!stack.isEmpty())
        {
            Node removedEle= stack.pop();

            System.out.println(removedEle.value);

            ArrayList<Node> neighbours= graphs.getNeighbors(removedEle.value);

            for (int i=0;i< neighbours.size();i++)
            {
                if(!neighbours.get(i).isVisted)
                {
                    stack.push(neighbours.get(i));
                    neighbours.get(i).isVisted=true;
                }


            }



        }


    }


    public void DfsRecursiveUtil(Graphs graphs,Stack<Node> stack,Node node)
    {

        if (node.isVisted)
             return;
        node.isVisted=true;
        ArrayList<Node> neighbors= graphs.getNeighbors(node.value);

        for (int i=0;i<neighbors.size();i++)
        {
            if (!neighbors.get(i).isVisted)
              DfsRecursiveUtil(graphs,stack,neighbors.get(i));

        }

        stack.push(node);



    }


    public void topologicalSorting(Graphs graphs)
    {

        Stack<Node> stack= new Stack<>();

        for (int i=0;i<graphs.graphNodesList.size();i++)
        {

            if (!graphs.graphNodesList.get(i).isVisted)
                DfsRecursiveUtil(graphs,stack,graphs.graphNodesList.get(i));
        }

        while (!stack.isEmpty())
        {
            System.out.println(stack.pop().value);
        }

    }


}
