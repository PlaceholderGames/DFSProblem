/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import java.util.ArrayList;

public class P1 {

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
            n0.cost = n.cost+1;
            n0.predecessor = n;
            succs.add(n0);
            break;
        case 1:
            n0 = new Node(0,4);
            n0.cost = n.cost+1;
            n0.predecessor = n;
            succs.add(n0);
            n1 = new Node(1,2);
            n1.cost = n.cost+1;
            n1.predecessor = n;
            succs.add(n1);
            break;
        case 2:
            n3 = new Node(3,1);
            n3.cost = n.cost+1;
            n3.predecessor = n;
            succs.add(n3);
            break;
        case 3:
            n0 = new Node(0,6);
            n0.cost = n.cost+1;
            n0.predecessor = n;
            succs.add(n0);
            n1 = new Node(1,4);
            n1.cost = n.cost+1;
            n1.predecessor = n;
            succs.add(n1);
            n2 = new Node(2,0);
            n2.cost = n.cost+1;
            n2.predecessor = n;
            succs.add(n2);
            break;
        case 4:
            n0 = new Node(0,7);
            n0.cost = n.cost+1;
            n0.predecessor = n;
            succs.add(n0);
            n1 = new Node(1,5);
            n1.cost = n.cost+1;
            n1.predecessor = n;
            succs.add(n1);
            n2 = new Node(2,1);
            n2.cost = n.cost+1;
            n2.predecessor = n;
            succs.add(n2);
            n3 = new Node(3,3);
            n3.cost = n.cost+1;
            n3.predecessor = n;
            succs.add(n3);
            break;
        case 5:
            n0 = new Node(0,8);
            n0.cost = n.cost+1;
            n0.predecessor = n;
            succs.add(n0);
            n3 = new Node(3,4);
            n3.cost = n.cost+1;
            n3.predecessor = n;
            succs.add(n3);
            break;
        case 6:
            n2 = new Node(2,3);
            n2.cost = n.cost+1;
            n2.predecessor = n;
            succs.add(n2);
            break;
        case 7:
            n1 = new Node(1,8);
            n1.cost = n.cost+1;
            n1.predecessor = n;
            succs.add(n1);
            n2 = new Node(2,4);
            n2.cost = n.cost+1;
            n2.predecessor = n;
            succs.add(n2);
            break;
        case 8:
            n2 = new Node(2,5);
            n2.cost = n.cost+1;
            n2.predecessor = n;
            succs.add(n2);
            n3 = new Node(3,7);
            n3.cost = n.cost+1;
            n3.predecessor = n;
            succs.add(n3);
            break;
    }
    succ_call_count++;
    return succs;
}

public int heuristic(Node n){
    switch(n.state){
        case 0:
            return 4;
        case 1:
            return 3;
        case 2:
            return 2; // ?
        case 3:
            return 3;
        case 4:
            return 2;
        case 5:
            return 1;
        case 6:
            return 2; // ?
        case 7:
            return 1;
        case 8:
            return 0;
    }
    return -1;
}

}
