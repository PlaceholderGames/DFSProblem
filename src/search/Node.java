/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package search;


public class Node {
    int action;
    int state;
    int cost;
    int heuristic;
    
    Node predecessor;
    
    Node(int a,int s){
        action = a;
        state = s;
    }
    
    void printNode(){
        System.out.println("action "+action+" state "+state+" cost "+cost+" heur "+heuristic);
    }

    void printPath(){
        System.out.println("action "+action+" state "+state+" cost "+cost+" heur "+heuristic);
        if(predecessor==null)
            System.out.println("end of path");
        else
            predecessor.printPath();
    }
}
