/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import java.util.ArrayList;


public class P3 {

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
            n0 = new Node(0,1);
            n0.predecessor = n;
            n0.cost = n.cost+10;
            succs.add(n0);
            n1 = new Node(1,9);
            n1.predecessor = n;
            n1.cost = n.cost+4;
            succs.add(n1);
            break;
        case 1:
            n0 = new Node(0,2);
            n0.predecessor = n;
            n0.cost = n.cost+2;
            succs.add(n0);
            n1 = new Node(1,3);
            n1.predecessor = n;
            n1.cost = n.cost+4;
            succs.add(n1);
            break;
        case 2:
            n0 = new Node(0,1);
            n0.predecessor = n;
            n0.cost = n.cost+2;
            succs.add(n0);
            n1 = new Node(1,4);
            n1.predecessor = n;
            n1.cost = n.cost+8;
            succs.add(n1);
            break;
        case 3:
            n0 = new Node(0,1);
            n0.predecessor = n;
            n0.cost = n.cost+4;
            succs.add(n0);
            n1 = new Node(1,5);
            n1.predecessor = n;
            n1.cost = n.cost+6;
            succs.add(n1);
            break;
        case 4:
            n0 = new Node(0,2);
            n0.predecessor = n;
            n0.cost = n.cost+8;
            succs.add(n0);      
            n1 = new Node(1,8);
            n1.predecessor = n;
            n1.cost = n.cost+5;
            succs.add(n1);
            break;
        case 5:
            n0 = new Node(0,3);
            n0.predecessor = n;
            n0.cost = n.cost+6;
            succs.add(n0);
            n1 = new Node(1,6);
            n1.predecessor = n;
            n1.cost = n.cost+3;
            succs.add(n1);
            break;
        case 6:
            n0 = new Node(0,3);
            n0.predecessor = n;
            n0.cost = n.cost+5;
            succs.add(n0);
            n1 = new Node(1,7);
            n1.predecessor = n;
            n1.cost = n.cost+2;
            succs.add(n1);
            break;
        case 7:
            n0 = new Node(0,6);
            n0.predecessor = n;
            n0.cost = n.cost+2;
            succs.add(n0);
            n1 = new Node(1,8);
            n1.predecessor = n;
            n1.cost = n.cost+2;
            succs.add(n1);
            break;
        case 8:
            n0 = new Node(0,7);
            n0.predecessor = n;
            n0.cost = n.cost+2;
            succs.add(n0);
            n1 = new Node(1,4);
            n1.predecessor = n;
            n1.cost = n.cost+5;
            succs.add(n1);
            break;
        case 9:
            n0 = new Node(0,0);
            n0.predecessor = n;
            n0.cost = n.cost+4;
            succs.add(n0);
            n1 = new Node(1,11);
            n1.predecessor = n;
            n1.cost = n.cost+2;
            succs.add(n1);
            n2 = new Node(2,10);
            n2.predecessor = n;
            n2.cost = n.cost+3;
            succs.add(n2);
            break;
        case 10:
            n0 = new Node(0,9);
            n0.predecessor = n;
            n0.cost = n.cost+3;
            succs.add(n0);
            break;
        case 11:
            n0 = new Node(0,9);
            n0.predecessor = n;
            n0.cost = n.cost+2;
            succs.add(n0);
    }
    succ_call_count++;
    return succs;
}

public int heuristic(Node n){
    switch(n.state){
        case 0:
            return 19;
        case 1:
            return 8;
        case 2:
            return 11;
        case 3:
            return 7;
        case 4:
            return 4;
        case 5:
            return 5;
        case 6:
            return 4;
        case 7:
            return 1;
        case 8:
            return 0;
        case 9:
            return 22;
        case 10:
            return 26;
        case 11:
            return 23;
    }
    return -1;
}

}
