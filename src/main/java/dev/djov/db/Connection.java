package dev.djov.db;

import com.couchbase.client.java.Cluster;

public class Connection {
    private static String host="10.30.3.248";
    private static String username="root";
    private static String password="123456";
    private Cluster cluster;
    
    public void createConnection(){
        cluster=Cluster.connect(host, username,password);
    }
    
    public Cluster obtenerConexionCluster(){
        return cluster;
    }

}
