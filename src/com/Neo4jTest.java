package com;

import org.neo4j.graphdb.*;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

import java.io.File;
import java.io.IOException;

public class Neo4jTest {
    public static void main(String args[]){

        GraphDatabaseFactory graphDbFactory = new GraphDatabaseFactory();
        GraphDatabaseService graphDb = graphDbFactory.newEmbeddedDatabase(
                new File("data/cars"));
        Transaction tx = graphDb.beginTx();
        try
        {
            Node car = graphDb.createNode(Label.label("Car"));
            car.setProperty("make", "tesla");
            car.setProperty("model", "model3");

            Node owner = graphDb.createNode(Label.label("Person"));
            owner.setProperty("firstName", "baeldung");
            owner.setProperty("lastName", "baeldung");

            Relationship relationship = car.createRelationshipTo( owner, RelationshipType.withName("OWNER") );
            relationship.setProperty( "message", "brave Neo4j " );

            System.out.print( car.getProperty( "model" ) );
            System.out.print( relationship.getProperty( "message" ) );
            System.out.print( owner.getProperty( "firstName" ) );
            // Updating operations go here
            tx.success();
        }
        finally
        {
            tx.close();
        }
    }
}
