package test.couchdb;

import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbConnector;
import org.ektorp.impl.StdCouchDbInstance;

import java.net.MalformedURLException;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12-8-23
 * Time: 下午4:25
 * To change this template use File | Settings | File Templates.
 */
public class QuickTour {

    public static void main(String[] args) {

        HttpClient httpClient = null;
        try {
            httpClient = new StdHttpClient.Builder() .url("http://localhost:5984").username("ajaxj").password("eeeeeeee").build();

            CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
            CouchDbConnector db = new StdCouchDbConnector("mydatabase", dbInstance);
            db.createDatabaseIfNotExists();


        } catch (MalformedURLException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }



    }
}
