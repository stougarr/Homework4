package edu.isu.cs2263;

import com.google.common.graph.MutableNetwork;

public interface NetworkNBAVistor {
    public void printRelationship(MutableNetwork<String, String> network, String relationship);
    public void summarizeRelationship(MutableNetwork<String, String> network, String relationship);
}
