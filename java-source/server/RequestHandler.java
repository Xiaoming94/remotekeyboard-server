package server;

/**
 * Created by xiaoming on 14/01/16.
 */
public class RequestHandler {
    private static RequestHandler ourInstance;

    public static RequestHandler getInstance() {
        if(ourInstance == null)
            ourInstance = new RequestHandler();
        return ourInstance;
    }

    private RequestHandler() {

    }
}
