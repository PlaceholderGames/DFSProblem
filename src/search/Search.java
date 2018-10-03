/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import java.util.ArrayList;


public class Search {

    
    public static void printNodes(ArrayList<Node> nodes){
        if(nodes.isEmpty())
            System.out.print("empty!");
        else
            for(int i=0;i<nodes.size();i++){
                System.out.print(i+": ");
                nodes.get(i).printNode();
            }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Problem problem = new Problem();
        ArrayList<Node> fringe = new ArrayList<>();
        ArrayList<Node> nodes = new ArrayList<>();
        
        java.io.BufferedReader stdin = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int state = 0;
        System.out.println("Please enter the starting state:");
        try{
            state = Integer.parseInt(stdin.readLine());
        }catch(java.io.IOException e){System.out.println(e);}

        Node startnode = new Node(-1,state); // The action doesn't matter in the start node, so I use -1.        
        fringe.add(startnode);
        
        Node next = null;
        do{

            // Printing the fringe
            //System.out.println("Fringe:");
            //printNodes(fringe);
            //System.out.println("end of fringe");

            // Do your search here...
            next = fringe.remove(0);
            System.out.println("Problem:");
            printNodes(problem.successors(next));
            
            nodes = problem.successors(next);
            
            if(nodes.isEmpty())
                System.out.print("empty!");
            else
                for(int i=0;i<nodes.size();i++){
                    System.out.print(i+": ");
                    fringe.add(nodes.get(i));
                }
            
        }while(!problem.goalTest(next) && !fringe.isEmpty());
 
        if(problem.goalTest(next)){
            System.out.println("Found the goal!");
            System.out.println("Path to goal:");
            next.printPath();
        }
        if(fringe.isEmpty())
            System.out.println("Did not find goal state...");

        System.out.println("Number of calls to the successor function: "+Problem.succ_call_count);
    }
}
