package test.mongo;

import com.mongodb.DB;
import com.mongodb.Mongo;

import java.net.UnknownHostException;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12-8-23
 * Time: 下午3:45
 * To change this template use File | Settings | File Templates.
 */
public class QuickTour {

    public static void main(String[] args) {
        try {
//            Mongo m = new Mongo();
            Mongo m = new Mongo( "localhost" , 27017 );

           DB db = m.getDB("test");

            boolean auth = db.authenticate("ajaxj", "eeeeeeee".toCharArray());

           Set<String> colls = db.getCollectionNames();
           for(String s:colls){
               System.out.println(s);
           }

            m.close();

        } catch (UnknownHostException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
