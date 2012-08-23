package test.couchdb;


import org.ektorp.support.CouchDbDocument;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12-8-23
 * Time: 下午4:15
 * To change this template use File | Settings | File Templates.
 */
public class BlogPost extends CouchDbDocument {

    private static final long serialVersionUID = 1L;

    private String title;

    private String body;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


}
