/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package edu.isu.cs2263;


import com.google.common.graph.MutableNetwork;
import com.google.common.graph.NetworkBuilder;



public class App {

    public static void main(String[] args) {
        MutableNetwork<String, String> networkNBA = NetworkBuilder.undirected().build();
        networkNBA.addNode("Lebron James");
        networkNBA.addNode("Kevin Durant");
        networkNBA.addNode("Anthony Davis");
        networkNBA.addNode("Kyrie Irving");
        networkNBA.addEdge("Lebron James", "Anthony Davis", "is teammates with");
        networkNBA.addEdge("Kevin Durant", "Lebron James", "is rivals with");
        networkNBA.addEdge("Kyrie Irving", "Lebron James", "used to be teammates with");
        networkNBA.addEdge("Kyrie Irving", "Kevin Durant", "is good friends with");
        NetworkNBADisplayVisitor visitorpattern = new NetworkNBADisplayVisitor();
        visitorpattern.printRelationship(networkNBA, "is teammates with");
        visitorpattern.summarizeRelationship(networkNBA, "is teammates with");


    }
}