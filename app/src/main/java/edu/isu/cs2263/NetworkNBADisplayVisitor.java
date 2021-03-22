package edu.isu.cs2263;

import com.google.common.graph.EndpointPair;
import com.google.common.graph.MutableNetwork;

import java.util.Iterator;
import java.util.Set;

public class NetworkNBADisplayVisitor implements NetworkNBAVistor {
    public void printRelationship(MutableNetwork<String, String> network, String relationship){
        EndpointPair<String> associatedPeople = network.incidentNodes(relationship);
        String Person1 = associatedPeople.nodeU();
        String Person2 = associatedPeople.nodeV();
        System.out.println(Person1 + " -- " +  relationship + " -- " + Person2);
    }
    public void summarizeRelationship(MutableNetwork<String, String> network, String relationship){
        Set<String> edges = network.edges();
        Iterator<String> itr = edges.iterator();
        int count = 0;
        while (itr.hasNext()){
            if (relationship == itr.next()){
                count++;
            }
        }

        System.out.println("Relationship Type               Count");
        System.out.println("--------------");
        System.out.println(relationship + "                " + count);
    }
}
