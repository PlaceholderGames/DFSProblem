/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import java.util.ArrayList;


public class DFSProblem {

public static final int GOAL_STATE = 8;

public static int succ_call_count = 0;
 
public Boolean goalTest(Node n){
    return n.state == GOAL_STATE;
}

public ArrayList<Node> successors(Node n){
    ArrayList<Node> succs = new ArrayList<Node>();
    Node n0,n1,n2,n3;
    switch(n.state){
        case 0:
            n0 = new Node(0,1);
            n0.predecessor = n;
            succs.add(n0);
            n1 = new Node(1,2);
            n1.predecessor = n;
            succs.add(n1);
            n2 = new Node(2,3);
            n2.predecessor = n;
            succs.add(n2);
            break;
        case 1:
            n0 = new Node(0,4);
            n0.predecessor = n;
            succs.add(n0);
            break;
        case 2:
            n0 = new Node(0,5);
            n0.predecessor = n;
            succs.add(n0);
            break;
        case 3:
            n0 = new Node(0,6);
            n0.predecessor = n;
            succs.add(n0);
            n1 = new Node(1,7);
            n1.predecessor = n;
            succs.add(n1);
            break;
        case 5:
            n0 = new Node(0,8);
            n0.predecessor = n;
            succs.add(n0);
    }
    succ_call_count++;
    return succs;
}

}
