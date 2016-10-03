package com.labs.samplemongo;


import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class EntityData {

	private static final String MONGOS_HOSTNAME = "localhost";
	private static final int MONGOD_PORT = 27017;
	private static final String MONGO_DB_NAME = "testmongodb";
	private static final String MONGO_COLLECTION_NAME = "testcollection";

	public void addDocuments(int numberofdocs) {

		String users[] = {"murali", "krishna", "abc", "xyz", "sam", "chris", "ann"};
		String entities[] = {			
			"E040",
			"E045",
			"E050",
			"E053",
			"E056",
			"E059",
			"E062",
			"E065",
			"E071",
			"E074",
			"E077",
			"E080",
			"E083",
			"E086",
			"E089",
			"E092",
			"E095",
			"E098",
			"E101",
			"E104",
			"E107",
			"E110",
			"E113",
			"E116",
			"E119",
			"E145",
			"E149",
			"E153",
			"E161",
			"E164",
			"E168",
			"E174",
			"E175",
			"E181",
			"E188",
			"E189",
			"E190",
			"E199",
			"E203",
			"E207",
			"E211",
			"E215",
			"E219",
			"E223",
			"E227",
			"E230",
			"E233",
			"E237",
			"E241",
			"E246",
			"E249",
			"E255",
			"E259"};
		try {
			MongoClient mongoClient = new MongoClient(MONGOS_HOSTNAME, MONGOD_PORT);
			DB db = mongoClient.getDB(MONGO_DB_NAME);

			DBCollection table = db.getCollection(MONGO_COLLECTION_NAME);
			for(int i=0; i<numberofdocs; i++){
				BasicDBObject document = new BasicDBObject();
				document.put("UserName", users[i%users.length]);
				document.put("EntityID", entities[((int)(Math.random()*10000))%entities.length]);
				table.insert(document);
			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
