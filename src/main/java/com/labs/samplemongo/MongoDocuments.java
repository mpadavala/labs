package com.labs.samplemongo;


import java.net.UnknownHostException;
import java.util.Date;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class MongoDocuments {
/*
	private static final String MONGOS_HOSTNAME = "localhost";
	private static final int MONGOS_PORT = 40000;
	private static final String MONGO_DB_NAME = "testmongodb";
	private static final String MONGO_COLLECTION_NAME = "testcollection";

	public void addDocuments(int numberofdocs) {

		String users[] = {"murali", "krishna", "abc", "xyz", "sam", "chris", "ann"};
		try {
			MongoClient mongoClient = new MongoClient(MONGOS_HOSTNAME, MONGOS_PORT);
			DB db = mongoClient.getDB(MONGO_DB_NAME);

			DBCollection table = db.getCollection(MONGO_COLLECTION_NAME);
			for(int i=0; i<numberofdocs; i++){
				BasicDBObject document = new BasicDBObject();
				document.put("shardKey", "sheet-"+i+1+System.currentTimeMillis());
				document.put("username", users[i%users.length]);
				document.put("data", "RAW DATA");
				document.put("updated_at", new Date());
				table.insert(document);
				//System.out.println("");
			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	*/
	
}
