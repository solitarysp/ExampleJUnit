package com.lethanh98.examplejunit.repo;

import org.lightcouch.CouchDbClient;

import java.util.Map;

public class ConfigDatabase {
    public static String hostname = "3.0.94.172";
    public static String protocol = "http";
    public static int port = 5984;
    public static String database = "judb";
    public static boolean autoCreate = true;
    static CouchDbClient couchdbclientJUDB = null;
    private static String username = "juad";
    private static String password = "ju123";

    public static String doconnect() throws InterruptedException {
        try {
            ClassLoader ctxClassLoader = Thread.currentThread().getContextClassLoader();
            try {
                couchdbclientJUDB = new CouchDbClient(database, autoCreate, protocol, hostname, port, username, password);

            } finally {
                Thread.currentThread().setContextClassLoader(ctxClassLoader);
            }
        } catch (Throwable e) {
            System.out.println("ERR----------------: " + e);
        }
        return "Connected to DB JUDB!";
    }

    public static void couchdbclientJUDBupdate(Map<String, Object> map) {
        couchdbclientJUDB.update(map);
    }

    public static void couchdbclientJUDBsave(Map<String, Object> map) {
        couchdbclientJUDB.save(map);
    }
}
