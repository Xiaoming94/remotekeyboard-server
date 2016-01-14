package server;

/**
 * Created by xiaoming on 14/01/16.
 */
public class Server implements ServerInterface{
    private String serverName;
    private final RequestHandler handler = RequestHandler.getInstance();

    @Override
    public void startServer() {

    }

    @Override
    public char handleClientRequest() {
        return 0;
    }

    @Override
    public void parseCharacterToKeypress(char key) {

    }
}
