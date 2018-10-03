/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import java.util.ArrayList;

public class Problem {

public static final int GOAL_STATE = 8;
    
public static int succ_call_count = 0;

public Boolean goalTest(Node n){
    return n.state == GOAL_STATE;
}
    
public ArrayList<Node> successors(Node n){
    ArrayList<Node> succs = new ArrayList<>();
    Node n0,n1,n2,n3;
    switch(n.state){
        case 0:
            n0 = new Node(0,3);
            n0.predecessor = n;
            succs.add(n0);
            break;
        case 1:
            n0 = new Node(0,4);
            n0.predecessor = n;
            succs.add(n0);
            n1 = new Node(1,2);
            n1.predecessor = n;
            succs.add(n1);
            break;
        case 2:
            // Your code here...
            break;
        case 3:
            // Your code here...
            break;
        case 4:
            // Your code here...
            break;
        case 5:
            // Your code here...
            break;
        case 6:
            // your code here...
            break;
        case 7:
            // Your code here...
            break;
        case 8:
            // Your code here...
            break;
    }
    succ_call_count++;
    return succs;
}
    
}
