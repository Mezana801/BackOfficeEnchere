package db;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
public class ConnectMongoDB {
    
    public static MongoDatabase getConnect() throws Exception{
//        String url = "mongodb://mongo:EfpChpDdaX9jemvbiLW3@containers-us-west-177.railway.app:6090";
     String url = "mongodb://mongo:EfpChpDdaX9jemvbiLW3@containers-us-west-177.railway.app:6090";
        MongoClient mongoClient = MongoClients.create(url);
        MongoDatabase response = mongoClient.getDatabase("test");
        return response;
        
    }
}
